package com.eduonix.hadoop.partone;

import com.eduonix.hadoop.partone.pig.PigETL;
import org.apache.pig.ExecType;

/**
 * Created by Chandan on 23.12.16.
 */
public class PigRunner {


    private static final boolean  isLocal = false;//when on server

    public static void main(String[] args) {


       PigETL pigETL = null;

        try {
            pigETL = new PigETL(isLocal, ExecType.LOCAL);

            // loads data into hdfs use this first
              pigETL.loadData();
            // loads data into mongo use this second
         //     pigETL.transformData();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
