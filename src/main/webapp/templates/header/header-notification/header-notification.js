'use strict';

/**
 * @ngdoc directive
 * @name izzyposWebApp.directive:adminPosHeader
 * @description
 * # adminPosHeader
 */
angular.module('baseSimpleFinanceApp')
        .directive('headerNotification', function () {
            return {
                templateUrl: 'templates/header/header-notification/header-notification.html',
                restrict: 'E',
                replace: true,
            }
        });


