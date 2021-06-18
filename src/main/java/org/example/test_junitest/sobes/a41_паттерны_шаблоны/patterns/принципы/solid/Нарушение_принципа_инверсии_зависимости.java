package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.принципы.solid;

import com.mysql.cj.MysqlConnection;

import java.sql.Connection;

public class Нарушение_принципа_инверсии_зависимости {

  // класс логики зависит
    // от подключения и если мы поменяем
    // подключение или базу то менять весь класс или новый

    class PasswordReminder{
        private MysqlConnection connection;
        public PasswordReminder(MysqlConnection connection){
            this.connection = connection;
        }
    }
//решение создать абстракцию которая
// * передает объект подключения
    interface DBConnectionInterface{
        public Connection connect();
}
class MySqlConnection implements DBConnectionInterface{

    @Override
    public Connection connect() {
        //connect to MySql
        return null;
    }
}
class NewPsswordReminder{
        private Connection connection;
        public NewPsswordReminder(DBConnectionInterface connection){

          this.connection= connection.connect();


        }



    }
}
