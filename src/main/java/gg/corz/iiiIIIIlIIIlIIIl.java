package gg.corz;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class iiiIIIIlIIIlIIIl {
   public static final String lIiIliIlIl = "Random";
   private final Map<String, Integer> iliIliIlIl = new HashMap<>();
   public static final List<String> IliIliIlIl = List.of(
      IlIlllIlilIl<"IlIlllIlilIl","zzX6a4S6NgfMOMXyzJUaaPoi5IEKCHVpOujgmBgcqtM=">(),
      IlIlllIlilIl<"IlIlllIlilIl","4/RBYSSoMyxykFK344cVk9sbOwl55Ml1aoAQiyRoG9w=">(),
      IlIlllIlilIl<"IlIlllIlilIl","k6LgLjVJTaCtNwSR/HMhl9MXlrKKBrPYjNKVxPuJtEymXw4CmoQ=">(),
      IlIlllIlilIl<"IlIlllIlilIl","d0pQ/x5Rdd44GgE0NEItLrpJAtARsSwpu6rnR96sbPQ3Cno=">(),
      IlIlllIlilIl<"IlIlllIlilIl","HN0ZqqaJyW8Q1tqKNpPncbW5H/WUf7/hOeEKQVOnvYK6Bls=">(),
      IlIlllIlilIl<"IlIlllIlilIl","0uO9D6P5RI5HAzjmSenj0nw0WqVUlJsW29uwpB7WV1g=">()
   );
   public static final int lliIliIlIl = 2;
   private int IiiIliIlIl;
   public static final List<String> iIiIliIlIl = List.of(
      IlIlllIlilIl<"IlIlllIlilIl","O5rTR47TILCh0Gbh7s7pm/EeXvY58o1fj3lLPryu98PzwQ==">(),
      IlIlllIlilIl<"IlIlllIlilIl","Urpq8ZZc0fJmeTF6EHlyWgFCvhtBfVM/Ulzxv8qW0uk=">(),
      IlIlllIlilIl<"IlIlllIlilIl","5ikfiANmNwzP5pJs9rDFbf3vbzRqRLBRPATGisNKy6s=">(),
      IlIlllIlilIl<"IlIlllIlilIl","nsJDklJ4anqzO5NoDBE2Go3Iiuu5pjpzkgqGjYvJi+szRTc5O1Y=">(),
      IlIlllIlilIl<"IlIlllIlilIl","mUGeQfxxNBGZAmdd10RMggujX5bpq82V2kspqdwN/zz3h7U=">(),
      IlIlllIlilIl<"IlIlllIlilIl","z7JlnYHHYL3B6u856bLJS4AhpobgZwGPkUOxQcY1wKeeYHs=">(),
      IlIlllIlilIl<"IlIlllIlilIl","QaDaSWs0PwwkEV21KYou3XLcWOXoQnE5dT9apg7ysI0=">()
   );

   public void iliIiiliiiii(String region) {
      if (region != null) {
         this.iliIliIlIl.remove(region);
      }
   }

   public int IIIllIIliIIl(String region) {
      return this.iliIliIlIl.getOrDefault(region, 0);
   }

   public void lIiiIiIlilli(String region) {
      if (liiiIIllIl(region)) {
         this.iliIliIlIl.merge(region, 1, Integer::sum);
      }
   }

   public void IliIlllilIi() {
      this.iliIliIlIl.clear();
      this.IiiIliIlIl = 0;
   }

   public static String iIlIlllllill(String choice) {
      if (choice == null) {
         return null;
      } else {
         String var1 = choice.trim().toLowerCase(Locale.ROOT);
         return liiiIIllIl(var1) ? var1 : null;
      }
   }

   public String IilliliilIIi(String choice) {
      String var2 = iIlIlllllill(choice);
      if (var2 != null) {
         return var2;
      } else {
         int var3 = IliIliIlIl.size();

         for (int var4 = 0; var4 < var3; var4++) {
            String var5 = IliIliIlIl.get(Math.floorMod(this.IiiIliIlIl + var4, var3));
            if (this.iliIliIlIl.getOrDefault(var5, 0) < 2) {
               this.IiiIliIlIl = Math.floorMod(this.IiiIliIlIl + var4 + 1, var3);
               return var5;
            }
         }

         this.iliIliIlIl.clear();
         String var6 = IliIliIlIl.get(Math.floorMod(this.IiiIliIlIl, var3));
         this.IiiIliIlIl = Math.floorMod(this.IiiIliIlIl + 1, var3);
         return var6;
      }
   }

   public static boolean liiiIIllIl(String region) {
      return region != null && IliIliIlIl.contains(region);
   }
}
