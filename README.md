Endpoint : POST /api/users

Request Body :

{
  "name" : "Yudha Putra Ramadhan",
  "age" : 25
}
Response Body (success) :

{
  "data": {
    "id" : "random string",
    "name": "Yudha Putra Ramadhan",
    "age": 25
  }
}
Response Body (failed) :

{
  "error": "Invalid input data"
}
Update User
Endpoint : PUT /api/users/{id}

Request Body :

{
  "nama" : "Yudha Ramadhan",
  "usia" : 21
}
Response Body (success) :

{
  "data": {
    "id" : "random string",
    "nama": "Yudha Ramadhan",
    "usia": 21
  }
}
Response Body (failed) :

{
  "error": "User not found"
}
Get User
Endpoint : GET /api/users

Response Body (success) :

{
  "data": {
    "id" : "random string",
    "nama": "Yudha Putra Ramadhan",
    "usia": 25
  },
    "id" : "random string",
    "nama": "Yudha Ramadhan",
    "usia": 21
}
Response Body (failed) :

{
  "error": "User not found"
}
Delete User
Endpoint : DELETE /api/users/{id}

Response Body (success) :

{
  "message": "User deleted successfully"
}
Response Body (failed) :

{
  "error": "User not found"
}

SCREENSHOT HASIL PRAKTIKUM

<img width="1920" height="992" alt="image" src="https://github.com/user-attachments/assets/96ca12b1-59db-408a-8d16-00657702e7d5" />
<img width="1920" height="1041" alt="image" src="https://github.com/user-attachments/assets/34fd9d83-877d-4c5b-9095-62a0e1958898" />
