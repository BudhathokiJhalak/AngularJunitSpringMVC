app.controller("HomeCtrl", function ($scope, studentService) {
    $scope.students = studentService.getAll();
    $scope.student = {};
    $scope.showAddDialog = function () {
        $("#dialog").show();
    };
    $scope.saveStudent = function () {
        if ($scope.students.length == 0) {
            $scope.student.id = 1;
        } else {
            $scope.student.id = $scope.students[$scope.students.length - 1].id + 1;
        }
        studentService.insert($scope.student);
        $scope.student = {};
    };
});