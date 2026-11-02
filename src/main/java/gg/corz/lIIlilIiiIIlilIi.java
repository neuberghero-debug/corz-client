package gg.corz;

import java.util.Locale;

public final class lIIlilIiiIIlilIi {
   public static lIliIIiliIliIIil liiiIIllIl(String mobId) {
      long var4 = 7832172997509658273L;
      String var1 = IliIlllilIi(mobId);
      if (var1 == null) {
         return lIliIIiliIliIIil.lliiilIIil;
      } else {
         var4 ^= (-4294967296L ^ var4) & -1L << 32;
         switch (var1.hashCode()) {
            case -1346697846:
               if (var1.equals(IilliliilIIi<"IilliliilIIi","iUKdJfUUP1zRDXh8LmuPwtNgw8sfkG2ZwCu+YK98vHjRngepX+8qExxlRCpCvNslJQ==">())) {
                  var4 ^= (12884901888L ^ var4) & -1L << 32;
               }
               break;
            case -1237731462:
               if (var1.equals(IilliliilIIi<"IilliliilIIi","Du8s8500bn7HbzH7lXXBPi6xr7v4yyudlUDkrYCAiKYif5GLwS5fectoAr0C5A==">())) {
                  var4 ^= (4294967296L ^ var4) & -1L << 32;
               }
               break;
            case -1149900107:
               if (var1.equals(IilliliilIIi<"IilliliilIIi","WrQxNVmSeYiYNsZ6Z46oD+alCHtDVZVK7eBGCvPMAliCWqLiTAN4nxqWSg==">())) {
                  var4 ^= (17179869184L ^ var4) & -1L << 32;
               }
               break;
            case -796557998:
               if (var1.equals(IilliliilIIi<"IilliliilIIi","I6N6Lb05dEO5u2hqhL8GOUY/YVU2rQwktB6yrVR5goT7ixhbWLzPDeLff3A=">())) {
                  var4 ^= (8589934592L ^ var4) & -1L << 32;
               }
               break;
            case -596960109:
               if (var1.equals(IilliliilIIi<"IilliliilIIi","boz+7Y6JDwFwVHHxgm8y/znSTRSBwdOQsR2HccQ34dvbbWPlaKXeAybiCZo=">())) {
                  var4 ^= (0L ^ var4) & -1L << 32;
               }
         }
         return switch ((int)(var4 >>> 32)) {
            case 0 -> lIliIIiliIliIIil.liliilIIil;
            case 1 -> lIliIIiliIliIIil.iiliilIIil;
            case 2 -> lIliIIiliIliIIil.IIiiilIIil;
            case 3 -> lIliIIiliIliIIil.lIiiilIIil;
            case 4 -> lIliIIiliIliIIil.iIiiilIIil;
            default -> lIliIIiliIliIIil.IliiilIIil;
         };
      }
   }

   private lIIlilIiiIIlilIi() {
   }

   public static String iIlIlllllill(String mobId) {
      long var7 = 4992106063888839032L;
      long var9 = 1540379064195717622L;
      String var1 = IliIlllilIi(mobId);
      if (var1 == null) {
         return IilliliilIIi<"IilliliilIIi","4hdra8qX37qxxpt+ZPIrn6mQhKSvR5Jt9wj+4UZ+5VQCJjE=">();
      } else {
         String var2 = var1.substring(var1.indexOf(58) + 1);
         StringBuilder var3 = new StringBuilder(var2.length());
         var7 ^= (4294967296L ^ var7) & -1L << 32;
         var7 ^= (0L ^ var7) & -1L >>> 32;

         while ((int)var7 < var2.length()) {
            var9 ^= ((long)var2.charAt((int)var7) << 32 ^ var9) & -1L << 32;
            if ((int)(var9 >>> 32) != 95 && (int)(var9 >>> 32) != 47 && (int)(var9 >>> 32) != 46) {
               var3.append((char)((int)(var7 >>> 32) != 0 ? Character.toUpperCase((char)((int)(var9 >>> 32))) : (int)(var9 >>> 32)));
               var7 ^= (0L ^ var7) & -1L << 32;
            } else {
               var3.append(' ');
               var7 ^= (4294967296L ^ var7) & -1L << 32;
            }

            var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
         }

         return var3.toString();
      }
   }

   public static String IliIlllilIi(String id) {
      if (id == null) {
         return null;
      } else {
         String var1 = id.trim().toLowerCase(Locale.ROOT);
         if (var1.isEmpty()) {
            return null;
         } else {
            return var1.indexOf(58) < 0 ? IilliliilIIi<"IilliliilIIi","wlYrCJmzyXokOOZPyeTcLOLtCuUWs21+TMFO5gfHsOzn/DXg9vI=">() + var1 : var1;
         }
      }
   }
}
