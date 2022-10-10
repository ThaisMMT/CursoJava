package com.thais.estudos.teste.jdbc.listener;

import com.mysql.cj.result.Row;
import lombok.extern.log4j.Log4j2;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

@Log4j2
public class CustomRowSetListerner implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Command Execute treggered");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("Row inserted, updated or deleted");
        if (event.getSource() instanceof RowSet){
            try {
                ((RowSet) ((RowSet) event.getSource())).execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void cursorMoved(RowSetEvent event) {

    }
}
