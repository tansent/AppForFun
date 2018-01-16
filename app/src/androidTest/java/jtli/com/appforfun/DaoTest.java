package jtli.com.appforfun;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import jtli.com.appforfun.db.OrderDAO;

/**
 * Created by Jingtian(Tansent).
 */
@RunWith(AndroidJUnit4.class)
@MediumTest
public class DaoTest {

    private Context instrumentationCtx;
    OrderDAO dao;
    @Before
    public void setup() {
        instrumentationCtx = InstrumentationRegistry.getContext();
    }

    @Test
    public void createDao() throws Exception {
        dao  = new OrderDAO(instrumentationCtx);
    }

    @Test
    public void addOrder() throws Exception {
        dao  = new OrderDAO(instrumentationCtx);
        dao.addOrder("first order", 20.0);
        dao.addOrder("second order", 10.0);
    }

}
