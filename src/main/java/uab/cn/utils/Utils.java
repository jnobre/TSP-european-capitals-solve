package uab.cn.utils;

import java.util.Random;

public class Utils {
    public static double[][] citiesPortugal = new double[][] {
        {0, 275, 322, 29, 178, 972, 108, 219, 119, 216, 333, 135, 399, 188, 259, 1447, 80, 239, 310, 161}, // Lisboa 0
        {275, 0, 47, 293, 106, 1198, 293, 57, 157, 463, 63, 354, 171, 175, 132, 1510, 214, 82, 75, 231}, // Porto 1
        {322, 47, 0, 339, 149, 1242, 334, 103, 203, 506, 37, 396, 142, 208, 149, 1534, 259, 108, 63, 265}, // Braga 2
        {29, 293, 339, 0, 192, 975, 86, 236, 136, 188, 353, 106, 408, 188, 264, 1469, 81, 252, 323, 153}, // Setúbal 3
        {178, 106, 149, 192, 0, 1132, 188, 51, 61, 358, 168, 249, 226, 90, 105, 1514, 111, 134, 134, 133}, // Coimbra 4
        {972, 1198, 1242, 975, 1132, 0, 1046, 1153, 1072, 952, 1234, 1014, 1356, 1160, 1228, 977, 1041, 1198, 1259, 1127}, // Funchal 5
        {108, 293, 334, 86, 188, 1046, 0, 239, 152, 173, 356, 62, 373, 143, 226, 1554, 100, 232, 303, 90}, // Évora 6
        {219, 57, 103, 236, 51, 1153, 239, 0, 101, 408, 118, 300, 205, 134, 118, 1500, 156, 62, 105, 183}, // Aveiro 7
        {119, 157, 203, 136, 61, 1072, 152, 101, 0, 313, 217, 209, 287, 112, 158, 1478, 57, 127, 194, 128}, // Leiria 8
        {216, 463, 506, 188, 358, 952, 173, 408, 313, 0, 526, 111, 542, 314, 396, 1567, 256, 405, 476, 257}, // Faro 9
        {333, 63, 37, 353, 168, 1234, 356, 118, 217, 526, 0, 417, 172, 237, 183, 1504, 274, 139, 101, 292}, // Viana do Castelo 10
        {135, 354, 396, 106, 249, 1014, 62, 300, 209, 111, 417, 0, 432, 203, 285, 1561, 153, 294, 365, 147}, // Beja 11
        {399, 171, 142, 408, 226, 1356, 373, 205, 287, 542, 172, 432, 0, 230, 147, 1669, 300, 135, 85, 253}, // Bragança 12
        {188, 175, 208, 188, 90, 1160, 143, 134, 112, 314, 237, 203, 230, 0, 82, 1591, 122, 99, 165, 59}, // Castelo Branco 13
        {259, 132, 149, 264, 105, 1228, 226, 118, 158, 396, 183, 285, 147, 82, 0, 1615, 189, 56, 93, 139}, // Guarda 14
        {1447, 1510, 1534, 1469, 1514, 977, 1554, 1500, 1478, 1567, 1504, 1561, 1669, 1591, 1615, 0, 1486, 1562, 1585, 1594}, // Ponta Delgada 15
        {80, 214, 259, 81, 111, 1041, 100, 156, 57, 256, 274, 153, 300, 122, 189, 1486, 0, 171, 243, 108}, // Santarém 16
        {239, 82, 108, 252, 134, 1198, 232, 62, 127, 405, 139, 294, 135, 99, 56, 1562, 171, 0, 72, 157}, // Viseu 17
        {310, 75, 63, 323, 134, 1259, 303, 105, 194, 476, 101, 365, 85, 165, 93, 1585, 243, 72, 0, 225}, // Vila Real 18
        {161, 231, 265, 153, 133, 1127, 90, 183, 128, 257, 292, 147, 253, 59, 139, 1594, 108, 157, 225, 0} // Portalegre 19
    };

    public static double[][] europeanCapitals = new double[][] {
            {0, 2299, 1713, 8459, 3765, 2201, 7956, 2349, 2097, 503, 3312, 6498, 1453, 2852, 2470, 1642, 1863, 3151, 3121, 1726, 9546, 5950, 2760, 2313, 2244, 2976, 2989}, // Lisboa 0
            {2299, 0, 915, 7733, 2014, 268, 10149, 55, 278, 1810, 1362, 8673, 1034, 1283, 214, 1683, 766, 1102, 948, 768, 8647, 1096, 556, 524, 253, 856, 1242}, // Viena 1
            {1713, 915, 0, 8500, 2903, 1024, 9667, 968, 918, 1317, 1599, 8211, 264, 2090, 1129, 776, 1175, 1454, 1465, 171, 9460, 7363, 1160, 651, 717, 1771, 1280}, // Bruxelas 2
            {8459, 7733, 8500, 0, 5825, 7527, 9843, 7698, 7614, 8188, 8575, 9280, 8442, 6451, 7561, 9223, 7338, 8337, 8077, 8330, 1132, 9142, 7952, 8249, 7986, 7008, 8733}, // Sofia 3
            {3765, 2014, 2903, 5825, 0, 1880, 10662, 1968, 1991, 3285, 2770, 9237, 2950, 915, 1813, 3678, 1957, 2519, 2258, 2739, 6674, 8486, 2134, 2490, 2257, 1201, 2908}, // Nicosia 4
            {2201, 268, 1024, 7527, 1880, 0, 9971, 273, 117, 1702, 1623, 8494, 1080, 1081, 299, 1799, 518, 1358, 1186, 859, 8461, 7664, 802, 769, 489, 809, 1510}, // Zagreb 5
            {7956, 10149, 9667, 9843, 10662, 9971, 0, 10190, 9894, 8393, 11267, 1477, 9409, 10041, 10270, 9398, 9487, 11104, 11051, 9680, 10495, 9812, 10670, 10262, 10156, 10565, 10934}, // Copenhagem 6
            {2349, 55, 968, 7698, 1968, 273, 10190, 0, 305, 1859, 1350, 8714, 1089, 1251, 161, 1734, 784, 1086, 921, 822, 8607, 7879, 532, 553, 291, 804, 1245}, // Bratislava 7
            {2097, 278, 918, 7614, 1991, 117, 9894, 305, 0, 1599, 1636, 8418, 964, 1176, 381, 1691, 491, 626, 1224, 751, 8555, 7585, 833, 724, 448, 925, 1495}, // Liubliana 8
            {503, 1810, 1317, 8188, 3285, 1702, 8393, 1859, 1599, 0, 2894, 6926, 1053, 2370, 1975, 1451, 1364, 2713, 2662, 1297, 9251, 6081, 2290, 503, 1773, 2473, 2594}, // Madrid 9
            {3312, 1362, 1599, 8575, 2770, 1623, 11267, 1350, 1636, 2894, 0, 9809, 1859, 2387, 1379, 2003, 2126, 280, 529, 1597, 9354, 8962, 834, 3312, 1230, 1671, 378}, // Tallinn 10
            {6498, 8673, 8211, 9280, 9237, 8494, 1477, 8714, 8418, 6926, 9809, 0, 7951, 8584, 8793, 7979, 8011, 9639, 9579, 8217, 10118, 849, 9197, 6498, 8684, 9093, 9484}, // Helsinque 11
            {1453, 1034, 264, 8442, 2950, 1080, 9409, 1089, 964, 1053, 1859, 7951, 0, 2096, 1244, 781, 1106, 1703, 1696, 294, 9427, 7103, 1367, 1453, 882, 1870, 1544}, // Paris 12
            {2852, 1283, 2090, 6451, 915, 1081, 10041, 1251, 1176, 2370, 2387, 8584, 2096, 0, 1125, 2856, 1051, 2109, 1862, 1920, 7380, 7797, 1599, 2852, 1536, 745, 2408}, // Atenas 13
            {2470, 214, 1129, 7561, 1813, 299, 10270, 161, 381, 1975, 1379, 8793, 1244, 1125, 0, 1895, 810, 1105, 910, 982, 8462, 7962, 545, 2470, 444, 643, 1317}, // Budapeste 14
            {1642, 1683, 776, 9223, 3678, 1799, 9398, 1734, 1691, 1451, 2003, 7979, 781, 2856, 1895, 0, 1887, 1954, 2049, 941, 10206, 7133, 1827, 1642, 1465, 2538, 1629}, // Dublin 15
            {1863, 766, 1175, 7338, 1957, 518, 9487, 784, 491, 1364, 2126, 8011, 1106, 1051, 810, 1887, 0, 1868, 1704, 1009, 8321, 7186, 1317, 1863, 924, 1138, 1977}, // Roma 16
            {3151, 1102, 1454, 8337, 2519, 1358, 11104, 1086, 626, 2713, 280, 9639, 1703, 2109, 1105, 1954, 1868, 0, 262, 1425, 9136, 8793, 561, 3151, 994, 1398, 442}, // Riga 17
            {3121, 948, 1465, 8077, 2258, 1186, 11051, 921, 1224, 2662, 529, 9579, 1696, 1862, 910, 2049, 1704, 262, 0, 1406, 8884, 8737, 393, 3121, 896, 1142, 675}, // Vilnus 18
            {1726, 768, 171, 8330, 2739, 859, 9680, 822, 751, 1297, 1597, 8217, 294, 1920, 982, 941, 1009, 1425, 1406, 0, 9290, 7370, 1073, 1726, 594, 1619, 1304}, // Luxemburgo 19
            {9546, 8647, 9460, 1132, 6674, 8461, 10495, 8607, 8555, 9251, 9354, 10118, 9427, 7380, 8462, 10206, 8321, 9136, 8884, 9290, 0, 10073, 8806, 9546, 8898, 7874, 9554}, // Valetta 20
            {5950, 1096, 7363, 9142, 8486, 7664, 9812, 7879, 7585, 6081, 8962, 849, 7103, 7797, 7962, 7133, 7186, 8793, 8737, 7370, 10073, 0, 8356, 5950, 7842, 8281, 8635}, // Amsterdã 21
            {2760, 556, 1160, 7952, 2134, 802, 10670, 532, 833, 2290, 834, 9197, 1367, 1599, 545, 1827, 1317, 561, 393, 1073, 8806, 8356, 0, 2760, 517, 945, 810}, // Varsóvia 22
            {2313, 524, 651, 8249, 2490, 769, 10262, 553, 724, 1870, 1041, 8796, 878, 1804, 689, 1317, 1185, 843, 819, 590, 9149, 7950, 517, 0, 280, 1295, 810}, // Berlim 23
            {2244, 253, 717, 7986, 2257, 489, 10156, 291, 448, 1773, 1230, 8684, 882, 1536, 444, 1465, 924, 994, 896, 594, 8898, 7842, 517, 280, 0, 1081, 1054}, // Praga 24
            {2976, 856, 1771, 7008, 1201, 809, 10565, 804, 925, 2473, 1671, 9093, 1870, 745, 643, 2538, 1138, 1398, 1142, 1619, 7874, 8281, 945, 1295, 1081, 0, 1743}, // Bucareste 25
            {2989, 1242, 1280, 8733, 2908, 1510, 10934, 1245, 1495, 2594, 378, 9484, 1544, 2408, 1317, 1629, 1977, 442, 675, 1304, 9554, 8635, 810, 810, 1054, 1743, 0} // Estocolmo 26
    };

    public static void generateMatrixAdj() {

        double[][] array = new double[43][43];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(i==j) {
                    array[i][j]=1;
                    continue;
                }
                double start = 100;
                double end = 1000;
                double random = new Random().nextDouble();
                double result = start + (random * (end - start));
                result = result*100;
                result = Math.round(result);
                result = result / 100;
                array[i][j] = result;
                if (i != j) {
                    array[j][i] = result;
                }
            }
        }
        for(int i=0;i<43;i++)
        {
            for(int j=0;j<43;j++)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

}
