1.Start LocalConfigServerApplication
or
GitConfigServerApplication

Check -
http://localhost:8989/my-client-config/default
or
http://localhost:8989/my-client-config/development
or even:
http://localhost:8989/my-client-config/xxx

!!! credentials: myname/mypass   !!!!!

2. Start ConfigClient

3. call http://127.0.0.1:9999/myclient/message/1

expected message if LocalConfigServerApplication :
'message from local default config'

expected message if GitConfigServerApplication :
'message from git default config'

4. call http://127.0.0.1:9999/myclient/message/2
expected message if LocalConfigServerApplication :
'message from local development config'

expected message if GitConfigServerApplication :
'message from git development config'