app.factory("studentService", function () {

    return {
        studentList: [],
        insert: function (student) {
            this.studentList.push(student);
        },
        getAll: function () {
            return this.studentList;
        }
    };
});