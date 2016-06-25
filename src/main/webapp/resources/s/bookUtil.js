function _BookUtil() {
    this.deleteBook = function (id) {
        if (confirm("Are u sure about this?")) {
            window.location = "/deleteBook/" + id;
        }
    }
}
var BookUtil = new _BookUtil();