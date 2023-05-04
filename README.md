# FileSaverBot
Telegram bot for saving files to local machine


## How to use:
For using this app you need add environment variables.
1.     export BOT_TOKEN=YourTelegramBotToken
2.     export BOT_USERNAME=YourTelegramBotName
3.     export SAVE_PATH=PathInYourMachineWhereYouWantSave
4.     export USER_ADDRESSES=AddressOfYourAccount
>You can find address of your account in https://t.me/getmyid_bot. Also you can add few accounts using ','.
5.     mvn package
6.     java -jar FileSaver-1.0.1.jar

