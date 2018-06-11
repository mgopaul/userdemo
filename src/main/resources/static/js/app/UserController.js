'use strict'

var module = angular.module('userdemo.controllers', []);

module.controller("UserController", ["$scope", "UserService",
  function ($scope, UserService) {
    $scope.userDao = {
      userId: null,
      userName: null,
      messageDaos: []
    };

    $scope.messages = [];
    if ($scope.userId != null) {

      UserService.getUserById($scope.userId).then(function (value) {
        console.log(value.data);
      }, function (reason) {
        console.log("error occured");
      }, function (value) {
        console.log("no callback");
      });
    }

    $scope.saveUser = function () {
      $scope.userDao.messageDaos = $scope.messages.map(message => {
        return {
          messageId: null,
          content: message.content
        };
      });

      UserService.saveUser($scope.userDao).then(function () {
        UserService.getAllUsers().then(function (value) {
          $scope.allUsers = value.data;
        }, function (reason) {
          console.log("error occured");
        }, function (value) {
          console.log("no callback");
        });
        $scope.messages = [];
        $scope.userDao = {
          userId: null,
          userName: null,
          messageDaos: []
        };
      }, function (reason) {
        console.log("error occured");
      }, function (value) {
        console.log("no callback");
      });
    }
  }
]);