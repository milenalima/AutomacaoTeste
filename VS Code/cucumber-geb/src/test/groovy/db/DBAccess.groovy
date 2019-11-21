package db

import geb.ConfigurationLoader
import groovy.sql.Sql

class DBAccess {

   def config

   def user
   def password
   def url
   def driver

   public DBAccess(file){
      config = new Properties()
      file.withInputStream {
         stream -> config.load(stream)
      }
      driver="oracle.jdbc.driver.OracleDriver"
      configAccess()
   }

   def isConfigured(){
      config.user && config.password && config.url
   }

   def isReady(){
     if(!isConfigured()){
        throw new RuntimeException("There is no configured connection, check your database.properties")
     }
   }

   private def configAccess(){
     user=config.user
     password=config.password
     url=config.url
     println "Data base access configured for: user=$user password=$password url=$url"
   }

   def initialize(user, password, url){
     this.user=user
     this.password=password
     this.url=url
     if(!isConfigured()){
       configAccess()

     }
   }

   def execute(sqlStatement){
     isReady()
     Sql.withInstance(url, user, password, driver) { sql ->
        sql.execute(sqlStatement)
     }
   }

   def query(sqlStatement){
     isReady()
     def result = []
     Sql.withInstance(url, user, password, driver) { sql ->
       sql.eachRow(sqlStatement) { row ->
          result << row
       }
     }
     result
   }
}
