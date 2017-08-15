package com.dedykuncoro.searchviewmysql.model

/**
 * Created by KUNCORO on 16/08/2016.
 * www.dedykuncoro.com
 */

class DataModel {
    var id: String? = null
    var nama: String? = null

    constructor() {}

    constructor(id: String, nama: String) {
        this.id = id
        this.nama = nama
    }
}
