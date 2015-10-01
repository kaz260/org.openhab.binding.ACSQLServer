# OPENHAB

The SQLServer binding allows openHAB to act as an SQLServer client, so that openHAB items can store and retrieve to/from an SQLServer. To install, place this bundle in the folder ${openhab_home}/addons and add binding information to your configuration. See the following sections on how to do this.

# Binding Configuration
acsqlserver:url=jdbc:sqlserver://192.168.8.1:1433;databaseName\=<database_name>;
acsqlserver:user=<user_name>
acsqlserver:password=<password>

# Items Configuration 
Number DATA1 {acsqlserver="<[SELECT value FROM table WHERE id=1]"}
Number DATA2 {acsqlserver="<[SELECT value FROM table WHERE id=1, >[UPDATE table SET value=? WHERE id=1]"}

# Sitemap Configuration
Setpoint item=DATA1 minValue=100 maxValue=200 step=10
