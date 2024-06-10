# Sample Spring AI Application 


* Bedrock llama2
* OpenAI

### AWS credentials 
Set the AWS credentials generated through the AWS Console before running the application.
These credentials would be required to communicate with AWS Bedrock service.
Below are the path

```On Windows: C:\Users\username\.aws\credentials```

```On Mac/Linux: ~/.aws/credentials```

paste below content in credetials file and replace the placeholder with your keys
```agsl
[default]
aws_access_key_id = <YOUR_ACCESS_KEY>
aws_secret_access_key = <YOUR_SECRET_KEY>

```

Sample curl
```shell
curl --location 'http://localhost:8080/bedrock/ai/chat?message=what%20is%20your%20name'
```

