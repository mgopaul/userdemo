'use strict'
angular.module('userdemo.services', []).factory('UserService',
    ["$http", "CONSTANTS", function ($http, CONSTANTS) {
      var service = {};
      service.saveUser = function (userDao) {
        return $http.post(CONSTANTS.saveUser, userDao);
      }
      service.getUserById = function (userId) {
        var url = CONSTANTS.getUserByIdUrl + userId;
        return $http.get(url);
      }
      service.getAllUsers = function () {
        return $http.get(CONSTANTS.getAllUsers);
      }
      return service;
    }]);