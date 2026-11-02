package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public final class IiiIlliiIl {
   public static final int Iillllllilllll = 5;
   public static final String lllllllillllll = "XP Bottle";
   private static final Map<String, class_1792> iIlllllIllllll = new LinkedHashMap<>();
   private static final Map<String, class_1792> IIllllllIlllll = new LinkedHashMap<>();

   public static boolean iliIiiliiiii(class_1792 item) {
      return item == class_1802.field_8287;
   }

   public static String IilliliilIIi(class_1792 item) {
      if (item == null) {
         return null;
      } else {
         for (Entry var2 : IIllllllIlllll.entrySet()) {
            if (var2.getValue() == item) {
               return (String)var2.getKey();
            }
         }

         return class_7923.field_41178.method_10221(item).toString();
      }
   }

   public static int IIIllIIliIIl(class_1792 item) {
      return iliIiiliiiii(item) ? 5 : 0;
   }

   public static String lIiiIiIlilli(String nameOrId) {
      if (nameOrId == null) {
         return IiIlliIliiIl<"IiIlliIliiIl","hwyQ/Z84tBPcI4FJM0tk++zclV76zbMcPy7MKpM=">();
      } else if (!IIllllllIlllll.containsKey(nameOrId) && !iIlllllIllllll.containsKey(nameOrId) && nameOrId.indexOf(58) >= 0) {
         class_1792 var1 = iIlIlllllill(nameOrId);
         return var1 == null ? nameOrId : IlIlllIlilIl(var1);
      } else {
         return nameOrId;
      }
   }

   private IiiIlliiIl() {
   }

   public static String[] liiiIIllIl() {
      return new String[]{
         IiIlliIliiIl<"IiIlliIliiIl","AD8Tei1lHJU6XTcYBQYXPgbWxUsXvqjT+ss50tnsBfArQaM=">(),
         IiIlliIliiIl<"IiIlliIliiIl","t69WymexB2NF5jQ+17/bY0GXDqwtfgyKobMl4e291zMgb8mS6J3U">(),
         IiIlliIliiIl<"IiIlliIliiIl","7EwCKBhQTjyTy0DLFN6Ww0bMYBVP6nfGDW78E/sEz/NB">(),
         IiIlliIliiIl<"IiIlliIliiIl","wdJYYMBQuN689eObNA+yLt8yQv28LpzFGzuVXu4Il7ZdJA==">(),
         IiIlliIliiIl<"IiIlliIliiIl","49GCMZTf/2yzboD82lLwqoCBBDpg2LAOw4qrb5epXAvExA==">(),
         IiIlliIliiIl<"IiIlliIliiIl","SqCdvaYjmPbbWHEb7ocdv9OV54yRtaaHn9XdEt932QHeXYBX">(),
         IiIlliIliiIl<"IiIlliIliiIl","jRJhbptJfUtzs1cu2CK9MAps5+F1nIDkqfXSr1WFWGg/4f0EWpox/JU=">(),
         IiIlliIliiIl<"IiIlliIliiIl","0GmWyi/B/yW1bBdKH5Z2XgiMPi6XUAPfTvrS11KswvI6">(),
         IiIlliIliiIl<"IiIlliIliiIl","j1pwwNLgKgt6joYTPns732DsoQR/0TBPLeSx/hdHRbQ=">(),
         IiIlliIliiIl<"IiIlliIliiIl","1cW7WSYPWK0KNDCbAWrlz6VP8vsrO0XIJZHj9QpIyIXszkVnaRE=">(),
         IiIlliIliiIl<"IiIlliIliiIl","8ed5Pn64fVY+3ERgI3/e/mO7nug9Wgkfgft17EwoWhcs77zHEKg=">(),
         IiIlliIliiIl<"IiIlliIliiIl","ZyECknmFT++iqPK6WKcY4ZP2mmsus2XiUp8FTqUpbZrcRbQx5D59ag==">(),
         IiIlliIliiIl<"IiIlliIliiIl","QgrKIUUEeeeVkxVVBnO3ktGEaf89gEKwQHd8xajFqDlfJA==">(),
         IiIlliIliiIl<"IiIlliIliiIl","FnEwD606qxOuk7yrkVxT/nmiWPXYcA702JWcPNB1hOGaDCQ=">(),
         IiIlliIliiIl<"IiIlliIliiIl","qKCsV/jiAgKi4CSjadW/htW09eQoReEt+eM9QTzPTIM1hyW19hY=">(),
         IiIlliIliiIl<"IiIlliIliiIl","0ngyI3sz9eTy53Jk5YctNuuUTOQ8gpl0ZLXuLrXWVJhXTju/gQ==">(),
         IiIlliIliiIl<"IiIlliIliiIl","61k28A1GghUa8FQpSjsiGZr2EtiPdePLRNsCD81qls63R2f1wDW2oMAAWeI=">(),
         IiIlliIliiIl<"IiIlliIliiIl","88eYO2rMYU4BzKGpCsNnDCvy7GCMmkxDpU4PoDIn7dkb">()
      };
   }

   public static class_1792 iIlIlllllill(String displayName) {
      if (displayName == null) {
         return null;
      } else {
         class_1792 var1 = IIllllllIlllll.get(displayName);
         if (var1 != null) {
            return var1;
         } else {
            var1 = iIlllllIllllll.get(displayName);
            if (var1 == null && displayName.indexOf(58) >= 0) {
               class_2960 var2 = class_2960.method_12829(displayName);
               if (var2 == null) {
                  return null;
               } else {
                  class_1792 var3 = (class_1792)class_7923.field_41178.method_63535(var2);
                  return var3 != null && var3 != class_1802.field_8162 ? var3 : null;
               }
            } else {
               return var1;
            }
         }
      }
   }

   public static String IlIlllIlilIl(class_1792 item) {
      long var10 = 8020285730239638188L;
      long var12 = -1575344090154421178L;
      if (item == null) {
         return IiIlliIliiIl<"IiIlliIliiIl","hwyQ/Z84tBPcI4FJM0tk++zclV76zbMcPy7MKpM=">();
      } else {
         for (Entry var2 : IIllllllIlllll.entrySet()) {
            if (var2.getValue() == item) {
               return (String)var2.getKey();
            }
         }

         for (Entry var16 : iIlllllIllllll.entrySet()) {
            if (var16.getValue() == item) {
               return (String)var16.getKey();
            }
         }

         String var15 = item.method_7876();
         var10 ^= ((long)var15.lastIndexOf(46) << 32 ^ var10) & -1L << 32;
         String var3 = (int)(var10 >>> 32) >= 0 ? var15.substring((int)(var10 >>> 32) + 1) : var15;
         String[] var4 = var3.replace('_', ' ').split(IiIlliIliiIl<"IiIlliIliiIl","iTVKrUyGSTcJvRQrftcy0p8UJD8r/f4hgrTQjd8=">());
         StringBuilder var5 = new StringBuilder();
         String[] var6 = var4;
         var10 ^= ((long)var4.length ^ var10) & -1L >>> 32;

         for (long var19 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var19 >>> 32) < (int)var10; var19 += 4294967296L) {
            String var9 = var6[(int)(var19 >>> 32)];
            if (!var9.isEmpty()) {
               if (var5.length() > 0) {
                  var5.append(' ');
               }

               var5.append(Character.toUpperCase(var9.charAt(0))).append(var9.substring(1));
            }
         }

         return var5.toString();
      }
   }

   public static String[] IliIlllilIi() {
      long var4 = -3954698031844370073L;
      String[] var0 = new String[IIllllllIlllll.size() + iIlllllIllllll.size()];
      var4 ^= (0L ^ var4) & -1L << 32;

      for (String var3 : IIllllllIlllll.keySet()) {
         int var10001 = (int)(var4 >>> 32);
         var4 += 4294967296L;
         var0[var10001] = var3;
      }

      for (String var7 : iIlllllIllllll.keySet()) {
         int var9 = (int)(var4 >>> 32);
         var4 += 4294967296L;
         var0[var9] = var7;
      }

      return var0;
   }

   static {
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","anDod9DwrkMGxrcQy3htqDbst3aTotdq0YsADIWzaT5Wqsw=">(), class_1802.field_8687);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","JRbEzrYqkjTsAABzFclS1zuwQJK9t3axrnwQjwwXDg6xIYUKF5dVzybR">(), class_1802.field_8598);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","oUKKNAXTDFv5Ag7gwc+n8WpUIuPjdSC5YVLNim9V83w=">(), class_1802.field_8529);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","88eYO2rMYU4BzKGpCsNnDCvy7GCMmkxDpU4PoDIn7dkb">(), class_1802.field_8407);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","AD8Tei1lHJU6XTcYBQYXPgbWxUsXvqjT+ss50tnsBfArQaM=">(), class_1802.field_17518);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","t69WymexB2NF5jQ+17/bY0GXDqwtfgyKobMl4e291zMgb8mS6J3U">(), class_1802.field_8497);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","7EwCKBhQTjyTy0DLFN6Ww0bMYBVP6nfGDW78E/sEz/NB">(), class_1802.field_8861);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","wdJYYMBQuN689eObNA+yLt8yQv28LpzFGzuVXu4Il7ZdJA==">(), class_1802.field_8179);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","49GCMZTf/2yzboD82lLwqoCBBDpg2LAOw4qrb5epXAvExA==">(), class_1802.field_8567);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","SqCdvaYjmPbbWHEb7ocdv9OV54yRtaaHn9XdEt932QHeXYBX">(), class_1802.field_8186);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","jRJhbptJfUtzs1cu2CK9MAps5+F1nIDkqfXSr1WFWGg/4f0EWpox/JU=">(), class_1802.field_16998);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","0GmWyi/B/yW1bBdKH5Z2XgiMPi6XUAPfTvrS11KswvI6">(), class_1802.field_8600);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","j1pwwNLgKgt6joYTPns732DsoQR/0TBPLeSx/hdHRbQ=">(), class_1802.field_8713);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","1cW7WSYPWK0KNDCbAWrlz6VP8vsrO0XIJZHj9QpIyIXszkVnaRE=">(), class_1802.field_8620);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","8ed5Pn64fVY+3ERgI3/e/mO7nug9Wgkfgft17EwoWhcs77zHEKg=">(), class_1802.field_8695);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","ZyECknmFT++iqPK6WKcY4ZP2mmsus2XiUp8FTqUpbZrcRbQx5D59ag==">(), class_1802.field_8511);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","QgrKIUUEeeeVkxVVBnO3ktGEaf89gEKwQHd8xajFqDlfJA==">(), class_1802.field_8276);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","FnEwD606qxOuk7yrkVxT/nmiWPXYcA702JWcPNB1hOGaDCQ=">(), class_1802.field_8745);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","qKCsV/jiAgKi4CSjadW/htW09eQoReEt+eM9QTzPTIM1hyW19hY=">(), class_1802.field_8141);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","0ngyI3sz9eTy53Jk5YctNuuUTOQ8gpl0ZLXuLrXWVJhXTju/gQ==">(), class_1802.field_8696);
      IIllllllIlllll.put(IiIlliIliiIl<"IiIlliIliiIl","61k28A1GghUa8FQpSjsiGZr2EtiPdePLRNsCD81qls63R2f1wDW2oMAAWeI=">(), class_1802.field_17533);
      iIlllllIllllll.put(IiIlliIliiIl<"IiIlliIliiIl","ngA2vOWVz6NPTcRJaMSMIQnAPzGMjkP4hb+mX/+5Te9ATsVD9Q==">(), class_1802.field_8287);
   }
}
