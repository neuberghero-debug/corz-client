package gg.corz;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_1959;
import net.minecraft.class_1972;
import net.minecraft.class_5321;
import net.minecraft.class_6880;

public final class llllIliilllIli {
   private final Map<class_5321<class_1959>, Integer> IlIIlIIIIl = new HashMap<>();

   public int IliIlllilIi(class_6880<class_1959> dimension, int entry) {
      if (dimension == null) {
         return liiiIIllIl(entry);
      } else {
         Optional var3 = dimension.method_40230();
         if (var3.isEmpty()) {
            return liiiIIllIl(entry);
         } else {
            class_5321 var4 = (class_5321)var3.get();
            Integer var5 = this.IlIIlIIIIl.get(var4);
            if (var5 == null) {
               var5 = iIlIlllllill(var4, entry);
               this.IlIIlIIIIl.put(var4, var5);
            }

            return var5;
         }
      }
   }

   private static boolean IilliliilIIi(class_5321<class_1959> ref, class_5321<class_1959> k) {
      return ref == k || ref.equals(k);
   }

   private static int liiiIIllIl(int dimension) {
      if (dimension == 1) {
         return 21;
      } else {
         return dimension == 2 ? 26 : 1;
      }
   }

   private static int iIlIlllllill(class_5321<class_1959> k, int dimension) {
      if (IilliliilIIi(k, class_1972.field_37543)) {
         return 2;
      } else if (IilliliilIIi(k, class_1972.field_29218)) {
         return 3;
      } else if (IilliliilIIi(k, class_1972.field_28107)) {
         return 4;
      } else if (IilliliilIIi(k, class_1972.field_9423)
         || IilliliilIIi(k, class_1972.field_9446)
         || IilliliilIIi(k, class_1972.field_9467)
         || IilliliilIIi(k, class_1972.field_9470)
         || IilliliilIIi(k, class_1972.field_9441)
         || IilliliilIIi(k, class_1972.field_9439)
         || IilliliilIIi(k, class_1972.field_9408)
         || IilliliilIIi(k, class_1972.field_9435)
         || IilliliilIIi(k, class_1972.field_9418)) {
         return 5;
      } else if (IilliliilIIi(k, class_1972.field_9438) || IilliliilIIi(k, class_1972.field_9463)) {
         return 6;
      } else if (IilliliilIIi(k, class_1972.field_9434) || IilliliilIIi(k, class_1972.field_9478) || IilliliilIIi(k, class_1972.field_9419)) {
         return 7;
      } else if (IilliliilIIi(k, class_1972.field_9424)) {
         return 8;
      } else if (IilliliilIIi(k, class_1972.field_9415) || IilliliilIIi(k, class_1972.field_9443) || IilliliilIIi(k, class_1972.field_35110)) {
         return 9;
      } else if (IilliliilIIi(k, class_1972.field_9417) || IilliliilIIi(k, class_1972.field_35118) || IilliliilIIi(k, class_1972.field_9440)) {
         return 10;
      } else if (IilliliilIIi(k, class_1972.field_9420)
         || IilliliilIIi(k, class_1972.field_9454)
         || IilliliilIIi(k, class_1972.field_35119)
         || IilliliilIIi(k, class_1972.field_35113)) {
         return 11;
      } else if (IilliliilIIi(k, class_1972.field_35117)
         || IilliliilIIi(k, class_1972.field_9453)
         || IilliliilIIi(k, class_1972.field_34472)
         || IilliliilIIi(k, class_1972.field_35115)
         || IilliliilIIi(k, class_1972.field_34474)
         || IilliliilIIi(k, class_1972.field_34471)) {
         return 12;
      } else if (IilliliilIIi(k, class_1972.field_9471) || IilliliilIIi(k, class_1972.field_38748)) {
         return 13;
      } else if (IilliliilIIi(k, class_1972.field_9475)) {
         return 14;
      } else if (IilliliilIIi(k, class_1972.field_55052)) {
         return 15;
      } else if (IilliliilIIi(k, class_1972.field_9451) || IilliliilIIi(k, class_1972.field_9455) || IilliliilIIi(k, class_1972.field_34470)) {
         return 16;
      } else if (IilliliilIIi(k, class_1972.field_9449) || IilliliilIIi(k, class_1972.field_9430) || IilliliilIIi(k, class_1972.field_35114)) {
         return 17;
      } else if (IilliliilIIi(k, class_1972.field_9462)) {
         return 18;
      } else if (IilliliilIIi(k, class_1972.field_9409)
         || IilliliilIIi(k, class_1972.field_9414)
         || IilliliilIIi(k, class_1972.field_9412)
         || IilliliilIIi(k, class_1972.field_35112)
         || IilliliilIIi(k, class_1972.field_42720)
         || IilliliilIIi(k, class_1972.field_35120)) {
         return 20;
      } else if (IilliliilIIi(k, class_1972.field_35116) || IilliliilIIi(k, class_1972.field_35111) || IilliliilIIi(k, class_1972.field_34475)) {
         return 19;
      } else if (IilliliilIIi(k, class_1972.field_9461)) {
         return 21;
      } else if (IilliliilIIi(k, class_1972.field_22077)) {
         return 22;
      } else if (IilliliilIIi(k, class_1972.field_22075)) {
         return 23;
      } else if (IilliliilIIi(k, class_1972.field_22076)) {
         return 24;
      } else if (IilliliilIIi(k, class_1972.field_23859)) {
         return 25;
      } else if (!IilliliilIIi(k, class_1972.field_9411)
         && !IilliliilIIi(k, class_1972.field_9442)
         && !IilliliilIIi(k, class_1972.field_9447)
         && !IilliliilIIi(k, class_1972.field_9457)
         && !IilliliilIIi(k, class_1972.field_9465)) {
         String var2 = k.method_29177().method_12832();
         if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","zDpyorIKykkMrVwxdmKjwf/yZEzfgq0/87VnYWOdOCF5n1zUag==">())) {
            return 2;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","jZk7DHMwFfAcKDHnpwMfcgD2t3i5K2nXwlIP2HgNcuM=">())) {
            return 3;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","JuX/XV+HMW7JFBFUW4HU2g5gpWx7yvYnc3HmJYxFAbQtXZOkSg==">())) {
            return 4;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","LFPv3N2xg/nBw5DCmkviRECHYlp0b61/gq+NLi0UUzHd">())) {
            return 5;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","4vSFggiLiarde72QGVsqedBp+dusKrRz+oS3P8HpL/GF">())) {
            return 6;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","2D673OoUeXgezvTCYmU/8SECFX8KfPNDYNdugMUyy3HL">())
            || var2.contains(lIiiIiIlilli<"lIiiIiIlilli","7zAdCoj2WvVnkLiFHCFdxhwdNm3Swnrbpm3Lt/AOi5c8">())) {
            return 7;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","vfCgfjRXuMadHxraUfKeDfYasHxPWiKrdn5LxewMtMhtSw==">())) {
            return 8;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","vOB4ijymUz9xXDpBJ5+DHYNBxHtcaZ9ZAI3KkPOygQmeTmVD">())
            || var2.contains(lIiiIiIlilli<"lIiiIiIlilli","qWEdSEB2BBM9Te/2RHucU5hyRmpwD0xMfM8dgofa6fc=">())) {
            return 9;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","BoJ/NP+2Z4zi9wFYDHFD9r2FFTH/T8TcUFmbUXXS1RA6Cw==">())) {
            return 10;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","RxGWkyh9MfzFUU8t0w9m3S+NIB6WYuumETUj5FMV1MJr">())) {
            return 11;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","7glI5gNY+JkDbfqNpUeHE2sx6efgcqFAZK2FXw0uukU=">())
            || var2.contains(lIiiIiIlilli<"lIiiIiIlilli","6Axw7G3XqcDBwUMwwZ0b2fmhzIxuFUK3BCNd7WKVqz5PvQ==">())
            || var2.contains(lIiiIiIlilli<"lIiiIiIlilli","p+VTLVqg4RmQ7ZgC6Y9uRIuWWb17MqsMsq5cusEgSA==">())) {
            return 12;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","eWjCivRFVho3wX4jYMPaZxR6bch0Gp64pWP4QHmDm/mg">())
            || var2.contains(lIiiIiIlilli<"lIiiIiIlilli","JcNa1oMDOs/8au40itfhpk5ta38XBeIUkAInc+Cu8DzVfg2V">())) {
            return 13;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","znDQVclkvXeAB8n1XKjIjuCrzKiIFnvCGGunT55OtE9PQW0GsopX">())) {
            return 14;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","Kknj36fpM0kv8rubRM+TQ5IZTQ1fG2x+J70FHhS4owA=">())) {
            return 15;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","VNrJpRyY1nCCY2jyuP3Z7ws7LbTGAVRfxKjTkkdAVZkjYA==">())
            || var2.contains(lIiiIiIlilli<"lIiiIiIlilli","MarrCLV3z2uV3RmAFDKrGqykbPvovJcRWjFuDzjX5IJQ4A==">())) {
            return 16;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","e1R0do+SXXCZMgD4OLbivWAobwn9hJgkYoBMrPJHeoFMc/I=">())) {
            return 17;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","scXNkJI622iPGtmN0R3Ati5ATFTXlGRrIxVVEMYSx856rkGl">())) {
            return 18;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","koez+WUEQFL8KlWQv4VzbN8ua53Ahr181VI2b24NbrwuLdU=">())) {
            return 22;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","zMY7jxn+pXMUXYPFzswhUVWePlTfSFLoVD+H1indzAijsQ==">())) {
            return 23;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","Tt2yK9eb/KwBQWyqALeQU2vWU2w35tbt1+Zp3Xct23k=">())) {
            return 24;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","2yaCXHR/iPXFQURu0fWPKwLH8sdCqH456OhHV4h6qK9V5g==">())) {
            return 25;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","FU22C6Z6+gngi2xY2CN8KhwSsxxLW+7qH66COPtAnkxopg==">())) {
            return 21;
         } else if (var2.contains(lIiiIiIlilli<"lIiiIiIlilli","x3mzTG5OGuUuC+4Rd4nviL914eGNy6R3E/5WMjtfKw==">())) {
            return 26;
         } else {
            return var2.contains(lIiiIiIlilli<"lIiiIiIlilli","l8M3iY4ZBsj6fQBVt213JpXqr8kbsv9R9lNmX20qm6gKTg==">()) ? 20 : liiiIIllIl(dimension);
         }
      } else {
         return 26;
      }
   }
}
