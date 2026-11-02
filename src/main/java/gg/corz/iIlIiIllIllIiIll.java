package gg.corz;

import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class iIlIiIllIllIiIll {
   private static final String IIIIililll = "abcdefghijklmnopqrstuvwyz";
   private static final Pattern lIIIililll = Pattern.compile(
      IIIllIIliIIl<"IIIllIIliIIl","tIA/acbL0VfenGQ3dIdRZsgjl0Bbxis+e2tGAOpJGcH5eICBElLsBvUyKDdLClNEgmekqZMeuwT7xkBR9owjkt/7KcnjyyUpc3Y5EraVT9mhGpMJRz6ytARIP4h2YwThK2zu4Al9L0xKeQ==">()
   );
   private final int IiIIililll;
   final int iIIIililll;
   private final List<IiIiIIIlliIiIIIl> ilIIililll;
   final int llIIililll;
   private static final String iiiillilll = "\u1d00\u0299\u1d04\u1d05\u1d07\ua730\u0262\u029c\u026a\u1d0a\u1d0b\u029f\u1d0d\u0274\u1d0f\u1d18\u01eb\u0280\ua731\u1d1b\u1d1c\u1d20\u1d21\u028f\u1d22";
   final int IlIIililll;

   static IilIIIlllilIIIll liiiIIllIl(boolean name, boolean bone, String empty) {
      if (name) {
         return IilIIIlllilIIIll.IIIIiiIlll;
      } else if (bone) {
         return IilIIIlllilIIIll.lIIIiiIlll;
      } else {
         String var3 = iliIiiliiiii(empty);
         if (var3.contains(IIIllIIliIIl<"IIIllIIliIIl","NByp0O0ykkvBGBxQ1/4BPfxpgYD/4kClVSxok1pu1bo=">())) {
            return IilIIIlllilIIIll.ilIIiiIlll;
         } else if (var3.contains(IIIllIIliIIl<"IIIllIIliIIl","RHq0MJGwrYjre19cGvCR4Ij8xLAzSyhsFfjtDLgurOA=">())) {
            return IilIIIlllilIIIll.IlIIiiIlll;
         } else if (var3.contains(IIIllIIliIIl<"IIIllIIliIIl","Pvv6DBxFtHy2Ser4I6DJQpfeDnNFo73E0N1Q2Jif8EQ=">())
            || var3.contains(IIIllIIliIIl<"IIIllIIliIIl","hYuWRicTtuEhBlIirvL/9qvRyNlMBG1lYZ+MMSu+DZM=">())) {
            return IilIIIlllilIIIll.llIIiiIlll;
         } else {
            return var3.contains(IIIllIIliIIl<"IIIllIIliIIl","xfVL578DrfKesJHScUhe/5rLvILuJxGDR9dXe3P0gUs=">())
                  && !var3.equals(IIIllIIliIIl<"IIIllIIliIIl","0ss8bvamipgvdevZcGjOpvKmT3rm6PKWDsovQ52NOdAVrfo=">())
               ? IilIIIlllilIIIll.iIIIiiIlll
               : IilIIIlllilIIIll.IiIIiiIlll;
         }
      }
   }

   static iIlIiIllIllIiIll IliIlllilIi(List<IiIiIIIlliIiIIIl> cells) {
      int var1 = Integer.MIN_VALUE;
      int var2 = Integer.MAX_VALUE;

      for (IiIiIIIlliIiIIIl var4 : cells) {
         var1 = Math.max(var1, var4.iIlIlllllill());
         var2 = Math.min(var2, var4.iIlIlllllill());
      }

      if (!cells.isEmpty() && var2 != var1) {
         int var8 = 0;
         int var9 = -1;
         int var5 = -1;

         for (IiIiIIIlliIiIIIl var7 : cells) {
            if (var7.iIlIlllllill() != var1) {
               if (var7.IilliliilIIi() == IilIIIlllilIIIll.lIIIiiIlll) {
                  var8 += var7.lIiiIiIlilli();
               }
            } else if (var7.IilliliilIIi() == IilIIIlllilIIIll.iIIIiiIlll) {
               var9 = var7.IliIlllilIi();
            } else if (var7.IilliliilIIi() == IilIIIlllilIIIll.IlIIiiIlll && var5 < 0) {
               var5 = var7.IliIlllilIi();
            }
         }

         return new iIlIiIllIllIiIll(cells, var1, var9, var5, var8);
      } else {
         return new iIlIiIllIllIiIll(cells, Integer.MIN_VALUE, -1, -1, 0);
      }
   }

   static String iliIiiliiiii(String name) {
      if (name == null) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(name.length());

         for (int var2 = 0; var2 < name.length(); var2++) {
            char var3 = name.charAt(var2);
            int var4 = IIIllIIliIIl<"IIIllIIliIIl","yOxzTqHA+ScS+VZzJgnzrAJS/iv+NhMWI+pV2EESZ/GOl9PG2Q5bH8MGKzP8OPCKUiG5jPkq+oSnbMPt3hWT/AYjrZVNsVeinV3a8HFjq4RS2sCxE/+LztTCwFl96A==">()
               .indexOf(var3);
            var1.append(
               var4 >= 0 ? IIIllIIliIIl<"IIIllIIliIIl","SKsVxkjUWV+G2VP9PaLVOrwr+wdFBpU7Ebp3fbpnFuIKZR3bJl0hOYxO3kJqxtvtCOynvYE=">().charAt(var4) : var3
            );
         }

         return var1.toString().toLowerCase(Locale.ROOT);
      }
   }

   private iIlIiIllIllIiIll(List<IiIiIIIlliIiIIIl> dropSlot, int controlY, int bones, int cells, int nextSlot) {
      this.ilIIililll = dropSlot;
      this.IiIIililll = controlY;
      this.iIIIililll = bones;
      this.IlIIililll = cells;
      this.llIIililll = nextSlot;
   }

   static long lIiiIiIlilli(String line) {
      long var6 = -5498367343183581033L;
      Matcher var1 = lIIIililll.matcher(line);
      if (!var1.find()) {
         return -1L;
      } else {
         String var2 = var1.group(1);
         String var3 = var1.group(2);

         try {
            if (var3 == null) {
               return Long.parseLong(
                  var2.replace(IIIllIIliIIl<"IIIllIIliIIl","XhxRuOJM7oo0PQZ9bG9dl81n/cEfqBx5CgrAlCo=">(), "")
                     .replace(IIIllIIliIIl<"IIIllIIliIIl","K9UKbc98TARd8fUfVoCdNlhdujp/zdMaoIBjrYo=">(), "")
               );
            } else {
               var6 ^= (
                     (long)Math.max(
                              var2.lastIndexOf(-(~-1135718975 * 1041204193) ^ 486186412),
                              var2.lastIndexOf(((889860510 << 19 | 889860510 >>> 13) - -89) * 1556147571 + 3 ^ -1590417843)
                           )
                           << 32
                        ^ var6
                  )
                  & -1L << 32;
               String var5 = (int)(var6 >>> 32) < 0
                  ? var2
                  : var2.substring(0, (int)(var6 >>> 32))
                        .replace(IIIllIIliIIl<"IIIllIIliIIl","XhxRuOJM7oo0PQZ9bG9dl81n/cEfqBx5CgrAlCo=">(), "")
                        .replace(IIIllIIliIIl<"IIIllIIliIIl","K9UKbc98TARd8fUfVoCdNlhdujp/zdMaoIBjrYo=">(), "")
                     + IIIllIIliIIl<"IIIllIIliIIl","K9UKbc98TARd8fUfVoCdNlhdujp/zdMaoIBjrYo=">()
                     + var2.substring((int)(var6 >>> 32) + 1);
               return Math.round(
                  Double.parseDouble(var5)
                     * (double)(
                        var3.equals(IIIllIIliIIl<"IIIllIIliIIl","Y+mwJL9Seqlb3j8A+0zzEEytvZpnuTzvOn/6jE0=">())
                           ? (-1710662592 * 85 ^ 37) + -11 ^ 622568114
                           : ((-239496961 + 67) * 85 << 13 | (-239496961 + 67) * 85 >>> 19) ^ -1487795693
                     )
               );
            }
         } catch (NumberFormatException var8) {
            return -1L;
         }
      }
   }

   long iIlIlllllill(int ignoreSlot) {
      long var2 = 1L;

      for (IiIiIIIlliIiIIIl var5 : this.ilIIililll) {
         if (var5.IliIlllilIi() != ignoreSlot) {
            var2 = var2 * 31L + (long)var5.IliIlllilIi();
            var2 = var2 * 31L + (long)var5.IilliliilIIi().ordinal();
            if (var5.iIlIlllllill() != this.IiIIililll) {
               var2 = var2 * 31L + (long)var5.lIiiIiIlilli();
               var2 = var2 * 31L + (long)var5.iliIiiliiiii();
            }
         }
      }

      return var2;
   }

   static int IilliliilIIi(List<String> lore) {
      for (String var2 : lore) {
         String var3 = iliIiiliiiii(var2);
         if (var3.contains(IIIllIIliIIl<"IIIllIIliIIl","uHyXERp4F2To8wdd6CfkLdBjWn8MDyR7GflsNdWa17k=">())
            && !var3.contains(IIIllIIliIIl<"IIIllIIliIIl","aBmGYVKpwd5uq8GItiwML0mCF1/LeGxVntWACrerIdDmKhYzhA==">())
            && !var3.contains(IIIllIIliIIl<"IIIllIIliIIl","59jvsa50VlHt+TDaKDfWsDW+hnLtPnxW9AX2ybgL6azGQLVEvRM=">())) {
            long var4 = lIiiIiIlilli(var3);
            if (var4 >= 0L) {
               return (int)Math.min(2147483647L, var4);
            }
         }
      }

      return -1;
   }
}
