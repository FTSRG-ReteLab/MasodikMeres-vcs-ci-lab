import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CompatibleWith;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by meres on 2/26/18.
 */
public class Tachograph{

   Table<Integer,Integer,Integer> table;

    public Tachograph(int time,int position,int speed){

        Table<Integer,Integer,Integer> table = HashBasedTable.create();
        table.put(time,position,speed);
    }
    public int getTabelSize(){
        return table.size();
    }

}
