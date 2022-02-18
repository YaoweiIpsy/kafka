package com.bfa.kafka.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.bfa.kafka.models.KafkaEvent;
import com.bfa.kafka.models.KafkaRecord;
import com.bfa.models.tables.pojos.Author;
import com.bfa.models.tables.records.AuthorRecord;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.UpdatableRecord;
import org.jooq.impl.DSL;

public class Main implements KafkaRequestHandler<String, Void> {

  @Override
  public Void handleRequest(List<KafkaRecord<String>> input, Context context) {
    var aa = input.stream().map((record) -> record.getValue()).collect(Collectors.joining());
    System.out.println(aa);
    return null;
  }
  static class MyAuthor {
    public int id;
    public String firstName;
    public String lastName;
  }
  public static void main(String[] argv) throws Exception {
    // 用户名
    String userName = "yaowei";
    // 密码
    String password = "secret";
    // mysql连接url
    String url = "jdbc:mysql://localhost:3306/next_graphql_admin?useUnicode=true&characterEncoding=UTF-8";
//    DefaultTransformation<AuthorRecord, Author> transformation = new DefaultTransformation<>();
//    Author author = new Author(1, "f","l");
//    var aa = transformation.handler(null, author);
//    System.out.println(aa);
    // Connection is the only JDBC resource that we need
    // PreparedStatement and ResultSet are handled by jOOQ, internally
    try (Connection conn = DriverManager.getConnection(url, userName, password)) {
      DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
      Map<String,Object> map = new HashMap<>();
      map.put("id", 1);
      map.put("firstName", "Li");
      map.put("last_name", "Franklin");

//      MyAuthor author = new MyAuthor();
//      author.id = 1;
//      author.firstName = "li";
//      author.lastName = "elaine";
      var re =new AuthorRecord();
      re.fromMap(map);
//      var re = create.newRecord(Author.AUTHOR, author);
      create.batchMerge(re).execute();
//      create.batch

    }
    // For the sake of this tutorial, let's keep exception handling simple
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
