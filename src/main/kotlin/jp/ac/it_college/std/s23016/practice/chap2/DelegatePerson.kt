package jp.ac.it_college.std.s23016.practice.chap2

class DelegatePerson {
    var name: String by DelegateWithMessage()
    var address: String by DelegateWithMessage()

}