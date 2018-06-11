'use strict'
var userdemoApp = angular.module('userdemo', ['ui.bootstrap', 'userdemo.controllers',
  'userdemo.services'
]);
userdemoApp.constant("CONSTANTS", {
  getUserByIdUrl: "/user/getUser/",
  getAllUsers: "/user/getAllUsers",
  saveUser: "/user/saveUser"
});