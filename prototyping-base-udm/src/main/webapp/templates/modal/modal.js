'use strict';
angular.module('baseApp').directive('modal', ['$location', '$http',
    function () {
        return {
            templateUrl: 'templates/modal/modal.html',
            restrict: 'E',
            replace: true,
            tranclude: true
        };
    }
]);
