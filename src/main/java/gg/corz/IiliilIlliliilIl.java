package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

final class IiliilIlliliilIl {
   static final int IiIIIIiIll = 3;
   static final int IIiIIIiIll = 100;
   static final int lliiiilIll = 24;
   static final int lIlIIIiIll = 8;
   static final int iIiiiilIll = 6;
   static final int IIiiiilIll = 6;
   static final int liliiilIll = 1;
   static final int iiIIIIiIll = 3;
   static final int illIIIiIll = 8;
   static final int llIIIIiIll = 2;
   static final int liiiiilIll = 5;
   static final int lIiiiilIll = 48;
   static final int IIlIIIiIll = 4;
   static final int lllIIIiIll = 2;
   static final int liIIIIiIll = 3;
   static final int iIIIIIiIll = 3;
   static final int iIiIIIiIll = 8;
   static final int iilIIIiIll = 40;
   static final double IiiiiilIll = 1.5;
   static final int IliiiilIll = 36;
   static final int iliiiilIll = 9;
   static final int IlIIIIiIll = 3;
   static final int iiliiilIll = 2;
   static final int iiiiiilIll = 3;
   static final int lIIIIIiIll = 8;
   static final int ilIIIIiIll = 6;
   static final int lilIIIiIll = 3;
   static final int iIlIIIiIll = 4;
   static final int IiliiilIll = 0;
   static final int IIIIIIiIll = 3;
   static final int lIiIIIiIll = 3;
   static final int IllIIIiIll = 20;
   static final int IilIIIiIll = 3;

   static boolean iIlIlllllill(List<ilIlIIilIiIlIIil> spawners) {
      for (ilIlIIilIiIlIIil var2 : spawners) {
         for (ilIlIIilIiIlIIil var4 : spawners) {
            if (var2 != var4
               && Math.max(
                     Math.abs(var2.IlIiIlIIil - var4.IlIiIlIIil),
                     Math.max(Math.abs(var2.llIiIlIIil - var4.llIiIlIIil), Math.abs(var2.ilIiIlIIil - var4.ilIiIlIIil))
                  )
                  <= 2) {
               return true;
            }
         }
      }

      return false;
   }

   private IiliilIlliliilIl() {
   }

   static int IliIlllilIi(int sensitivity) {
      return (748955201 * 1749801491 * 25 * 65 ^ 58387279)
         - Math.max(
            1, Math.min(((-1190970143 << 17 | -1190970143 >>> 15) >>> 31 | (-1190970143 << 17 | -1190970143 >>> 15) << 1) - 127 ^ -209263739, sensitivity)
         );
   }

   static lilIiIIliilIiIIl liiiIIllIl(
      List<ilIlIIilIiIlIIil> chestType, ToIntFunction<ilIlIIilIiIlIIil> dimension, int cells, IIllillIllil sensitivity, int guard
   ) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      ArrayList var25 = new ArrayList();

      for (ilIlIIilIiIlIIil var27 : chestType) {
         switch (var27.IlliIlIIil) {
            case 1:
               int var28 = dimension.applyAsInt(var27);
               if (var28 == 1) {
                  var5++;
               } else if (var28 == 2) {
                  var6++;
               } else if (!var27.iliIiiliiiii(64)) {
                  var7++;
               }
               break;
            case 2:
               if (!var27.iliIiiliiiii(64)) {
                  var7++;
               }
               break;
            case 3:
               var9++;
               break;
            case 4:
               var10++;
               break;
            case 5:
               var8++;
               break;
            case 6:
               var18++;
               break;
            case 7:
               var21++;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 47:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 107:
            default:
               break;
            case 9:
            case 15:
               var22++;
               break;
            case 23:
               var19++;
               break;
            case 24:
               var20++;
               break;
            case 25:
               var12++;
               break;
            case 26:
               var11++;
               break;
            case 27:
               var13++;
               break;
            case 28:
               var14++;
               break;
            case 29:
            case 33:
            case 45:
            case 46:
               var23++;
               break;
            case 30:
               var15++;
               break;
            case 31:
               var16++;
               break;
            case 32:
               var17++;
               break;
            case 49:
               var25.add(var27);
               break;
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 108:
               var24++;
         }
      }

      int var45 = Math.max(var5, var6);
      var7 += var5 + var6 - 2 * Math.min(var5, var6);
      boolean var46 = sensitivity == IIllillIllil.lilIIiliiilIIili;
      boolean var47 = sensitivity != IIllillIllil.iIiIIiliIliIIili;
      boolean var29 = !var25.isEmpty() && (var21 > 0 || iIlIlllllill(var25));
      int var30 = var9 + var8 + var11 + var14 + var16 + var23 + var22;
      int var31 = (sensitivity == IIllillIllil.iIiIIiliIliIIili ? 0 : Math.min(48, 6 * var45))
         + Math.min(36, 6 * var9)
         + (int)Math.min(24L, Math.round(1.5 * (double)(var8 + (var46 ? var7 : 0))));
      int var32 = (var14 > 0 ? 8 : 0) + (var11 > 0 ? 5 : 0) + (var16 > 0 ? 3 : 0) + Math.min(4, var22 + (var47 ? var21 : 0)) + (var23 > 0 ? 3 : 0);
      int var33 = (var15 + 1) / 2;
      if (var46) {
         var32 += (var12 > 0 ? 3 : 0)
            + (var13 > 0 ? 3 : 0)
            + (var33 > 0 ? 3 : 0)
            + (var17 >= 6 ? 3 : 0)
            + Math.min(3, var18)
            + Math.min(1, var19)
            + Math.min(3, var20)
            + (var10 > 0 && guard != 2 ? 2 : 0);
      }

      int var34 = var29 && var47 ? Math.min(20, 8 + 4 * (var25.size() - 1)) : 0;
      int var35 = var24 >= 8 && var46 ? 3 : 0;
      int var36 = (var12 > 0 ? 1 : 0) + (var13 > 0 ? 1 : 0) + (var33 > 0 ? 1 : 0) + (var16 > 0 ? 1 : 0) + (var14 > 0 ? 1 : 0);
      boolean var37 = var11 > 0 && var36 >= 2 && var46;
      boolean var38 = var31 >= 9 || var14 > 0 || var34 > 0 || var37;
      if (guard != 0 && var30 == 0 && var45 < 3) {
         var38 = false;
      }

      int var39 = var31 + var32 + var34 + var35;
      int var40 = IliIlllilIi(cells);
      if (var38 && var39 >= var40) {
         int var41 = Math.max(40, Math.min(100, 40 + 3 * (var39 - var40)));
         ArrayList var42 = new ArrayList(4);
         if (var45 > 0 && sensitivity != IIllillIllil.iIiIIiliIliIIili) {
            var42.add(
               var45 == 1
                  ? IilliliilIIi<"IilliliilIIi","QYnp1ppIEhRghcv9SveTECesnAymOgQ7ismvg8vRFso5GHcST8FfjQ==">()
                  : var45 + IilliliilIIi<"IilliliilIIi","KWkBb/Oy0Wc7tQMI1vkscIHUqtNvOsNGL1S6dr/4zApJtzSmhtFqryHY">()
            );
         }

         if (var9 > 0) {
            var42.add(
               var9 == 1
                  ? IilliliilIIi<"IilliliilIIi","vfT/xRO/P11ZpKYSI6YDX/KbK8kfD8qWWL7PT+qs47mKUY/NXKUb">()
                  : var9 + IilliliilIIi<"IilliliilIIi","ewfcqpInWBCfefI/dfhnGD9PmaHvoYOtrhbaQi05SSSuwvAb2SEiAQYu">()
            );
         }

         if (var14 > 0) {
            var42.add(IilliliilIIi<"IilliliilIIi","QCv7TZBVqY8iwcg4YXiacqeOWhmtFMqNyqJGo8DyML6pgg==">());
         }

         if (var34 > 0) {
            var42.add(
               var25.size() == 1
                  ? IilliliilIIi<"IilliliilIIi","dhn7DTb1z5DvzHVACtUmLOdeb/uoGCelcqCP7G/u4klZm6i9qT0hwA==">()
                  : var25.size() + IilliliilIIi<"IilliliilIIi","FgcFAHYLluubQlj5ERIa3mBneslQlu5ZFBKXe3/4Qu2My5N+CQ==">()
            );
         }

         if (var11 > 0) {
            var42.add(IilliliilIIi<"IilliliilIIi","jL3N0pBxmfijoIHSwplYVIRcHTGnDHxF9UtF6kZpFIyAH8BAvj7vof+Fj/0=">());
         }

         if (var46 && var7 + var8 > 0) {
            var42.add(
               var7 + var8 == 1
                  ? IilliliilIIi<"IilliliilIIi","BRG58VoGRQkX2fhITnKSzIuKBd0kHXbIvnzPKEZ819po">()
                  : var7 + var8 + IilliliilIIi<"IilliliilIIi","74UnsUOy3RiDa7COtQHA3pA1nRwHnTk9DRNkpr3Sz2J2LoA=">()
            );
         }

         if (var46 && var12 > 0) {
            var42.add(IilliliilIIi<"IilliliilIIi","4wvikFN4ZgZzKmuLxvdc6abI1HvODZwB4neIJofi/puv">());
         }

         if (var46 && var13 > 0) {
            var42.add(IilliliilIIi<"IilliliilIIi","jNznbQy1ayHYGEwN/Satlfo3VqlXDZ3VctQTeFP/lMeWECHlhGX0Udc=">());
         }

         if (var46 && var33 > 0) {
            var42.add(
               var33 == 1
                  ? IilliliilIIi<"IilliliilIIi","rroD6eX7VMfwGF5Gk6Inv0l8Kl0loznss/1NrIEFBw==">()
                  : var33 + IilliliilIIi<"IilliliilIIi","rAVaXXeHb2Ql38zWUYs4Jay3dJahBN7J9I4qEKybKrK4">()
            );
         }

         String var43 = String.join(IilliliilIIi<"IilliliilIIi","n43vHvUZRojS5dPd7lzy3Oc1ovCUWRX2/HEjVv4U">(), var42.subList(0, Math.min(3, var42.size())));
         if (!var43.isEmpty()) {
            var43 = Character.toUpperCase(var43.charAt(0)) + var43.substring(1);
         }

         return new lilIiIIliilIiIIl(var41, var39, var43);
      } else {
         return lilIiIIliilIiIIl.IiiiIIilIl;
      }
   }
}
