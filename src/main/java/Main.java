import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Date;

/**
 * Created by Claudio on 30/04/16.
 */
public class Main {

    public static void main(String[] args) {

        try {
            MongoClient mongo = new MongoClient( "localhost" , 27017 );

            DB db = mongo.getDB("testDB");

            DBCollection table;
            table = db.getCollection ("clienti");

            //Insert document
            BasicDBObject document = new BasicDBObject();
            document.put("name", "mkyong");
            document.put("age", 30);
            document.put ("createdDate", new Date ( ));
            table.insert(document);

            /**** Find and display ****/
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("name", "mkyong");

            DBCursor cursor = table.find(searchQuery);

            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }



        } catch (UnknownHostException e) {
            e.printStackTrace ( );
        } catch (MongoException e) {
            e.printStackTrace();
        }



    }

}
