#POST 

/api/v1/parsed-web-data/categories

#Get website(s) categories based on provided url(s)

Implementation Notes

Returns list of categories as per provided url(s)

Request Parameters:
[
    {
        "inputUrl": "string"
    }
]

Response Class

(Status 200)

Model Schema

[
    {
        "categories": [
        "string"
        ],
        "inputUrl": "string"
    }
]

200 - successfully retrieved

401 - Not found - The url was incorrect or null


--------------------------------------------------
#POST

/api/v1/urls

#Get plain text from html by provided url

Request Parameters

[
    {
        "inputUrl": "string"
    }
]

Response Class (Status 200)

Model Schema
[
    {
        "textResult": "string",
        "url": "string"
    }
]

200 - successfully retrieved

401 - Not found - The url was incorrect or null
