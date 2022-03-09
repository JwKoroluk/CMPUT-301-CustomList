import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCity(){
        list.addCity(new City("TestCity","MN"));
        assertEquals(list.getItem(list.getCount()-1 ),"TestCity");
    }

    @Test
    public void deleteCity(){
        City testCity = new City("Halifax", "NS")
        list.addCity(testCity);
        int listSize = list.getCount();
        list.delCity(testCity);
        assertEquals(list.getCount(), listSize - 1);
    }
}
