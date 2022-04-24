package uab.cn.utils;

import java.util.Random;

public class Utils {
    public static double[][] citiesPortugal = new double[][] {
        {1.0, 643.02, 280.98, 870.7, 269.28, 414.28, 186.83, 170.52, 461.21, 368.52, 137.12, 557.06, 896.23, 371.8, 756.37, 623.3, 399.92, 888.19, 977.38}, // Lisboa
        {643.02, 1.0, 210.76, 764.69, 291.05, 107.39, 645.75, 142.63, 983.0, 252.78, 119.26, 775.23, 321.92, 473.78, 736.26, 870.43, 978.15, 677.19, 980.48}, // Porto
        {280.98, 210.76, 1.0, 373.32, 435.23, 373.76, 952.59, 990.8, 648.67, 945.11, 345.78, 551.95, 363.06, 413.39, 632.21, 539.01, 656.87, 155.42, 118.07}, // Setubal
        {870.7, 764.69, 373.32, 1.0, 359.81, 255.64, 213.52, 617.85, 980.27, 922.17, 129.03, 137.83, 626.08, 833.5, 403.27, 357.4, 472.65, 240.32, 819.82}, // Braga
        {269.28, 291.05, 435.23, 359.81, 1.0, 903.25, 153.98, 853.35, 634.2, 791.77, 362.31, 243.82, 840.04, 355.11, 487.89, 237.89, 786.45, 705.38, 638.48}, // Aveiro
        {414.28, 107.39, 373.76, 255.64, 903.25, 1.0, 916.86, 848.18, 219.55, 736.92, 154.57, 101.1, 966.71, 426.44, 393.38, 873.85, 939.38, 950.93, 999.98}, // Faro
        {186.83, 645.75, 952.59, 213.52, 153.98, 916.86, 1.0, 980.34, 950.57, 582.07, 171.65, 667.15, 632.65, 662.87, 157.23, 122.07, 438.58, 899.58, 178.77}, // Leiria
        {170.52, 142.63, 990.8, 617.85, 853.35, 848.18, 980.34, 1.0, 591.94, 163.38, 303.16, 521.1, 553.68, 993.1, 846.27, 879.78, 838.8, 394.81, 531.83}, // Santarem
        {461.21, 983.0, 648.67, 980.27, 634.2, 219.55, 950.57, 591.94, 1.0, 682.42, 457.37, 745.59, 867.47, 275.53, 935.12, 847.1, 334.11, 920.66, 102.26}, // Coimbra
        {368.52, 252.78, 945.11, 922.17, 791.77, 736.92, 582.07, 163.38, 682.42, 1.0, 531.67, 704.43, 811.53, 298.14, 730.8, 723.78, 307.4, 460.42, 838.77}, // Viseu
        {137.12, 119.26, 345.78, 129.03, 362.31, 154.57, 171.65, 303.16, 457.37, 531.67, 1.0, 990.24, 919.41, 878.83, 308.77, 238.39, 956.48, 430.85, 760.8}, // Funchal
        {557.06, 775.23, 551.95, 137.83, 243.82, 101.1, 667.15, 521.1, 745.59, 704.43, 990.24, 1.0, 601.73, 417.59, 225.0, 669.45, 158.43, 161.93, 359.45}, // Ponta Delgada
        {896.23, 321.92, 363.06, 626.08, 840.04, 966.71, 632.65, 553.68, 867.47, 811.53, 919.41, 601.73, 1.0, 714.3, 355.73, 264.73, 810.03, 201.45, 969.56}, // Viana do Castelo
        {371.8, 473.78, 413.39, 833.5, 355.11, 426.44, 662.87, 993.1, 275.53, 298.14, 878.83, 417.59, 714.3, 1.0, 379.37, 554.67, 192.92, 577.39, 124.12}, // Vila Real
        {756.37, 736.26, 632.21, 403.27, 487.89, 393.38, 157.23, 846.27, 935.12, 730.8, 308.77, 225.0, 355.73, 379.37, 1.0, 628.67, 359.73, 888.33, 603.46}, // Castelo Branco
        {623.3, 870.43, 539.01, 357.4, 237.89, 873.85, 122.07, 879.78, 847.1, 723.78, 238.39, 669.45, 264.73, 554.67, 628.67, 1.0, 878.97, 490.43, 954.54}, // Evora
        {399.92, 978.15, 656.87, 472.65, 786.45, 939.38, 438.58, 838.8, 334.11, 307.4, 956.48, 158.43, 810.03, 192.92, 359.73, 878.97, 1.0, 750.45, 908.93}, // Guarda
        {888.19, 677.19, 155.42, 240.32, 705.38, 950.93, 899.58, 394.81, 920.66, 460.42, 430.85, 161.93, 201.45, 577.39, 888.33, 490.43, 750.45, 1.0, 430.49}, // Braganca
        {977.38, 980.48, 118.07, 819.82, 638.48, 999.98, 178.77, 531.83, 102.26, 838.77, 760.8, 359.45, 969.56, 124.12, 603.46, 954.54, 908.93, 430.49, 1.0} // Portalegre
    };

    public static double[][] europeanCapitals = new double[][] {
            {1.0, 785.17, 471.89, 884.69, 305.84, 586.18, 837.69, 455.91, 206.7, 823.83, 256.71, 253.88, 237.01, 981.25, 938.13, 863.16, 558.62, 145.13, 963.38, 454.53, 242.77, 118.61, 102.45, 575.83, 795.26, 983.36, 862.13, 872.76, 104.73, 230.58, 188.82, 662.91, 223.11, 277.76, 503.91, 319.83, 651.08, 476.1, 896.0, 192.15, 592.85, 317.25, 300.67}, // Lisboa
            {785.17, 1.0, 548.4, 388.91, 928.51, 970.54, 124.85, 879.27, 784.88, 503.38, 623.75, 721.34, 837.1, 563.84, 963.64, 204.27, 406.01, 341.04, 237.28, 256.19, 860.68, 921.39, 142.55, 343.31, 794.05, 252.92, 921.45, 142.96, 961.64, 468.33, 778.79, 887.95, 218.12, 619.76, 765.61, 439.64, 893.92, 591.82, 558.71, 197.42, 861.08, 275.56, 665.39}, // Tirana
            {471.89, 548.4, 1.0, 813.87, 194.43, 982.95, 965.05, 627.52, 505.28, 558.29, 255.67, 722.23, 530.65, 274.67, 286.94, 232.25, 862.51, 486.6, 156.41, 276.73, 727.24, 542.66, 863.13, 457.96, 272.34, 506.57, 354.48, 238.59, 623.08, 545.28, 689.07, 494.59, 633.54, 294.7, 260.64, 748.36, 121.05, 912.49, 633.29, 843.91, 177.21, 660.79, 574.4}, // Andorra la Vella
            {884.69, 388.91, 813.87, 1.0, 822.05, 837.79, 198.96, 986.82, 271.33, 685.41, 680.64, 647.95, 828.27, 893.09, 167.02, 246.2, 908.01, 861.0, 370.18, 467.84, 874.83, 612.31, 572.93, 947.52, 383.7, 787.56, 290.19, 705.35, 906.46, 306.62, 736.37, 924.6, 290.86, 403.69, 184.72, 760.63, 348.92, 799.34, 566.01, 294.15, 686.15, 364.68, 378.49}, // Vienna
            {305.84, 928.51, 194.43, 822.05, 1.0, 382.63, 210.26, 681.06, 252.2, 883.58, 347.95, 167.64, 198.27, 577.41, 884.22, 986.73, 503.23, 515.24, 411.67, 420.18, 447.35, 750.06, 417.55, 902.28, 573.1, 204.0, 562.79, 172.6, 848.39, 225.75, 949.15, 109.43, 645.82, 836.53, 723.03, 452.41, 190.96, 881.13, 247.87, 164.2, 964.06, 127.65, 278.99}, // Minsk
            {586.18, 970.54, 982.95, 837.79, 382.63, 1.0, 932.4, 480.97, 575.31, 266.44, 642.9, 724.13, 880.54, 154.2, 834.21, 182.63, 888.49, 602.66, 958.54, 539.31, 811.32, 370.82, 698.98, 873.45, 788.44, 492.75, 581.27, 838.79, 490.63, 563.45, 206.82, 498.09, 674.44, 805.99, 357.67, 583.13, 177.79, 705.51, 894.17, 705.56, 308.41, 606.39, 123.23}, // Brussels
            {837.69, 124.85, 965.05, 198.96, 210.26, 932.4, 1.0, 225.54, 429.75, 389.21, 435.59, 323.38, 907.67, 314.77, 757.13, 487.54, 143.09, 188.22, 793.21, 838.91, 889.23, 616.51, 509.19, 176.89, 545.46, 383.36, 546.35, 862.91, 853.83, 384.29, 988.62, 343.39, 822.44, 783.8, 429.35, 193.11, 858.92, 140.23, 780.28, 966.52, 243.39, 865.95, 930.73}, // Sarajevo
            {455.91, 879.27, 627.52, 986.82, 681.06, 480.97, 225.54, 1.0, 159.79, 570.65, 925.96, 873.4, 719.04, 903.79, 735.38, 342.83, 244.94, 186.38, 810.33, 843.66, 162.61, 579.58, 659.37, 196.15, 413.52, 619.47, 597.56, 500.39, 833.7, 307.75, 234.04, 100.2, 271.12, 187.28, 361.8, 201.48, 842.89, 843.81, 216.39, 983.65, 665.77, 830.61, 718.55}, // Sofia
            {206.7, 784.88, 505.28, 271.33, 252.2, 575.31, 429.75, 159.79, 1.0, 952.93, 871.68, 561.3, 832.47, 133.87, 954.33, 182.26, 812.8, 404.82, 839.14, 724.73, 986.48, 993.94, 958.13, 993.87, 579.02, 912.27, 732.47, 206.43, 649.43, 265.46, 640.98, 923.48, 288.67, 793.27, 310.81, 896.42, 761.21, 898.37, 445.05, 280.75, 179.6, 853.27, 397.56}, // Zagreb
            {823.83, 503.38, 558.29, 685.41, 883.58, 266.44, 389.21, 570.65, 952.93, 1.0, 309.32, 409.33, 211.49, 243.46, 607.49, 768.31, 803.44, 348.62, 976.0, 832.21, 975.88, 660.5, 383.65, 760.74, 802.24, 268.9, 331.38, 650.53, 139.29, 664.93, 791.78, 417.62, 455.7, 374.32, 279.78, 415.5, 411.89, 198.54, 769.7, 129.41, 918.01, 907.81, 861.76}, // Prague
            {256.71, 623.75, 255.67, 680.64, 347.95, 642.9, 435.59, 925.96, 871.68, 309.32, 1.0, 715.58, 487.71, 170.95, 919.09, 656.68, 564.89, 235.73, 699.97, 537.44, 608.72, 952.75, 926.07, 327.21, 256.74, 253.53, 544.96, 344.38, 184.19, 141.37, 865.62, 562.37, 939.23, 127.37, 690.73, 595.98, 267.78, 829.83, 630.32, 345.58, 440.67, 812.81, 861.49}, // Copenhagen
            {253.88, 721.34, 722.23, 647.95, 167.64, 724.13, 323.38, 873.4, 561.3, 409.33, 715.58, 1.0, 602.99, 187.29, 845.52, 915.46, 691.61, 420.45, 569.62, 337.02, 754.49, 672.49, 849.43, 222.81, 669.71, 694.09, 868.99, 169.9, 718.33, 651.83, 865.91, 720.99, 773.68, 336.32, 130.11, 216.81, 774.7, 832.36, 900.96, 665.49, 885.52, 207.58, 732.62}, // Tallinn
            {237.01, 837.1, 530.65, 828.27, 198.27, 880.54, 907.67, 719.04, 832.47, 211.49, 487.71, 602.99, 1.0, 295.72, 766.35, 226.73, 289.97, 171.28, 768.65, 345.61, 731.9, 237.01, 591.67, 253.11, 843.96, 762.09, 733.77, 531.69, 861.74, 745.58, 945.13, 118.96, 207.48, 959.13, 557.96, 392.59, 444.52, 443.09, 317.26, 377.39, 401.94, 419.2, 510.94}, // Helsinki
            {981.25, 563.84, 274.67, 893.09, 577.41, 154.2, 314.77, 903.79, 133.87, 243.46, 170.95, 187.29, 295.72, 1.0, 389.47, 417.72, 323.8, 446.45, 669.69, 885.23, 987.36, 386.57, 873.9, 947.5, 521.82, 416.68, 437.54, 244.24, 521.17, 234.98, 275.76, 221.18, 385.62, 885.96, 175.21, 186.77, 765.07, 312.72, 752.14, 962.41, 618.8, 332.64, 407.94}, // Paris
            {938.13, 963.64, 286.94, 167.02, 884.22, 834.21, 757.13, 735.38, 954.33, 607.49, 919.09, 845.52, 766.35, 389.47, 1.0, 345.5, 312.54, 531.99, 372.34, 214.89, 159.16, 167.8, 684.69, 275.28, 603.76, 248.84, 876.63, 525.31, 268.31, 124.54, 523.23, 617.64, 572.71, 138.15, 552.83, 840.0, 459.22, 696.33, 955.8, 388.06, 990.7, 125.4, 978.67}, // Berlin
            {863.16, 204.27, 232.25, 246.2, 986.73, 182.63, 487.54, 342.83, 182.26, 768.31, 656.68, 915.46, 226.73, 417.72, 345.5, 1.0, 633.92, 817.15, 346.43, 694.7, 344.55, 600.92, 351.15, 817.99, 134.19, 435.37, 122.37, 222.61, 146.84, 710.84, 889.37, 392.61, 962.97, 562.52, 842.39, 692.04, 262.29, 661.52, 982.49, 583.47, 268.99, 884.71, 864.4}, // Athens
            {558.62, 406.01, 862.51, 908.01, 503.23, 888.49, 143.09, 244.94, 812.8, 803.44, 564.89, 691.61, 289.97, 323.8, 312.54, 633.92, 1.0, 428.38, 859.99, 650.41, 550.47, 683.15, 327.22, 876.13, 295.21, 884.48, 365.87, 103.32, 768.59, 312.39, 357.47, 651.91, 548.68, 326.03, 199.26, 430.88, 445.01, 662.91, 623.25, 182.99, 652.27, 512.65, 978.7}, // Budapest
            {145.13, 341.04, 486.6, 861.0, 515.24, 602.66, 188.22, 186.38, 404.82, 348.62, 235.73, 420.45, 171.28, 446.45, 531.99, 817.15, 428.38, 1.0, 980.01, 579.15, 413.82, 449.84, 279.16, 588.57, 937.31, 642.97, 611.86, 511.74, 678.4, 114.87, 879.69, 798.37, 292.4, 476.26, 405.63, 333.25, 975.99, 529.73, 184.61, 461.12, 646.17, 394.56, 975.13}, // Reykjavik
            {963.38, 237.28, 156.41, 370.18, 411.67, 958.54, 793.21, 810.33, 839.14, 976.0, 699.97, 569.62, 768.65, 669.69, 372.34, 346.43, 859.99, 980.01, 1.0, 773.93, 799.72, 164.42, 346.7, 641.89, 983.15, 796.65, 323.48, 662.79, 480.8, 731.04, 743.23, 224.04, 494.94, 555.2, 924.67, 573.49, 828.46, 938.39, 972.44, 202.09, 733.85, 754.67, 115.36}, // Dublin
            {454.53, 256.19, 276.73, 467.84, 420.18, 539.31, 838.91, 843.66, 724.73, 832.21, 537.44, 337.02, 345.61, 885.23, 214.89, 694.7, 650.41, 579.15, 773.93, 1.0, 957.66, 470.75, 523.87, 557.24, 899.69, 206.37, 896.37, 857.78, 110.36, 932.87, 733.34, 641.47, 784.97, 409.37, 107.31, 200.07, 174.58, 397.98, 559.2, 338.48, 198.6, 856.83, 316.59}, // Rome
            {242.77, 860.68, 727.24, 874.83, 447.35, 811.32, 889.23, 162.61, 986.48, 975.88, 608.72, 754.49, 731.9, 987.36, 159.16, 344.55, 550.47, 413.82, 799.72, 957.66, 1.0, 385.54, 453.02, 655.67, 752.29, 535.68, 866.82, 855.11, 583.43, 791.95, 687.61, 580.92, 650.76, 250.67, 888.22, 687.87, 137.14, 525.04, 421.97, 424.07, 206.17, 264.66, 613.22}, // Riga
            {118.61, 921.39, 542.66, 612.31, 750.06, 370.82, 616.51, 579.58, 993.94, 660.5, 952.75, 672.49, 237.01, 386.57, 167.8, 600.92, 683.15, 449.84, 164.42, 470.75, 385.54, 1.0, 967.38, 582.33, 896.09, 698.83, 973.28, 252.35, 346.56, 974.69, 981.21, 414.7, 636.38, 251.51, 630.18, 412.45, 990.98, 883.78, 780.48, 828.14, 406.82, 368.02, 553.45}, // Vaduz
            {102.45, 142.55, 863.13, 572.93, 417.55, 698.98, 509.19, 659.37, 958.13, 383.65, 926.07, 849.43, 591.67, 873.9, 684.69, 351.15, 327.22, 279.16, 346.7, 523.87, 453.02, 967.38, 1.0, 334.57, 721.92, 773.67, 929.35, 332.34, 108.1, 924.21, 364.78, 928.45, 572.7, 383.25, 497.73, 647.48, 342.72, 604.43, 708.39, 489.21, 333.78, 561.2, 712.49}, // Vilnius
            {575.83, 343.31, 457.96, 947.52, 902.28, 873.45, 176.89, 196.15, 993.87, 760.74, 327.21, 222.81, 253.11, 947.5, 275.28, 817.99, 876.13, 588.57, 641.89, 557.24, 655.67, 582.33, 334.57, 1.0, 526.32, 549.8, 763.32, 916.33, 490.93, 225.0, 362.43, 430.24, 306.76, 638.58, 500.34, 884.95, 353.32, 168.06, 133.48, 310.49, 618.3, 267.23, 714.67}, // Luxembourg
            {795.26, 794.05, 272.34, 383.7, 573.1, 788.44, 545.46, 413.52, 579.02, 802.24, 256.74, 669.71, 843.96, 521.82, 603.76, 134.19, 295.21, 937.31, 983.15, 899.69, 752.29, 896.09, 721.92, 526.32, 1.0, 727.55, 173.82, 216.94, 306.76, 791.14, 841.16, 289.87, 622.35, 504.62, 687.73, 749.22, 406.35, 505.64, 244.36, 671.31, 556.2, 375.3, 792.01}, // Valletta
            {983.36, 252.92, 506.57, 787.56, 204.0, 492.75, 383.36, 619.47, 912.27, 268.9, 253.53, 694.09, 762.09, 416.68, 248.84, 435.37, 884.48, 642.97, 796.65, 206.37, 535.68, 698.83, 773.67, 549.8, 727.55, 1.0, 472.24, 320.41, 137.74, 703.33, 530.61, 280.3, 614.31, 861.46, 399.19, 840.23, 495.43, 632.19, 985.13, 687.81, 587.41, 183.99, 765.74}, // Chisinau
            {862.13, 921.45, 354.48, 290.19, 562.79, 581.27, 546.35, 597.56, 732.47, 331.38, 544.96, 868.99, 733.77, 437.54, 876.63, 122.37, 365.87, 611.86, 323.48, 896.37, 866.82, 973.28, 929.35, 763.32, 173.82, 472.24, 1.0, 468.47, 956.55, 835.23, 770.49, 928.59, 134.9, 703.9, 711.45, 683.0, 196.36, 556.23, 529.72, 284.56, 239.23, 858.96, 113.18}, // Monaco
            {872.76, 142.96, 238.59, 705.35, 172.6, 838.79, 862.91, 500.39, 206.43, 650.53, 344.38, 169.9, 531.69, 244.24, 525.31, 222.61, 103.32, 511.74, 662.79, 857.78, 855.11, 252.35, 332.34, 916.33, 216.94, 320.41, 468.47, 1.0, 307.58, 707.75, 620.86, 954.81, 921.63, 747.08, 626.27, 407.21, 563.01, 640.88, 944.15, 362.79, 842.67, 982.49, 495.68}, // Podgorica
            {104.73, 961.64, 623.08, 906.46, 848.39, 490.63, 853.83, 833.7, 649.43, 139.29, 184.19, 718.33, 861.74, 521.17, 268.31, 146.84, 768.59, 678.4, 480.8, 110.36, 583.43, 346.56, 108.1, 490.93, 306.76, 137.74, 956.55, 307.58, 1.0, 152.16, 789.03, 746.74, 444.68, 954.95, 617.05, 136.18, 968.94, 435.77, 494.27, 490.14, 194.18, 822.79, 151.9}, // Amsterdam
            {230.58, 468.33, 545.28, 306.62, 225.75, 563.45, 384.29, 307.75, 265.46, 664.93, 141.37, 651.83, 745.58, 234.98, 124.54, 710.84, 312.39, 114.87, 731.04, 932.87, 791.95, 974.69, 924.21, 225.0, 791.14, 703.33, 835.23, 707.75, 152.16, 1.0, 326.68, 735.2, 131.0, 968.21, 720.04, 204.79, 137.45, 155.95, 164.36, 783.04, 843.41, 178.02, 916.72}, // Skopje
            {188.82, 778.79, 689.07, 736.37, 949.15, 206.82, 988.62, 234.04, 640.98, 791.78, 865.62, 865.91, 945.13, 275.76, 523.23, 889.37, 357.47, 879.69, 743.23, 733.34, 687.61, 981.21, 364.78, 362.43, 841.16, 530.61, 770.49, 620.86, 789.03, 326.68, 1.0, 687.23, 395.28, 480.21, 977.95, 339.18, 649.84, 909.68, 916.08, 417.61, 843.46, 390.04, 546.65}, // Oslo
            {662.91, 887.95, 494.59, 924.6, 109.43, 498.09, 343.39, 100.2, 923.48, 417.62, 562.37, 720.99, 118.96, 221.18, 617.64, 392.61, 651.91, 798.37, 224.04, 641.47, 580.92, 414.7, 928.45, 430.24, 289.87, 280.3, 928.59, 954.81, 746.74, 735.2, 687.23, 1.0, 639.49, 323.58, 132.7, 499.31, 511.42, 999.98, 733.15, 651.03, 405.21, 385.3, 617.31}, // Warsaw
            {223.11, 218.12, 633.54, 290.86, 645.82, 674.44, 822.44, 271.12, 288.67, 455.7, 939.23, 773.68, 207.48, 385.62, 572.71, 962.97, 548.68, 292.4, 494.94, 784.97, 650.76, 636.38, 572.7, 306.76, 622.35, 614.31, 134.9, 921.63, 444.68, 131.0, 395.28, 639.49, 1.0, 251.91, 746.75, 355.54, 629.87, 787.79, 588.62, 763.18, 549.28, 820.52, 547.75}, // Bucharest
            {277.76, 619.76, 294.7, 403.69, 836.53, 805.99, 783.8, 187.28, 793.27, 374.32, 127.37, 336.32, 959.13, 885.96, 138.15, 562.52, 326.03, 476.26, 555.2, 409.37, 250.67, 251.51, 383.25, 638.58, 504.62, 861.46, 703.9, 747.08, 954.95, 968.21, 480.21, 323.58, 251.91, 1.0, 342.17, 568.45, 211.74, 416.75, 625.56, 659.57, 601.93, 118.1, 124.6}, // Moscow
            {503.91, 765.61, 260.64, 184.72, 723.03, 357.67, 429.35, 361.8, 310.81, 279.78, 690.73, 130.11, 557.96, 175.21, 552.83, 842.39, 199.26, 405.63, 924.67, 107.31, 888.22, 630.18, 497.73, 500.34, 687.73, 399.19, 711.45, 626.27, 617.05, 720.04, 977.95, 132.7, 746.75, 342.17, 1.0, 862.21, 275.89, 833.54, 258.74, 464.62, 271.9, 403.67, 335.31}, // San Marino
            {319.83, 439.64, 748.36, 760.63, 452.41, 583.13, 193.11, 201.48, 896.42, 415.5, 595.98, 216.81, 392.59, 186.77, 840.0, 692.04, 430.88, 333.25, 573.49, 200.07, 687.87, 412.45, 647.48, 884.95, 749.22, 840.23, 683.0, 407.21, 136.18, 204.79, 339.18, 499.31, 355.54, 568.45, 862.21, 1.0, 302.13, 850.22, 403.04, 597.17, 738.32, 533.05, 745.23}, // Belgrade
            {651.08, 893.92, 121.05, 348.92, 190.96, 177.79, 858.92, 842.89, 761.21, 411.89, 267.78, 774.7, 444.52, 765.07, 459.22, 262.29, 445.01, 975.99, 828.46, 174.58, 137.14, 990.98, 342.72, 353.32, 406.35, 495.43, 196.36, 563.01, 968.94, 137.45, 649.84, 511.42, 629.87, 211.74, 275.89, 302.13, 1.0, 225.72, 990.08, 118.32, 509.28, 282.95, 529.43}, // Bratislava
            {476.1, 591.82, 912.49, 799.34, 881.13, 705.51, 140.23, 843.81, 898.37, 198.54, 829.83, 832.36, 443.09, 312.72, 696.33, 661.52, 662.91, 529.73, 938.39, 397.98, 525.04, 883.78, 604.43, 168.06, 505.64, 632.19, 556.23, 640.88, 435.77, 155.95, 909.68, 999.98, 787.79, 416.75, 833.54, 850.22, 225.72, 1.0, 577.41, 189.86, 769.08, 708.61, 560.83}, // Lujbljana
            {896.0, 558.71, 633.29, 566.01, 247.87, 894.17, 780.28, 216.39, 445.05, 769.7, 630.32, 900.96, 317.26, 752.14, 955.8, 982.49, 623.25, 184.61, 972.44, 559.2, 421.97, 780.48, 708.39, 133.48, 244.36, 985.13, 529.72, 944.15, 494.27, 164.36, 916.08, 733.15, 588.62, 625.56, 258.74, 403.04, 990.08, 577.41, 1.0, 234.06, 894.72, 780.57, 329.88}, // Madrid
            {192.15, 197.42, 843.91, 294.15, 164.2, 705.56, 966.52, 983.65, 280.75, 129.41, 345.58, 665.49, 377.39, 962.41, 388.06, 583.47, 182.99, 461.12, 202.09, 338.48, 424.07, 828.14, 489.21, 310.49, 671.31, 687.81, 284.56, 362.79, 490.14, 783.04, 417.61, 651.03, 763.18, 659.57, 464.62, 597.17, 118.32, 189.86, 234.06, 1.0, 405.02, 190.55, 942.84}, // Stockholm
            {592.85, 861.08, 177.21, 686.15, 964.06, 308.41, 243.39, 665.77, 179.6, 918.01, 440.67, 885.52, 401.94, 618.8, 990.7, 268.99, 652.27, 646.17, 733.85, 198.6, 206.17, 406.82, 333.78, 618.3, 556.2, 587.41, 239.23, 842.67, 194.18, 843.41, 843.46, 405.21, 549.28, 601.93, 271.9, 738.32, 509.28, 769.08, 894.72, 405.02, 1.0, 466.06, 347.94}, // Bern
            {317.25, 275.56, 660.79, 364.68, 127.65, 606.39, 865.95, 830.61, 853.27, 907.81, 812.81, 207.58, 419.2, 332.64, 125.4, 884.71, 512.65, 394.56, 754.67, 856.83, 264.66, 368.02, 561.2, 267.23, 375.3, 183.99, 858.96, 982.49, 822.79, 178.02, 390.04, 385.3, 820.52, 118.1, 403.67, 533.05, 282.95, 708.61, 780.57, 190.55, 466.06, 1.0, 619.6}, // Kiev
            {300.67, 665.39, 574.4, 378.49, 278.99, 123.23, 930.73, 718.55, 397.56, 861.76, 861.49, 732.62, 510.94, 407.94, 978.67, 864.4, 978.7, 975.13, 115.36, 316.59, 613.22, 553.45, 712.49, 714.67, 792.01, 765.74, 113.18, 495.68, 151.9, 916.72, 546.65, 617.31, 547.75, 124.6, 335.31, 745.23, 529.43, 560.83, 329.88, 942.84, 347.94, 619.6, 1.0 } // London

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
