package com.eduonix.solr;

/**
 * Created by Chandan on 25/12/16.
 */
public enum CONFIG {

    SOLR_DATA("/temp.tsv"),
    SOLR_HOST("http://localhost:8983/solr/"),
    SOLR_HOST_INDEX("concepts_index");


    private   String gridAttribute;

    CONFIG(String attribute) {
        this.gridAttribute = attribute;
    }

    public String getAttribute() {
        return gridAttribute;
    }
}
