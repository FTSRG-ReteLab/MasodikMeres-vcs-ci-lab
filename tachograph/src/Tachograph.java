import com.google.common.collect.Table;
import com.google.errorprone.annotations.CompatibleWith;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by meres on 2/26/18.
 */
public class Tachograph implements Table {

   int speed;
   int position;
   int time;

    public Tachograph(int time,int position,int speed){
        this.time = time;
        this.speed = speed;
        this.position = position;
    }

    @Override
    public boolean contains(@NullableDecl @CompatibleWith("R") Object o, @NullableDecl @CompatibleWith("C") Object o1) {
        return false;
    }

    @Override
    public boolean containsRow(@NullableDecl @CompatibleWith("R") Object o) {
        return false;
    }

    @Override
    public boolean containsColumn(@NullableDecl @CompatibleWith("C") Object o) {
        return false;
    }

    @Override
    public boolean containsValue(@NullableDecl @CompatibleWith("V") Object o) {
        return false;
    }

    @Override
    public Object get(@NullableDecl @CompatibleWith("R") Object o, @NullableDecl @CompatibleWith("C") Object o1) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object put(Object o, Object o2, Object o3) {
        return null;
    }

    @Override
    public void putAll(Table table) {

    }

    @Override
    public Object remove(@NullableDecl @CompatibleWith("R") Object o, @NullableDecl @CompatibleWith("C") Object o1) {
        return null;
    }

    @Override
    public Map row(Object o) {
        return null;
    }

    @Override
    public Map column(Object o) {
        return null;
    }

    @Override
    public Set<Cell> cellSet() {
        return null;
    }

    @Override
    public Set rowKeySet() {
        return null;
    }

    @Override
    public Set columnKeySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Map rowMap() {
        return null;
    }

    @Override
    public Map columnMap() {
        return null;
    }
}
