package modelling.android.mathmodellinglab3.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import modelling.android.mathmodellinglab3.database.LaplasDbSchema.Laplas1Table;
import modelling.android.mathmodellinglab3.database.LaplasDbSchema.Laplas2Table;

public class LaplasBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "laplasBase.db";



    public LaplasBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Laplas1Table.NAME + "(" +
                "_id integer primary key autoincrement," +
                Laplas1Table.Cols.X + ", " +
                Laplas1Table.Cols.FX +
                ")"
        );
        insertLaplasTable(db, Laplas1Table.NAME, argX1, fx1);

        db.execSQL("create table " + Laplas2Table.NAME + "(" +
                "_id integer primary key autoincrement," +
                Laplas2Table.Cols.X + ", " +
                Laplas2Table.Cols.FX +
                ")"
        );
        insertLaplasTable(db, Laplas2Table.NAME, argX2, fx2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static void insertLaplasTable(SQLiteDatabase db, String tableName, double[] x, double[] fx) {
        ContentValues laplasValues = new ContentValues();
        for(int i = 0; i < x.length; i++) {
            laplasValues.put("argX", x[i]);
            laplasValues.put("fx", fx[i]);
            db.insert(tableName, null, laplasValues);
        }
    }

    private double[] argX1 = new double[]{
            0.00,
            0.01,
            0.02,
            0.03,
            0.04,
            0.05,
            0.06,
            0.07,
            0.08,
            0.09,
            0.10,
            0.11,
            0.12,
            0.13,
            0.14,
            0.15,
            0.16,
            0.17,
            0.18,
            0.19,
            0.20,
            0.21,
            0.22,
            0.23,
            0.24,
            0.25,
            0.26,
            0.27,
            0.28,
            0.29,
            0.30,
            0.31,
            0.32,
            0.33,
            0.34,
            0.35,
            0.36,
            0.37,
            0.38,
            0.39,
            0.40,
            0.41,
            0.42,
            0.43,
            0.44,
            0.45,
            0.46,
            0.47,
            0.48,
            0.49,
            0.50,
            0.51,
            0.52,
            0.53,
            0.54,
            0.55,
            0.56,
            0.57,
            0.58,
            0.59,
            0.60,
            0.61,
            0.62,
            0.63,
            0.64,
            0.65,
            0.66,
            0.67,
            0.68,
            0.69,
            0.70,
            0.71,
            0.72,
            0.73,
            0.74,
            0.75,
            0.76,
            0.77,
            0.78,
            0.79,
            0.80,
            0.81,
            0.82,
            0.83,
            0.84,
            0.85,
            0.86,
            0.87,
            0.88,
            0.89,
            0.90,
            0.91,
            0.92,
            0.93,
            0.94,
            0.95,
            0.96,
            0.97,
            0.98,
            0.99,
            1.00,
            1.01,
            1.02,
            1.03,
            1.04,
            1.05,
            1.06,
            1.07,
            1.08,
            1.09,
            1.10,
            1.11,
            1.12,
            1.13,
            1.14,
            1.15,
            1.16,
            1.17,
            1.18,
            1.19,
            1.20,
            1.21,
            1.22,
            1.23,
            1.24,
            1.25,
            1.26,
            1.27,
            1.28,
            1.29,
            1.30,
            1.31,
            1.32,
            1.33,
            1.34,
            1.35,
            1.36,
            1.37,
            1.38,
            1.39,
            1.40,
            1.41,
            1.42,
            1.43,
            1.44,
            1.45,
            1.46,
            1.47,
            1.48,
            1.49,
            1.50,
            1.51,
            1.52,
            1.53,
            1.54,
            1.55,
            1.56,
            1.57,
            1.58,
            1.59,
            1.60,
            1.61,
            1.62,
            1.63,
            1.64,
            1.65,
            1.66,
            1.67,
            1.68,
            1.69,
            1.70,
            1.71,
            1.72,
            1.73,
            1.74,
            1.75,
            1.76,
            1.77,
            1.78,
            1.79,
            1.80,
            1.81,
            1.82,
            1.83,
            1.84,
            1.85,
            1.86,
            1.87,
            1.88,
            1.89,
            1.90,
            1.91,
            1.92,
            1.93,
            1.94,
            1.95,
            1.96,
            1.97,
            1.98,
            1.99,
            2.00,
            2.02,
            2.04,
            2.06,
            2.08,
            2.10,
            2.12,
            2.14,
            2.16,
            2.18,
            2.20,
            2.22,
            2.24,
            2.26,
            2.28,
            2.30,
            2.32,
            2.34,
            2.36,
            2.38,
            2.40,
            2.42,
            2.44,
            2.46,
            2.48,
            2.50,
            2.52,
            2.54,
            2.56,
            2.58,
            2.60,
            2.62,
            2.64,
            2.66,
            2.68,
            2.70,
            2.72,
            2.74,
            2.76,
            2.78,
            2.80,
            2.82,
            2.84,
            2.86,
            2.88,
            2.90,
            2.92,
            2.94,
            2.96,
            2.98,
            3.00,
            3.05,
            3.10,
            3.15,
            3.20,
            3.25,
            3.30,
            3.35,
            3.40,
            3.45,
            3.50,
            3.55,
            3.60,
            3.65,
            3.70,
            3.75,
            3.80,
            3.85,
            3.90,
            3.95,
            4.00,
            4.05,
            4.10,
            4.15,
            4.20,
            4.25,
            4.30,
            4.35,
            4.40,
            4.45,
            4.50,
            4.55,
            4.60,
            4.65,
            4.70,
            4.75,
            4.80,
            4.85,
            4.90,
            4.95,
            5.00
    };

    private double[] fx1 = new double[]{
            0.00000,
            0.00399,
            0.00798,
            0.01197,
            0.01595,
            0.01994,
            0.02392,
            0.02790,
            0.03188,
            0.03586,
            0.03983,
            0.04380,
            0.04776,
            0.05172,
            0.05567,
            0.05962,
            0.06356,
            0.06749,
            0.07142,
            0.07535,
            0.07926,
            0.08317,
            0.08706,
            0.09095,
            0.09483,
            0.09871,
            0.10257,
            0.10642,
            0.11026,
            0.11409,
            0.11791,
            0.12172,
            0.12552,
            0.12930,
            0.13307,
            0.13683,
            0.14058,
            0.14431,
            0.14803,
            0.15173,
            0.15542,
            0.15910,
            0.16276,
            0.16640,
            0.17003,
            0.17364,
            0.17724,
            0.18082,
            0.18439,
            0.18793,
            0.19146,
            0.19497,
            0.19847,
            0.20194,
            0.20540,
            0.20884,
            0.21226,
            0.21566,
            0.21904,
            0.22240,
            0.22575,
            0.22907,
            0.23237,
            0.23565,
            0.23891,
            0.24215,
            0.24537,
            0.24857,
            0.25175,
            0.25490,
            0.25804,
            0.26115,
            0.26424,
            0.26730,
            0.27035,
            0.27337,
            0.27637,
            0.27935,
            0.28230,
            0.28524,
            0.28814,
            0.29103,
            0.29389,
            0.29673,
            0.29955,
            0.30234,
            0.30511,
            0.30785,
            0.31057,
            0.31327,
            0.31594,
            0.31859,
            0.32121,
            0.32381,
            0.32639,
            0.32894,
            0.33147,
            0.33398,
            0.33646,
            0.33891,
            0.34134,
            0.34375,
            0.34614,
            0.34849,
            0.35083,
            0.35314,
            0.35543,
            0.35769,
            0.35993,
            0.36214,
            0.36433,
            0.36650,
            0.36864,
            0.37076,
            0.37286,
            0.37493,
            0.37698,
            0.37900,
            0.38100,
            0.38298,
            0.38493,
            0.38686,
            0.38877,
            0.39065,
            0.39251,
            0.39435,
            0.39617,
            0.39796,
            0.39973,
            0.40147,
            0.40320,
            0.40490,
            0.40658,
            0.40824,
            0.40988,
            0.41149,
            0.41309,
            0.41466,
            0.41621,
            0.41774,
            0.41924,
            0.42073,
            0.42220,
            0.42364,
            0.42507,
            0.42647,
            0.42785,
            0.42922,
            0.43056,
            0.43189,
            0.43319,
            0.43448,
            0.43574,
            0.43699,
            0.43822,
            0.43943,
            0.44062,
            0.44179,
            0.44295,
            0.44408,
            0.44520,
            0.44630,
            0.44738,
            0.44845,
            0.44950,
            0.45053,
            0.45154,
            0.45254,
            0.45352,
            0.45449,
            0.45543,
            0.45637,
            0.45728,
            0.45818,
            0.45907,
            0.45994,
            0.46080,
            0.46164,
            0.46246,
            0.46327,
            0.46407,
            0.46485,
            0.46562,
            0.46638,
            0.46712,
            0.46784,
            0.46856,
            0.46926,
            0.46995,
            0.47062,
            0.47128,
            0.47193,
            0.47257,
            0.47320,
            0.47381,
            0.47441,
            0.47500,
            0.47558,
            0.47615,
            0.47670,
            0.47725,
            0.47831,
            0.47932,
            0.48030,
            0.48124,
            0.48214,
            0.48300,
            0.48382,
            0.48461,
            0.48537,
            0.48610,
            0.48679,
            0.48745,
            0.48809,
            0.48870,
            0.48928,
            0.48983,
            0.49036,
            0.49086,
            0.49134,
            0.49180,
            0.49224,
            0.49266,
            0.49305,
            0.49343,
            0.49379,
            0.49413,
            0.49446,
            0.49477,
            0.49506,
            0.49534,
            0.49560,
            0.49585,
            0.49609,
            0.49632,
            0.49653,
            0.49674,
            0.49693,
            0.49711,
            0.49728,
            0.49744,
            0.49760,
            0.49774,
            0.49788,
            0.49801,
            0.49813,
            0.49825,
            0.49836,
            0.49846,
            0.49856,
            0.49865,
            0.49886,
            0.49903,
            0.49918,
            0.49931,
            0.49942,
            0.49952,
            0.49960,
            0.49966,
            0.49972,
            0.49977,
            0.49981,
            0.49984,
            0.49987,
            0.49989,
            0.49991,
            0.49993,
            0.49994,
            0.49995,
            0.49996,
            0.49997,
            0.49997,
            0.49998,
            0.49998,
            0.49999,
            0.49999,
            0.49999,
            0.49999,
            0.49999,
            0.50000,
            0.50000,
            0.50000,
            0.50000,
            0.50000,
            0.50000,
            0.50000,
            0.50000,
            0.50000,
            0.50000,
            0.50000,
            0.50000
    };

    private double[] argX2 = new double[]{
            0.00,
            0.01,
            0.02,
            0.03,
            0.04,
            0.05,
            0.06,
            0.07,
            0.08,
            0.09,
            0.10,
            0.11,
            0.12,
            0.13,
            0.14,
            0.15,
            0.16,
            0.17,
            0.18,
            0.19,
            0.20,
            0.21,
            0.22,
            0.23,
            0.24,
            0.25,
            0.26,
            0.27,
            0.28,
            0.29,
            0.30,
            0.31,
            0.32,
            0.33,
            0.34,
            0.35,
            0.36,
            0.37,
            0.38,
            0.39,
            0.40,
            0.41,
            0.42,
            0.43,
            0.44,
            0.45,
            0.46,
            0.47,
            0.48,
            0.49,
            0.50,
            0.51,
            0.52,
            0.53,
            0.54,
            0.55,
            0.56,
            0.57,
            0.58,
            0.59,
            0.60,
            0.61,
            0.62,
            0.63,
            0.64,
            0.65,
            0.66,
            0.67,
            0.68,
            0.69,
            0.70,
            0.71,
            0.72,
            0.73,
            0.74,
            0.75,
            0.76,
            0.77,
            0.78,
            0.79,
            0.80,
            0.81,
            0.82,
            0.83,
            0.84,
            0.85,
            0.86,
            0.87,
            0.88,
            0.89,
            0.90,
            0.91,
            0.92,
            0.93,
            0.94,
            0.95,
            0.96,
            0.97,
            0.98,
            0.99,
            1.00,
            1.01,
            1.02,
            1.03,
            1.04,
            1.05,
            1.06,
            1.07,
            1.08,
            1.09,
            1.10,
            1.11,
            1.12,
            1.13,
            1.14,
            1.15,
            1.16,
            1.17,
            1.18,
            1.19,
            1.20,
            1.21,
            1.22,
            1.23,
            1.24,
            1.25,
            1.26,
            1.27,
            1.28,
            1.29,
            1.30,
            1.31,
            1.32,
            1.33,
            1.34,
            1.35,
            1.36,
            1.37,
            1.38,
            1.39,
            1.40,
            1.41,
            1.42,
            1.43,
            1.44,
            1.45,
            1.46,
            1.47,
            1.48,
            1.49,
            1.50,
            1.51,
            1.52,
            1.53,
            1.54,
            1.55,
            1.56,
            1.57,
            1.58,
            1.59,
            1.60,
            1.61,
            1.62,
            1.63,
            1.64,
            1.65,
            1.66,
            1.67,
            1.68,
            1.69,
            1.70,
            1.71,
            1.72,
            1.73,
            1.74,
            1.75,
            1.76,
            1.77,
            1.78,
            1.79,
            1.80,
            1.81,
            1.82,
            1.83,
            1.84,
            1.85,
            1.86,
            1.87,
            1.88,
            1.89,
            1.90,
            1.91,
            1.92,
            1.93,
            1.94,
            1.95,
            1.96,
            1.97,
            1.98,
            1.99,
            2.00,
            2.01,
            2.02,
            2.03,
            2.04,
            2.05,
            2.06,
            2.07,
            2.08,
            2.09,
            2.10,
            2.11,
            2.12,
            2.13,
            2.14,
            2.15,
            2.16,
            2.17,
            2.18,
            2.19,
            2.20,
            2.21,
            2.22,
            2.23,
            2.24,
            2.25,
            2.26,
            2.27,
            2.28,
            2.29,
            2.30,
            2.31,
            2.32,
            2.33,
            2.34,
            2.35,
            2.36,
            2.37,
            2.38,
            2.39,
            2.40,
            2.41,
            2.42,
            2.43,
            2.44,
            2.45,
            2.46,
            2.47,
            2.48,
            2.49,
            2.50,
            2.51,
            2.52,
            2.53,
            2.54,
            2.55,
            2.56,
            2.57,
            2.58,
            2.59,
            2.60,
            2.61,
            2.62,
            2.63,
            2.64,
            2.65,
            2.66,
            2.67,
            2.68,
            2.69,
            2.70,
            2.71,
            2.72,
            2.73,
            2.74,
            2.75,
            2.76,
            2.77,
            2.78,
            2.79,
            2.80,
            2.81,
            2.82,
            2.83,
            2.84,
            2.85,
            2.86,
            2.87,
            2.88,
            2.89,
            2.90,
            2.91,
            2.92,
            2.93,
            2.94,
            2.95,
            2.96,
            2.97,
            2.98,
            2.99,
            3.00,
            3.01,
            3.02,
            3.03,
            3.04,
            3.05,
            3.06,
            3.07,
            3.08,
            3.09,
            3.10,
            3.11,
            3.12,
            3.13,
            3.14,
            3.15,
            3.16,
            3.17,
            3.18,
            3.19,
            3.20,
            3.21,
            3.22,
            3.23,
            3.24,
            3.25,
            3.26,
            3.27,
            3.28,
            3.29,
            3.30,
            3.31,
            3.32,
            3.33,
            3.34,
            3.35,
            3.36,
            3.37,
            3.38,
            3.39,
            3.40,
            3.41,
            3.42,
            3.43,
            3.44,
            3.45,
            3.46,
            3.47,
            3.48,
            3.49,
            3.50,
            3.51,
            3.52,
            3.53,
            3.54,
            3.55,
            3.56,
            3.57,
            3.58,
            3.59,
            3.60,
            3.61,
            3.62,
            3.63,
            3.64,
            3.65,
            3.66,
            3.67,
            3.68,
            3.69,
            3.70,
            3.71,
            3.72,
            3.73,
            3.74,
            3.75,
            3.76,
            3.77,
            3.78,
            3.79,
            3.80,
            3.81,
            3.82,
            3.83,
            3.84,
            3.85,
            3.86,
            3.87,
            3.88,
            3.89,
            3.90,
            3.91,
            3.92,
            3.93,
            3.94,
            3.95,
            3.96,
            3.97,
            3.98,
            3.99
    };

    private double[] fx2 = new double[]{
            0.00000,
            0.00798,
            0.01596,
            0.02393,
            0.03191,
            0.03988,
            0.04784,
            0.05581,
            0.06376,
            0.07171,
            0.07966,
            0.08759,
            0.09552,
            0.10348,
            0.11134,
            0.11924,
            0.12712,
            0.13499,
            0.14285,
            0.15069,
            0.15852,
            0.16633,
            0.17413,
            0.18191,
            0.18967,
            0.19741,
            0.20514,
            0.21284,
            0.22052,
            0.22818,
            0.23582,
            0.24344,
            0.25103,
            0.25860,
            0.26614,
            0.27366,
            0.28115,
            0.28862,
            0.29605,
            0.30346,
            0.31084,
            0.31819,
            0.32552,
            0.33280,
            0.34006,
            0.34729,
            0.35448,
            0.36164,
            0.36877,
            0.37587,
            0.38292,
            0.38995,
            0.39694,
            0.40389,
            0.41080,
            0.41768,
            0.42452,
            0.43132,
            0.43809,
            0.44481,
            0.45149,
            0.45814,
            0.46474,
            0.47131,
            0.47783,
            0.48431,
            0.49075,
            0.49714,
            0.50350,
            0.50981,
            0.51607,
            0.52230,
            0.52848,
            0.53461,
            0.54070,
            0.54675,
            0.55275,
            0.55870,
            0.56461,
            0.57047,
            0.57629,
            0.58206,
            0.58778,
            0.59346,
            0.59909,
            0.60468,
            0.61021,
            0.61570,
            0.62114,
            0.62653,
            0.63188,
            0.63718,
            0.64243,
            0.64763,
            0.65278,
            0.65789,
            0.66294,
            0.66795,
            0.67291,
            0.67783,
            0.68269,
            0.68750,
            0.69227,
            0.69699,
            0.70166,
            0.70628,
            0.71086,
            0.71538,
            0.71986,
            0.72429,
            0.72867,
            0.73300,
            0.73729,
            0.74152,
            0.74571,
            0.74986,
            0.75395,
            0.75800,
            0.76200,
            0.76595,
            0.76986,
            0.77372,
            0.77754,
            0.78130,
            0.78502,
            0.78870,
            0.79233,
            0.79592,
            0.79945,
            0.80295,
            0.80640,
            0.80980,
            0.81316,
            0.81648,
            0.81975,
            0.82298,
            0.82617,
            0.82931,
            0.83241,
            0.83547,
            0.83849,
            0.84146,
            0.84439,
            0.84728,
            0.85013,
            0.85294,
            0.85571,
            0.85844,
            0.86113,
            0.86378,
            0.86639,
            0.86696,
            0.87149,
            0.87398,
            0.87644,
            0.87886,
            0.88124,
            0.88358,
            0.88589,
            0.88817,
            0.89040,
            0.89260,
            0.89477,
            0.89690,
            0.89899,
            0.90106,
            0.90309,
            0.90508,
            0.90704,
            0.90897,
            0.91087,
            0.91273,
            0.91457,
            0.91637,
            0.91814,
            0.91988,
            0.92159,
            0.92327,
            0.92492,
            0.92655,
            0.92814,
            0.92970,
            0.93124,
            0.93275,
            0.93423,
            0.93569,
            0.93711,
            0.93852,
            0.93989,
            0.94124,
            0.94257,
            0.94387,
            0.94514,
            0.94639,
            0.94762,
            0.94882,
            0.95000,
            0.95116,
            0.95230,
            0.95341,
            0.95450,
            0.95557,
            0.95662,
            0.95764,
            0.95865,
            0.95964,
            0.96060,
            0.96155,
            0.96247,
            0.96338,
            0.96427,
            0.96514,
            0.96599,
            0.96683,
            0.96765,
            0.96844,
            0.96923,
            0.96999,
            0.97074,
            0.97148,
            0.97219,
            0.97289,
            0.97358,
            0.97425,
            0.97491,
            0.97555,
            0.97618,
            0.97679,
            0.97739,
            0.97798,
            0.97855,
            0.97911,
            0.97966,
            0.98019,
            0.98072,
            0.98123,
            0.98172,
            0.98221,
            0.98269,
            0.98315,
            0.98360,
            0.98405,
            0.98448,
            0.98490,
            0.98531,
            0.98571,
            0.98611,
            0.98649,
            0.98686,
            0.98723,
            0.98758,
            0.98793,
            0.98826,
            0.98859,
            0.98891,
            0.98923,
            0.98953,
            0.98983,
            0.99012,
            0.99040,
            0.99068,
            0.99095,
            0.99121,
            0.99146,
            0.99171,
            0.99195,
            0.99219,
            0.99241,
            0.99263,
            0.99285,
            0.99307,
            0.99327,
            0.99347,
            0.99367,
            0.99386,
            0.99404,
            0.99422,
            0.99439,
            0.99456,
            0.99473,
            0.99489,
            0.99505,
            0.99520,
            0.99535,
            0.99549,
            0.99563,
            0.99576,
            0.99590,
            0.99602,
            0.99615,
            0.99627,
            0.99639,
            0.99650,
            0.99661,
            0.99672,
            0.99682,
            0.99692,
            0.99702,
            0.99712,
            0.99721,
            0.99730,
            0.99739,
            0.99747,
            0.99755,
            0.99763,
            0.99771,
            0.99779,
            0.99786,
            0.99793,
            0.99800,
            0.99806,
            0.99813,
            0.99819,
            0.99825,
            0.99831,
            0.99837,
            0.99842,
            0.99848,
            0.99853,
            0.99858,
            0.99863,
            0.99867,
            0.99872,
            0.99876,
            0.99880,
            0.99855,
            0.99889,
            0.99892,
            0.99896,
            0.99900,
            0.99903,
            0.99907,
            0.99910,
            0.99913,
            0.99916,
            0.99919,
            0.99922,
            0.99925,
            0.99928,
            0.99930,
            0.99933,
            0.99935,
            0.99937,
            0.99940,
            0.99942,
            0.99944,
            0.99946,
            0.99948,
            0.99950,
            0.99952,
            0.99953,
            0.99955,
            0.99957,
            0.99958,
            0.99960,
            0.99961,
            0.99963,
            0.99964,
            0.99966,
            0.99967,
            0.99968,
            0.99969,
            0.99971,
            0.99972,
            0.99973,
            0.99974,
            0.99975,
            0.99976,
            0.99977,
            0.99978,
            0.99978,
            0.99979,
            0.99980,
            0.99981,
            0.99982,
            0.99982,
            0.99983,
            0.99984,
            0.99984,
            0.99985,
            0.99986,
            0.99986,
            0.99987,
            0.99987,
            0.99988,
            0.99988,
            0.99989,
            0.99989,
            0.99990,
            0.99990,
            0.99990,
            0.99991,
            0.99991,
            0.99992,
            0.99992,
            0.99992,
            0.99992,
            0.99993,
            0.99993,
            0.99993
    };
}
