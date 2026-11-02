package gg.corz;

import com.corz.client.mixins.AccessorTranslatableTextContent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_2561;
import net.minecraft.class_2588;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_7417;
import net.minecraft.class_742;
import net.minecraft.class_8828;

public class liIlliIiiiIlliIi extends ilIllIiIll {
   private final iiIiiilIIliiil iIiIiliIIi;
   private final Map<String, Integer> iiiIiliIIi;
   private static final long iilIiliIIi = 500000000L;
   private static final int IIiIiliIIi = 4096;
   private final iiIiiilIIliiil IliIiliIIi;
   private int IiiIiliIIi;
   private final IIiiIIIllIiiIIIl lIiIiliIIi = new IIiiIIIllIiiIIIl(
      IliIlllilIi<"IliIlllilIi","78fDEIijk2XyMZ5ukHmH0uy1tnTW9+FYXEHyDzHHbuCO">(),
      IliIlllilIi<"IliIlllilIi","BUd+RXafEBfbsOvLmMYbVOgcTroSwykxs/Ym8/LYQe5OSPmBGyWpQCDW4YAM2+JxyQL1jWz5gDO+">(),
      IliIlllilIi<"IliIlllilIi","naKEKkjUEJxfzH4rpmP5nhVp1tjXWp8PueSIG/dscA==">()
   );
   private long liiIiliIIi;
   public static final String lilIiliIIi = "Friend";
   public static final String IilIiliIIi = "Player";
   private volatile iiiiIlIiIIIIllIi lliIiliIIi;
   private int iliIiliIIi;

   private static class_7417 IiIilliIil(class_7417 self, String content, String alias, iiiiIlIiIIIIllIi names) {
      if (self instanceof class_8828 var13) {
         String var14 = var13.comp_737();
         String var15 = llIililIil(var14, content, alias, names);
         return (class_7417)(var15.equals(var14) ? self : class_8828.method_54232(var15));
      } else if (self instanceof class_2588 var4) {
         AccessorTranslatableTextContent var5 = (AccessorTranslatableTextContent)var4;
         Object[] var6 = var5.corzArgs();
         if (var6 != null && var6.length != 0) {
            Object[] var7 = null;

            for (int var8 = 0; var8 < var6.length; var8++) {
               Object var9 = var6[var8];
               Object var10 = var9;
               if (var9 instanceof class_2561 var11) {
                  var10 = iIIilIlIil(var11, content, alias, names);
               } else if (var9 instanceof String var12) {
                  var10 = llIililIil(var12, content, alias, names);
               }

               if (var10 != var9) {
                  if (var7 == null) {
                     var7 = (Object[])var6.clone();
                  }

                  var7[var8] = var10;
               }
            }

            return (class_7417)(var7 == null ? self : new class_2588(var5.corzKey(), var5.corzFallback(), var7));
         } else {
            return self;
         }
      } else {
         return self;
      }
   }

   public static boolean iIlllIllll(String playerName) {
      return llilillililill.liiiIIllIl(playerName, IIllllIlll());
   }

   public static String lllllillll(String playerName) {
      liIlliIiiiIlliIi var1 = lIIlliIIll();
      if (var1 != null && var1.IliIlllilIi()) {
         String var2 = IIllllIlll();
         if (llilillililill.liiiIIllIl(playerName, var2)) {
            return var1.iiiIlIIIll();
         } else {
            String var3 = var1.Ilillllill().IilliliilIIi(playerName);
            return var3 != null ? var3 : playerName;
         }
      } else {
         return playerName;
      }
   }

   public static boolean ilIllIiIll() {
      liIlliIiiiIlliIi var0 = lIIlliIIll();
      return var0 != null && var0.IliIlllilIi() && var0.lIilliIill() != 0;
   }

   public liIlliIiiiIlliIi() {
      super(IliIlllilIi<"IliIlllilIi","t8bzFDzDgqAuYoOpIrZR3/8ae2fDz3r7AESt0vsDtYwCa/uh4+QiSw==">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.iIiIiliIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","xnp9Lt+pz0dsfR3dHlJHsDtd0D1a+tCau1x555jEM7OPrQIlAzzn">(),
         IliIlllilIi<"IliIlllilIi","NwVtoY0Z3n/9O9BrTHLK2xjwFTu/DzSYsr8CAU+wLgC0RfFM2nJcyGjqeNhrDdytemHPIjOoyEBH6+t4x8KRL0sj3iTkTidsNWK9Xi031Ib33l5Ofkx+2EMOpCU=">(),
         false
      );
      this.IliIiliIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","X7Pa9nIzEFTP2DQERMllkWsf8m4eAlGgfV+c0X/aBQvYwdK7komzNA==">(),
         IliIlllilIi<"IliIlllilIi","ccoytng3/JQl7cRasgn/q3syNaY8+imwmLentioAbVu+YEQkCwJaSuXkKUFN5ewc0k9jD6r2wceXLft4oaOjh02IYVVkx3LIhNmJFkRp4IED/Hu7s8q2C8+7RQ==">(),
         false
      );
      this.lliIiliIIi = iiiiIlIiIIIIllIi.ililIlIIIi;
      this.iliIiliIIi = -1;
      this.IiiIiliIIi = -1;
      this.iiiIiliIIi = new HashMap<>();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIiIiliIIi, this.iIiIiliIIi, this.IliIiliIIi});
   }

   public String iiiIlIIIll() {
      String var1 = this.lIiIiliIIi.Iilllilliill();
      return var1 != null && !var1.isEmpty() ? var1 : IliIlllilIi<"IliIlllilIi","naKEKkjUEJxfzH4rpmP5nhVp1tjXWp8PueSIG/dscA==">();
   }

   public static class_2561 iilllIIill(class_2561 text) {
      if (text == null) {
         return text;
      } else {
         liIlliIiiiIlliIi var1 = lIIlliIIll();
         if (var1 != null && var1.IliIlllilIi()) {
            String var2 = IIllllIlll();
            iiiiIlIiIIIIllIi var3 = var1.Ilillllill();
            return var2 == null && var3.liiiIIllIl() ? text : iIIilIlIil(text, var2, var1.iiiIlIIIll(), var3);
         } else {
            return text;
         }
      }
   }

   public static boolean IlIllllIll() {
      liIlliIiiiIlliIi var0 = lIIlliIIll();
      return var0 != null && var0.IliIlllilIi();
   }

   private iiiiIlIiIIIIllIi liilliiill(class_310 mc, int mode) {
      String var3 = IIllllIlll();
      List var4 = iIIiIiIlIlIiIiIl.IilliliilIIi();
      HashSet var5 = new HashSet();

      for (String var7 : var4) {
         var5.add(var7.toLowerCase(Locale.ROOT));
      }

      liIiIliliiIiIlil var10 = new liIiIliliiIiIlil();
      if ((mode & 2) != 0) {
         for (int var11 = 0; var11 < var4.size(); var11++) {
            String var8 = (String)var4.get(var11);
            if (!llilillililill.liiiIIllIl(var8, var3)) {
               var10.put(var8, IliIlllilIi<"IliIlllilIi","+h7dThH6ha9+KRu7WQLtLX51Fp4jt5tFc/UZntXZL/rFZQ==">() + (var11 + 1));
            }
         }
      }

      if ((mode & 1) != 0) {
         class_634 var12 = mc.method_1562();
         if (var12 != null) {
            for (class_640 var9 : var12.method_2880()) {
               if (var9 != null && var9.method_2966() != null) {
                  this.IIIillIIil(var10, var9.method_2966().name(), var3, var5);
               }
            }
         }

         if (mc.field_1687 != null) {
            for (class_742 var15 : mc.field_1687.method_18456()) {
               if (var15 != null && var15.method_7334() != null) {
                  this.IIIillIIil(var10, var15.method_7334().name(), var3, var5);
               }
            }
         }
      }

      return var10.build();
   }

   public static String IIllllIlll() {
      try {
         class_310 var0 = class_310.method_1551();
         if (var0 != null && var0.method_1548() != null) {
            String var1 = var0.method_1548().method_1676();
            return var1 != null && !var1.isEmpty() ? var1 : null;
         } else {
            return null;
         }
      } catch (Exception var2) {
         return null;
      }
   }

   private static liIlliIiiiIlliIi lIIlliIIll() {
      return (liIlliIiiiIlliIi)llilIllililIll.iliIiiliiiii(liIlliIiiiIlliIi.class);
   }

   iiiiIlIiIIIIllIi Ilillllill() {
      long var6 = -6111096133410851935L;
      var6 ^= ((long)this.lIilliIill() << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) == 0) {
         return iiiiIlIiIIIIllIi.ililIlIIIi;
      } else {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && var2.method_18854()) {
            long var3 = System.nanoTime();
            var6 ^= ((long)ilillIiill(var2) ^ var6) & -1L >>> 32;
            if ((int)(var6 >>> 32) != this.iliIiliIIi
               || (int)var6 != this.IiiIiliIIi
               || var3 - this.liiIiliIIi >= (6922274091839366311L ^ 6922274091474141607L)) {
               this.iliIiliIIi = (int)(var6 >>> 32);
               this.IiiIiliIIi = (int)var6;
               this.liiIiliIIi = var3;
               this.lliIiliIIi = this.liilliiill(var2, (int)(var6 >>> 32));
            }
         }

         return this.lliIiliIIi;
      }
   }

   public static String liIlliiIll() {
      liIlliIiiiIlliIi var0 = lIIlliIIll();
      return var0 == null ? IliIlllilIi<"IliIlllilIi","naKEKkjUEJxfzH4rpmP5nhVp1tjXWp8PueSIG/dscA==">() : var0.iiiIlIIIll();
   }

   static class_2561 iIIilIlIil(class_2561 text, String self, String alias, iiiiIlIiIIIIllIi names) {
      class_7417 var4 = text.method_10851();
      class_7417 var5 = IiIilliIil(var4, self, alias, names);
      List var6 = text.method_10855();
      class_2561[] var7 = null;

      for (int var8 = 0; var8 < var6.size(); var8++) {
         class_2561 var9 = (class_2561)var6.get(var8);
         class_2561 var10 = iIIilIlIil(var9, self, alias, names);
         if (var10 != var9 && var7 == null) {
            var7 = var6.toArray(new class_2561[0]);
         }

         if (var7 != null) {
            var7[var8] = var10;
         }
      }

      if (var5 == var4 && var7 == null) {
         return text;
      } else {
         class_5250 var12 = class_5250.method_43477(var5).method_10862(text.method_10866());

         for (class_2561 var11 : var7 != null ? List.of(var7) : var6) {
            var12.method_10852(var11);
         }

         return var12;
      }
   }

   private static String llIililIil(String names, String s, String self, iiiiIlIiIIIIllIi alias) {
      return llilillililill.IiIlliIliiIl(alias.lIiiIiIlilli(names), s, self);
   }

   private int lIilliIill() {
      return (this.iIiIiliIIi.Iilllilliill() ? 1 : 0) | (this.IliIiliIIi.Iilllilliill() ? 2 : 0);
   }

   private static int ilillIiill(class_310 mc) {
      long var4 = -7448930041918222045L;
      class_634 var1 = mc.method_1562();
      var4 ^= ((long)(var1 == null ? 0 : var1.method_2880().size()) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)(mc.field_1687 == null ? 0 : mc.field_1687.method_18456().size()) ^ var4) & -1L >>> 32;
      return (int)(var4 >>> 32) * (-(~(1091037959 + -109) * 97) ^ -1543576390) + (int)var4;
   }

   private void IIIillIIil(liIiIliliiIiIlil b, String self, String friendKeys, Set<String> name) {
      if (iiiiIlIiIIIIllIi.IliIlllilIi(self) && !llilillililill.liiiIIllIl(self, friendKeys) && !b.has(self)) {
         String var5 = self.toLowerCase(Locale.ROOT);
         if (!name.contains(var5)) {
            Integer var6 = this.iiiIiliIIi.get(var5);
            if (var6 == null) {
               if (this.iiiIiliIIi.size() >= (~(1843954383 ^ -53) * 1455319497 ^ 831642131)) {
                  this.iiiIiliIIi.clear();
               }

               var6 = this.iiiIiliIIi.size() + 1;
               this.iiiIiliIIi.put(var5, var6);
            }

            b.put(self, IliIlllilIi<"IliIlllilIi","O+po7TtmnR8BCEhuE2ZLbFbtFNTrhsBD4V6rTlzdSKO1Bw==">() + var6);
         }
      }
   }

   public static String Iillllilll(String text) {
      liIlliIiiiIlliIi var1 = lIIlliIIll();
      return var1 != null && var1.IliIlllilIi() ? llilillililill.IiIlliIliiIl(var1.Ilillllill().lIiiIiIlilli(text), IIllllIlll(), var1.iiiIlIIIll()) : text;
   }
}
