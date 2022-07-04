package database

import model.UserData

class UserDatabaseImpl : UserDatabase {

    private val userList = mutableListOf(
        UserData(id = 1, name = "Rico", username = "jericho", password = "password", address = "Trenggalek"),
        UserData(id = 2, name = "Prizuri", username = "prizuri", password = "12345678"),
    )

    override fun findAllUser(): List<UserData> = userList

    override fun findUser(username: String): UserData? {
//       for (position in 0 .. userList.size){
//           val selectedUserToCheck = userList[position]
//           if(selectedUserToCheck.username.equals(username, true)) {
//               return selectedUserToCheck
//           }
//       }
//        return null

//        userList.forEach{
//            if(it.username.equals(username, true)){
//                return it
//            }
//        }
//        return null

        // lamda
//        userList.forEach { selectedUserToCheck ->
//            if (selectedUserToCheck.username.equals(username, true)){
//                return selectedUserToCheck
//            }
//        }
//
//        return null

            return userList.find {
                it.username.equals(username, true)
            }


    }

    override fun registerUser(data: UserData) {
        userList.add(data)
    }
}