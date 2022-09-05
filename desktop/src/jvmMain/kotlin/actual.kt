package com.surrus.common.repository

import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver
import com.surrus.quizinfo.db.Kanji
import com.surrus.quizinfo.db.NihongoQueries
import com.surrus.quizinfo.db.TestDatabase

fun platformModule() {

        val driver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY).also { TestDatabase.Schema.create(it) }
//            .also { PeopleInSpaceDatabase.Schema.create(it) }
//        PeopleInSpaceDatabaseWrapper(PeopleInSpaceDatabase(driver))
    }
