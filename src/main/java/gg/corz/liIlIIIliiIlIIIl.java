package gg.corz;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import net.minecraft.class_10185;
import net.minecraft.class_1309;
import net.minecraft.class_1893;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2645;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_746;

public final class liIlIIIliiIlIIIl {
   private final IilIllililIlli lIIliiIlIl;
   private String IliliiIlIl;
   private int iilliiIlIl;
   private class_1309 illliiIlIl;
   private final illIIliIilIIli liIliiIlIl;
   private final ilIiilIlIiIiilIl iIiIiiIlIl;
   private final iIIIllilIlIIllil iIIliiIlIl;
   private final iIIilIiIlIilIi IliIiiIlIl;
   private final IIllllIlll IIiIiiIlIl = new IIllllIlll();
   private final ililIIilIiilIIil llIliiIlIl;
   private static final double IilIiiIlIl = 0.001;
   public static final int iIIIiiIlIl = 40;
   private volatile boolean iiIliiIlIl;
   public static final int lIlIiiIlIl = 12;
   public static final int lIIIiiIlIl = 512;
   private final illillIlIilillIl IiiIiiIlIl;
   private volatile boolean lIlliiIlIl;
   public static final long IIlIiiIlIl = 100L;
   private final lIlilIiiIlilIi lliIiiIlIl;
   private static final int lilIiiIlIl = 9;
   private boolean lIiliiIlIl;
   private final iilllIiIIillIi iliIiiIlIl;
   private boolean IIiliiIlIl;
   private long lliliiIlIl;
   public static final float iiIIiiIlIl = 6.0F;
   private int lilliiIlIl;
   private static volatile boolean IllliiIlIl;
   private final lliliiiililiii iilIiiIlIl;
   private final IIiIIIIllIiIIIIl iiiIiiIlIl;
   private boolean iIiliiIlIl;
   private volatile boolean iIlliiIlIl;
   public static final double ilIIiiIlIl = 1.1;
   private volatile IlillIIillillIIi lllliiIlIl;
   private final liiIiiiiiiIiii liiIiiIlIl;
   private final Illliilllllliill lIiIiiIlIl = new Illliilllllliill();
   public static final double llIIiiIlIl = 4.0;
   public static final int iIlIiiIlIl = 48;
   public static final String IllIiiIlIl = "Sword PvP Bot";
   private final lIlIiIIliIlIiIIl IIIliiIlIl;
   public static final double liIIiiIlIl = 4.0;
   private final lllliIilillliIil IlIliiIlIl;
   public static final long IiIIiiIlIl = 60L;
   private final Iillllllilllll ilIliiIlIl;
   public static final String lllIiiIlIl = "Looking for a player nearby.";
   private final IllilIlllllilIll IiIliiIlIl;
   private lIIIilIliIIIilIl IilliiIlIl;
   public static final double IlIIiiIlIl = 8.0;
   private volatile boolean IIlliiIlIl;
   public static final String illIiiIlIl = "Put a sword in your hotbar.";

   private void Iliilliiilii(class_746 c, long tick, IIIIIlilIIIIli player) {
      float var5 = c.method_36454();
      float var6 = c.method_36455();
      if (player != null) {
         ilIiiIiIii.IliIlllilIi(this.iilIiiIlIl, player.liiiIIllIl(), player.iIlIlllllill(), 95, false);
      }

      if (player != null && !player.lIiiIiIlilli()) {
         this.liiIiiIlIl.IliIlllilIi(tick, var5, var6, player.liiiIIllIl(), player.iIlIlllllill());
      } else {
         this.liiIiiIlIl.liiiIIllIl();
      }
   }

   private void IIIIllIIIl() {
      lIIIililiIIIilil.IlIlllIlilIl(this.iilIiiIlIl);
      this.liiIiiIlIl.liiiIIllIl();
   }

   private String IllIllllIl() {
      return liIlliiIll<"liIlliiIll","Ra4IqbL02pMovXOJyBt7Uvj5NiHWPDgD2bt1qoLCNqX+">()
         + this.llIliiIlIl.Illillliilli()
         + liIlliiIll<"liIlliiIll","zBUnQhrvEtMOgYjRUKBbOm+Qt/+l/PPDqGb+G4UiDVnE6hnc4yk=">()
         + this.llIliiIlIl.Iilililiiili()
         + liIlliiIll<"liIlliiIll","0F7/Bosrkwlqk402HYl3RmI2v1I8bfxDJ6Ip4n05W6F3j9q5h4HpwH/Lkg==">()
         + this.llIliiIlIl.Iliilliiilii();
   }

   public void IIIllIIliIIl(iIIlIlIlIlIlIlIl e) {
      this.iiiIiiIlIl.IliIlllilIi(e, this.lIlliiIlIl);
   }

   private long IiIiliIiiiIi(long tick) {
      long var3 = this.ilIliiIlIl.IIillIiliIil();
      return var3 == Long.MIN_VALUE ? 2147483647L : Math.max(0L, tick - var3);
   }

   private static boolean IiiIlliiIl(class_310 mc) {
      long var5 = -3050439789678424788L;
      if (mc.field_1755 == null && mc.field_1690 != null) {
         class_304[] var1 = iiiIlIIIll(mc.field_1690);
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            class_304 var4 = var1[(int)var8];
            if (IillIIIllillIIIl.IliIlllilIi(var4)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void lIiiIiIlilli(IiIiIlIiliIiIlIi e) {
      long var18 = -3345337414618280431L;
      long var20 = 5129424344951618214L;
      long var22 = -706062378704509038L;
      long var24 = 9115284280228087167L;
      long var26 = 2067837208785792251L;
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1724 != null && var2.method_18854() && !e.lIiiIiIlilli()) {
         class_2596 var3 = e.lIiilIIIIi;
         llIIiiililIIiiil var4 = iIlllillIllllill.IliIlllilIi(var3);
         var18 ^= ((long)this.IiiIiiIlIl.Illlllllilll() << 32 ^ var18) & -1L << 32;
         long var6 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (var4 == llIIiiililIIiiil.IiiliIIiil) {
            this.IIiIiiIlIl.iIlIlllllill();
         } else {
            this.IIiIiiIlIl.IilliliilIIi(var4, (boolean)((int)(var18 >>> 32)), e.IilliliilIIi());
            switch (var4) {
               case IilliIIiil:
                  this.IIiIiiIlIl.lIiiIiIlilli(iIlllillIllllill.liiiIIllIl(var3), (boolean)((int)(var18 >>> 32)));
                  break;
               case lilliIIiil:
               case iilliIIiil:
                  float[] var35 = iIlllillIllllill.iIlIlllllill(var3);
                  if (var35 != null) {
                     this.IIiIiiIlIl.iliIiiliiiii(var35[0], var35[1]);
                  }
                  break;
               case IIiliIIiil:
                  class_10185 var16 = iIlllillIllllill.IilliliilIIi(var3);
                  if (!(var16 instanceof class_10185)) {
                     break;
                  }

                  class_10185 var10000 = var16;

                  label101: {
                     label115: {
                        try {
                           var53 = var10000.comp_3159();
                        } catch (Throwable var34) {
                           var52 = var34;
                           boolean var10001 = false;
                           break label115;
                        }

                        var18 ^= ((long)var53 ^ var18) & -1L >>> 32;
                        var20 ^= ((long)((int)var18) << 32 ^ var20) & -1L << 32;
                        var10000 = var16;

                        try {
                           var55 = var10000.comp_3160();
                        } catch (Throwable var33) {
                           var52 = var33;
                           boolean var66 = false;
                           break label115;
                        }

                        var18 ^= ((long)var55 ^ var18) & -1L >>> 32;
                        var20 ^= ((long)((int)var18) ^ var20) & -1L >>> 32;
                        var10000 = var16;

                        try {
                           var57 = var10000.comp_3161();
                        } catch (Throwable var32) {
                           var52 = var32;
                           boolean var67 = false;
                           break label115;
                        }

                        var18 ^= ((long)var57 ^ var18) & -1L >>> 32;
                        var22 ^= ((long)((int)var18) << 32 ^ var22) & -1L << 32;
                        var10000 = var16;

                        try {
                           var59 = var10000.comp_3162();
                        } catch (Throwable var31) {
                           var52 = var31;
                           boolean var68 = false;
                           break label115;
                        }

                        var18 ^= ((long)var59 ^ var18) & -1L >>> 32;
                        var22 ^= ((long)((int)var18) ^ var22) & -1L >>> 32;
                        var10000 = var16;

                        try {
                           var61 = var10000.comp_3163();
                        } catch (Throwable var30) {
                           var52 = var30;
                           boolean var69 = false;
                           break label115;
                        }

                        var18 ^= ((long)var61 ^ var18) & -1L >>> 32;
                        var24 ^= ((long)((int)var18) << 32 ^ var24) & -1L << 32;
                        var10000 = var16;

                        try {
                           var63 = var10000.comp_3164();
                        } catch (Throwable var29) {
                           var52 = var29;
                           boolean var70 = false;
                           break label115;
                        }

                        var18 ^= ((long)var63 ^ var18) & -1L >>> 32;
                        var24 ^= ((long)((int)var18) ^ var24) & -1L >>> 32;
                        var10000 = var16;

                        try {
                           var65 = var10000.comp_3165();
                           break label101;
                        } catch (Throwable var28) {
                           var52 = var28;
                           boolean var71 = false;
                        }
                     }

                     Throwable var8 = var52;
                     throw new MatchException(var8.toString(), var8);
                  }

                  var18 ^= ((long)var65 ^ var18) & -1L >>> 32;
                  var26 ^= ((long)((int)var18) << 32 ^ var26) & -1L << 32;
                  this.IIiIiiIlIl
                     .IIIllIIliIIl(
                        (boolean)((int)(var20 >>> 32)),
                        (boolean)((int)var20),
                        (boolean)((int)(var22 >>> 32)),
                        (boolean)((int)var22),
                        (boolean)((int)(var24 >>> 32)),
                        (boolean)((int)var24),
                        (boolean)((int)(var26 >>> 32))
                     );
                  break;
               case lIiliIIiil:
                  this.IlIliiIlIl.liiiIIllIl(true, var6);
                  break;
               case iIiliIIiil:
                  this.IlIliiIlIl.liiiIIllIl(false, var6);
                  break;
               case IliliIIiil:
                  this.IIiIiiIlIl.IlIlllIlilIl();
                  break;
               case lliliIIiil:
                  this.IIiIiiIlIl.IiIlliIliiIl();
                  break;
               case liIliIIiil:
                  var26 ^= (
                        (long)(
                              (!this.IlIliiIlIl.IilliliilIIi() || !(var2.field_1724.method_7261(0.5F) > 0.9F))
                                    && lIlllIliIlllIl.lIiiIiIlilli(var2.field_1724.method_6047(), class_1893.field_9121) <= 0
                                 ? 0
                                 : 1
                           )
                           ^ var26
                     )
                     & -1L >>> 32;
                  this.IlIliiIlIl.iIlIlllllill((boolean)((int)var26), var6);
            }
         }
      }
   }

   public void Illlllllilll(IIilllilIillli e) {
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1755 == null && var2.field_1729 != null) {
         if (var2.field_1729.method_1613() && var2.method_1569() && !iIIilIIiIlIilIIi.lIIlliIIll() && !lilIliIiiilIliIi.iiiIlIIIll()) {
            this.iIiIiiIlIl.IilliliilIIi(e.IliIlllilIi(), e.liiiIIllIl());
         }
      }
   }

   public void IiIlliIliiIl(IiiiIIIlliiiIIIl e) {
      long var7 = -6289498529262915693L;
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1755 == null && var2.field_1690 != null && e.liiiIIllIl() == 1) {
         class_304[] var3 = iiiIlIIIll(var2.field_1690);
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            class_304 var6 = var3[(int)var10];
            if (IillIIIllillIIIl.liiiIIllIl(var6, e.IliIlllilIi())) {
               this.iIiIiiIlIl.liiiIIllIl(IIIiillllIIiilll.IliIlllilIi());
               return;
            }
         }
      }
   }

   public static boolean IliIlllilIi() {
      return IllliiIlIl;
   }

   private void llIIlilIIl() {
      this.IIiIiiIlIl.IliIlllilIi();
      this.iliIiiIlIl.liiiIIllIl();
      this.IIIliiIlIl.IliIlllilIi();
      this.IlIliiIlIl.IliIlllilIi();
      this.IiIliiIlIl.IliIlllilIi();
      this.ilIliiIlIl.IilliliilIIi();
      this.llIliiIlIl.IIIllIIliIIl();
      this.lliIiiIlIl.iIlIlllllill();
      this.IliIiiIlIl.IliIlllilIi();
      this.liiIiiIlIl.liiiIIllIl();
      this.illliiIlIl = null;
      this.IilliiIlIl = lIIIilIliIIIilIl.iIIiIlliIl;
      this.lilliiIlIl = 0;
      this.IIiliiIlIl = false;
      this.lIiliiIlIl = false;
      this.iIiliiIlIl = false;
      this.IliliiIlIl = null;
      this.lliliiIlIl = Long.MIN_VALUE;
      this.iiIliiIlIl = false;
      this.IIlliiIlIl = false;
      this.lIlliiIlIl = false;
      IllliiIlIl = false;
   }

   private static String iIiIlIliIl(String s, int max) {
      return s != null && s.length() > max
         ? s.substring(0, Math.max(0, max - 3)) + liIlliiIll<"liIlliiIll","doZ3iICJWKTibBz5ovwsieoydc3wlNC3+TQmMG4zzQ==">()
         : s;
   }

   private static String lliIliliIl(String name) {
      if (name == null) {
         return null;
      } else {
         String var1 = liIlliIiiiIlliIi.lllllillll(name);
         return var1 == null ? name : var1;
      }
   }

   public void IilliliilIIi() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.method_1562() != null) {
         long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
         long var4 = IIIiillllIIiilll.IliIlllilIi();
         IllliiIlIl = this.iiIliiIlIl;
         if (IllliiIlIl) {
            var1.method_61964().method_61939();
         }

         try {
            this.IIIilIIiiIIi(var1, var2, var4);
         } catch (Throwable var7) {
            this.IiIIlliIIl(var7, var4);
         }
      } else {
         this.iiIliiIlIl = false;
         this.IIlliiIlIl = false;
         this.lIlliiIlIl = false;
         IllliiIlIl = false;
         this.lilIliilIl(
            this.illIlIilIl(
               liIIiilliiIIiill.iiIIiliill,
               liIlliiIll<"liIlliiIll","pzdflUyNq5XQRLBfF5G9ni8/gQzzhirVAUBph0sBHvrlgbo=">(),
               null,
               liIlliiIll<"liIlliiIll","L+bzo8/djwfdXlTDYtMCDj5KUK2nUWs0l8t3JsLqxT9ptgHJqXe6NS5CjP6netIDeOA=">()
            )
         );
      }
   }

   private void IiIIlliIIl(Throwable t, long now) {
      try {
         class_746 var4 = class_310.method_1551().field_1724;
         if (var4 != null && (this.IIiIiiIlIl.Iiilliiliiil() || this.IIiIiiIlIl.IlIillIiilIi())) {
            this.Iliilliiilii(var4, IIllIIlilIllIIli.IlIlllIlilIl(), this.iliIiiIlIl.IIlilIliiIli(true));
         }
      } catch (Throwable var6) {
         this.liiIiiIlIl.liiiIIllIl();
      }

      try {
         this.IIIIllIIIl();
      } catch (Throwable var5) {
         this.iiIliiIlIl = false;
      }

      this.iiIliiIlIl = false;
      this.IIlliiIlIl = false;
      this.lIiIiiIlIl.lIiiIiIlilli(now);
      if (this.lIiIiiIlIl.iliIiiliiiii()) {
         this.iiIIlIIlIl(new illiIiilIiliIiil(IiIIilllliIIilll.iIiIIIlill, iiiiiiIlIIIIIIll.lliIliIlll, "", true, false, false));
      }
   }

   private class_1309 IIlilIliiIli(class_746 keepRange, double tick, double p, long range) {
      class_1309 var8 = this.illliiIlIl;
      if (var8 != null && liiIIIlliiiIIIll.IliIlllilIi(var8, lilllliiilllli.iiIiIiIIIl) && liiIIIlliiiIIIll.IIIllIIliIIl(var8) <= p) {
         class_1309 var19 = this.Illillliilli(var8, range);
         return var19 != null && llIIliiilIIlii.IilliliilIIi(liiIIIlliiiIIIll.IIIllIIliIIl(var8), liiIIIlliiiIIIll.IIIllIIliIIl(var19)) ? var19 : var8;
      } else {
         List var9 = liiIIIlliiiIIIll.Iilllilliill(tick, lilllliiilllli.iiIiIiIIIl);
         class_1309 var10 = null;
         double var11 = Double.POSITIVE_INFINITY;

         for (class_1309 var14 : var9) {
            if (var14 != keepRange) {
               double var15 = liiIIIlliiiIIIll.IIIllIIliIIl(var14);
               if (!(var15 < 0.001)) {
                  double var17 = var15 - (this.llIliiIlIl.IIlilIliiIli(var14.method_5628(), range, 60L) ? 4.0 : 0.0);
                  if (var17 < var11) {
                     var11 = var17;
                     var10 = var14;
                  }
               }
            }
         }

         return var10;
      }
   }

   private void iIIIlIlIIl() {
      this.illliiIlIl = null;
      this.iilliiIlIl = 0;
      this.llIliiIlIl.IliIlllilIi(null);
      this.IiIliiIlIl.IliIlllilIi();
      this.ilIliiIlIl.IilliliilIIi();
      this.IlIliiIlIl.IliIlllilIi();
      this.IilliiIlIl = lIIIilIliIIIilIl.iIIiIlliIl;
   }

   public void IIlllIlliIll(iilIIlilIIiIIlil e) {
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1755 == null) {
         this.iIiIiiIlIl.liiiIIllIl(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   public boolean Ililllililil() {
      return this.IIlliiIlIl && !this.iIiIiiIlIl.iliIiiliiiii(IIIiillllIIiilll.IliIlllilIi());
   }

   private IlillIIillillIIi lIlIliIlIl(illiIiilIiliIiil p, class_1309 t, class_746 v, long tick) {
      long var8 = 736246899371751983L;
      if (p.IliIlllilIi() != IiIIilllliIIilll.iilIIIlill) {
         return this.illIlIilIl(
            liIIiilliiIIiill.lIlIiliill,
            liIlliiIll<"liIlliiIll","AU/BZ62Ny6ubvA21K2Egnvu+YSxrLQWtoPYOC6yYOJotEQ==">(),
            t == null ? null : lliIliliIl(this.llIliiIlIl.IiIlliIliiIl()),
            IIiIllIiIl(p)
         );
      } else if (t == null) {
         return this.IliliiIlIl != null && tick <= this.lliliiIlIl
            ? this.illIlIilIl(
               liIIiilliiIIiill.IIlIiliill, liIlliiIll<"liIlliiIll","LYTILm3LjDMFJm7XVZciyL+ykCraDY4Jy37RKirDHQ==">(), this.IliliiIlIl, this.IllIllllIl()
            )
            : this.illIlIilIl(
               liIIiilliiIIiill.iiIIiliill,
               liIlliiIll<"liIlliiIll","Z9N/i1FBJXqV5DHzA1nCJCbvFrZFqXHtKGmiSbeADjiCT/I=">(),
               null,
               liIlliiIll<"liIlliiIll","q37ki3bYrUd7FPYUvU1zvWCT9ew0Zf9uoSPVW22/NmZ0/dm04fY3+npc8U7IDbznBb943Gc1Uvg=">()
            );
      } else if (this.lIiliiIlIl) {
         return this.illIlIilIl(
            liIIiilliiIIiill.iIlIiliill,
            liIlliiIll<"liIlliiIll","+YVoZLJxl/J2LNZqBVjBAr4ZCUet7EtIMlzw+dSTTIukandR">(),
            lliIliliIl(this.llIliiIlIl.IiIlliIliiIl()),
            liIlliiIll<"liIlliiIll","nI11NPmHTY4Bh6Ak+63ajx/JHJw4aTSxJz0cORgSOL31gOUIhaVtdttZSdxAC3KaXib9sTkboA==">()
         );
      } else {
         var8 ^= ((long)(v.method_6032() + v.method_6067() <= 6.0F ? 1 : 0) << 32 ^ var8) & -1L << 32;
         String var7 = this.llIliiIlIl.IIiilIiiiIii() >= 2
            ? liIlliiIll<"liIlliiIll","ZyeT3BczzxhbCUg5FU+Wydj+CiEyaaqzG4GDC7ae6j5CWcE=">() + this.llIliiIlIl.IIiilIiiiIii()
            : this.IilliiIlIl.lIliIlliIl;
         return this.illIlIilIl(
            (int)(var8 >>> 32) != 0 ? liIIiilliiIIiill.iIlIiliill : liIIiilliiIIiill.IIlIiliill,
            var7,
            lliIliliIl(this.llIliiIlIl.IiIlliIliiIl()),
            this.IllIllllIl()
         );
      }
   }

   private static double IIiilIiiiIii(class_746 p, class_1309 step, class_243 t) {
      double var3 = step.method_23317() - p.method_23317();
      double var5 = step.method_23321() - p.method_23321();
      double var7 = Math.hypot(var3, var5);
      return var7 > 0.001 && t != null ? (t.field_1352 * var3 + t.field_1350 * var5) / var7 : 0.0;
   }

   private void iiIIlIIlIl(illiIiilIiliIiil v) {
      AutoCloseable var2 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl();

      try {
         this.iilIiiIlIl.IIillIiliIil(false);
      } finally {
         lIIlliIIll(var2);
      }

      if (!v.iliIiiliiiii()) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(liIlliiIll<"liIlliiIll","thrUsbbyzuAP80dx5vsmGMUhFJmG0x6r9BwNssF5LckwQyK0/atGIGQ=">(), IIiIllIiIl(v), false);
      }
   }

   public void IlIlllIlilIl(IiiIlllliiIlll e) {
      long var7 = 1706096754935979179L;
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1755 == null && var2.field_1690 != null && e.liiiIIllIl() == 1) {
         class_304[] var3 = iiiIlIIIll(var2.field_1690);
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            class_304 var6 = var3[(int)var10];
            if (IillIIIllillIIIl.iIlIlllllill(var6, e.IliIlllilIi())) {
               this.iIiIiiIlIl.liiiIIllIl(IIIiillllIIiilll.IliIlllilIi());
               return;
            }
         }
      }
   }

   public void iIlIlllllill() {
      long var4 = 5936289450041458388L;
      class_310 var1 = class_310.method_1551();

      try {
         lIIIililiIIIilil.IlIlllIlilIl(this.iilIiiIlIl);
         class_746 var2 = var1.field_1724;
         var4 ^= ((long)this.IIIliiIlIl.IIillIiliIil() << 32 ^ var4) & -1L << 32;
         if (var2 != null
            && (int)(var4 >>> 32) >= 0
            && (int)(var4 >>> 32) < 9
            && var2.method_31548().method_67532() != (int)(var4 >>> 32)
            && !this.IIiIiiIlIl.Ililllililil()) {
            var2.method_31548().method_61496((int)(var4 >>> 32));
         }

         this.IIIliiIlIl.IliIlllilIi();
         this.liiIiiIlIl.liiiIIllIl();
      } catch (Throwable var6) {
      }

      this.iiIliiIlIl = false;
      this.IIlliiIlIl = false;
      this.lIlliiIlIl = false;
      IllliiIlIl = false;
      this.illliiIlIl = null;
      this.lllliiIlIl = IlillIIillillIIi.lIiIIIiiil;
   }

   private void lilIliilIl(IlillIIillillIIi s) {
      if (s != null && !s.equals(this.lllliiIlIl)) {
         this.lllliiIlIl = s;
      }
   }

   private boolean IlIillIiilIi(class_243 eye, class_1309 t, class_238 box) {
      long var5 = 3805446446944634235L;
      var5 ^= ((long)(!lllIliIlillIliIl.IiIIlliIIl(eye, t.method_33571()) && !lllIliIlillIliIl.IiIIlliIIl(eye, box.method_1005()) ? 0 : 1) << 32 ^ var5)
         & -1L << 32;
      this.iilliiIlIl = (int)(var5 >>> 32) != 0 ? 0 : this.iilliiIlIl + 1;
      return llIIliiilIIlii.iIlIlllllill(this.iilliiIlIl);
   }

   public IlillIIillillIIi Iiilliiliiil() {
      return this.lllliiIlIl;
   }

   private void IIIilIIiiIIi(class_310 tick, long now, long mc) {
      long var35 = -2324219495545433424L;
      long var37 = -27219354713569683L;
      long var39 = -8369040923893686334L;
      long var41 = 7493238990120539644L;
      class_746 var6 = tick.field_1724;
      var35 ^= ((long)var6.method_5628() << 32 ^ var35) & -1L << 32;
      this.IIiIiiIlIl.liiiIIllIl(now);
      if (this.iIlliiIlIl) {
         this.iIlliiIlIl = false;
         this.IIiIiiIlIl.IiIlliIliiIl();
      }

      this.iIiIiiIlIl.lIiiIiIlilli(mc, IiiIlliiIl(tick));
      this.lliIiiIlIl.liiiIIllIl(tick.field_1687, tickx -> this.Iilililiiili(tickx, now, selfId), 512);
      illiIiilIiliIiil var8 = this.lIiIiiIlIl
         .iIlIlllllill(IIiiiIllIiiiIl.IliIlllilIi(mc, now, this.IliIiiIlIl, this.iIiIiiIlIl, this.liIliiIlIl, this.iliIiiIlIl));
      if (var8.IliIlllilIi() == IiIIilllliIIilll.iIiIIIlill) {
         this.IIIIllIIIl();
         this.iiIIlIIlIl(var8);
      } else {
         if (var8.liiiIIllIl() == iiiiiiIlIIIIIIll.IiIIliIlll && !this.IIiliiIlIl) {
            this.IIiliiIlIl = true;
            this.illliiIlIl = null;
            this.llIliiIlIl.IliIlllilIi(null);
         }

         if (var8.liiiIIllIl() != iiiiiiIlIIIIIIll.IiIIliIlll && var8.liiiIIllIl() != iiiiiiIlIIIIIIll.liIIliIlll) {
            this.IIiliiIlIl = false;
         }

         if (var8.IilliliilIIi()) {
            this.iIIIlIlIIl();
            this.IIIliiIlIl.iIlIlllllill();
            this.IIiIiiIlIl.IiIlliIliiIl();
         }

         if (var8.IliIlllilIi() == IiIIilllliIIilll.lIiIIIlill) {
            this.Iiiiliiiiiii(var8);
         } else {
            this.lIlliiIlIl = var8.IliIlllilIi() == IiIIilllliIIilll.iilIIIlill;
            this.iliIiiIlIl.iIlIlllllill(now, ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil(), IilIIilllilIIill.iIlIlllllill());
            var35 ^= (
                  (long)(
                        (
                                 !this.IIiIiiIlIl.iIIIlIlIIl()
                                    || liiIIliliiiIIlil.IIillIiliIil(
                                       this.iliIiiIlIl.IilliliilIIi(),
                                       this.iliIiiIlIl.lIiiIiIlilli(),
                                       this.IIiIiiIlIl.llIIlilIIl(),
                                       this.IIiIiiIlIl.IiIIlliIIl()
                                    )
                              )
                              && liiIIliliiiIIlil.IIillIiliIil(
                                 this.iliIiiIlIl.IilliliilIIi(), this.iliIiiIlIl.lIiiIiIlilli(), var6.method_36454(), var6.method_36455()
                              )
                           ? 0
                           : 1
                     )
                     ^ var35
               )
               & -1L >>> 32;
            this.IiiIiiIlIl.IliIlllilIi(var8.IliIlllilIi(), (boolean)((int)var35));
            this.lIIliiIlIl.IliIlllilIi();
            this.ilIliiIlIl.IliIlllilIi();
            lIlllIIliIlllIIl.IliIlllilIi(false);
            iIlIllllIllIllll var10 = this.iilIiiIlIl.IIllllIlll();
            this.iliIiiIlIl.IliIlllilIi(var10.iIlIlllllill());
            if (this.illliiIlIl != null && this.llIliiIlIl.iliIiiliiiii(this.illliiIlIl, now)) {
               this.IliliiIlIl = lliIliliIl(this.llIliiIlIl.IiIlliIliiIl());
               this.lliliiIlIl = now + 100L;
            }

            class_1309 var11 = this.IIlilIliiIli(var6, (double)var10.liiiIIllIl(), (double)var10.liiiIIllIl() + 8.0, now);
            var37 ^= ((long)(var11 == null || this.illliiIlIl != null && this.illliiIlIl.method_5628() == var11.method_5628() ? 0 : 1) << 32 ^ var37)
               & -1L << 32;
            if (var11 != null && this.illliiIlIl == null) {
               this.IIIliiIlIl.Illlllllilll();
               this.iliIiiIlIl.liiiIIllIl();
               this.iliIiiIlIl.iIlIlllllill(now, ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil(), IilIIilllilIIill.iIlIlllllill());
            }

            if ((int)(var37 >>> 32) != 0) {
               this.IiIliiIlIl.IliIlllilIi();
               this.ilIliiIlIl.IilliliilIIi();
               this.iilliiIlIl = 0;
            }

            this.illliiIlIl = var11;
            this.llIliiIlIl.IliIlllilIi(var11);
            this.lilliiIlIl = var11 == null ? this.lilliiIlIl + 1 : 0;
            this.iiIliiIlIl = var11 != null;
            this.IIlliiIlIl = this.iiIliiIlIl;
            iliIiIiIiiIiIi var13 = iliIiIiIiiIiIi.liIiilliiiiIiillii;
            iIllllIlIlllllIl var14 = null;
            if (var11 != null) {
               try (IlIIiiIillIIiiIi var15 = this.IiiIiiIlIl.IIlllIlliIll()) {
                  class_243 var16 = var6.method_33571();
                  class_238 var17 = var11.method_5829();
                  double var18 = lllIliIlillIliIl.IIlilIliiIli(var16, var17);
                  double var20 = lllIliIlillIliIl.IIlilIliiIli(var11.method_33571(), var6.method_5829());
                  this.llIliiIlIl.liiiIIllIl(var11, var18);
                  class_243 var22 = new class_243(var6.method_23317(), var6.method_23318() + 1.1, var6.method_23321());
                  class_243 var23 = var11.method_33571();
                  double var24 = llIIliiilIIlii.IIillIiliIil(
                     var11.method_5791(),
                     var11.method_36455(),
                     var22.field_1352 - var23.field_1352,
                     var22.field_1351 - var23.field_1351,
                     var22.field_1350 - var23.field_1350
                  );
                  double var26 = IIiilIiiiIii(var6, var11, this.llIliiIlIl.IIlllIlliIll());
                  float var28 = var6.method_7261(0.5F);
                  var37 ^= ((long)llIIliiilIIlii.lIiiIiIlilli(var28, var6.method_7279(), 0.95F) ^ var37) & -1L >>> 32;
                  var39 ^= (
                        (long)lIiiililiIiiilil.IliIlllilIi(illIllilIilIllil.Iilllilliill(var11.method_5628()), (double)illIllilIilIllil.IIIllIIliIIl(), 1)
                              << 32
                           ^ var39
                     )
                     & -1L << 32;
                  IlIiillllIiill var31 = new IlIiillllIiill(
                     now,
                     var18,
                     var20,
                     (int)var37,
                     var28,
                     var24,
                     var26,
                     this.llIliiIlIl.Illlllllilll(),
                     (int)(var39 >>> 32),
                     this.IlIliiIlIl.IilliliilIIi(),
                     illIllilIilIllil.IiIlliIliiIl(),
                     var10,
                     var11.method_6039(),
                     var11.method_23318() - var6.method_23318(),
                     this.IiIiliIiiiIi(now),
                     this.iIiliiIlIl,
                     this.IlIillIiilIi(var16, var11, var17)
                  );
                  var13 = this.IiIliiIlIl.iIlIlllllill(var6, var11, var31);
                  var14 = var13.IliIlllilIi();
                  this.lIiliiIlIl = this.ilIliiIlIl.liiiIIllIl() < 0;
                  var39 ^= ((long)(!this.lIiliiIlIl && this.ilIliiIlIl.iIlIlllllill() ? 1 : 0) ^ var39) & -1L >>> 32;
                  float[] var33 = var13.lIiiIiIlilli() == lIIIilIliIIIilIl.IlIiIlliIl && var18 > 10.0
                     ? this.iIIliiIlIl.lliIliliIl(this.iliIiiIlIl.IilliliilIIi())
                     : null;
                  if (var33 != null) {
                     this.ilIliiIlIl.IIIllIIliIIl(var33[0], var33[1]);
                  } else {
                     this.ilIliiIlIl.iliIiiliiiii(var11, var14);
                  }

                  var41 ^= ((long)this.IlIliiIlIl.IilliliilIIi() << 32 ^ var41) & -1L << 32;
                  if ((int)var39 != 0
                     && var13.liiiIIllIl()
                     && this.ilIliiIlIl.IlIlllIlilIl(var11, var13.iIlIlllllill(), var13.IilliliilIIi(), (boolean)((int)(var41 >>> 32)))) {
                     this.iIiliiIlIl = (int)(var41 >>> 32) != 0 && !var13.IilliliilIIi();
                     var14 = this.IiIliiIlIl.IilliliilIIi(var6, var11, var18, var10.IilliliilIIi());
                     var13 = new iliIiIiIiiIiIi(var14, true, var13.iIlIlllllill(), var13.IilliliilIIi(), lIIIilIliIIIilIl.IiIiIlliIl);
                  }
               }
            }

            this.IilliiIlIl = var13.lIiiIiIlilli();
            if (this.lilliiIlIl >= 40) {
               this.IIIliiIlIl.Iilllilliill();
            }

            this.IIIliiIlIl.IlIlllIlilIl(now);
            if (var11 != null && var8.lIiiIiIlilli() && var14 != null) {
               lIIIililiIIIilil.IliIlllilIi(this.iilIiiIlIl, var14, 50);
            } else {
               lIIIililiIIIilil.IlIlllIlilIl(this.iilIiiIlIl);
            }

            this.Iliilliiilii(
               var6,
               now,
               this.iliIiiIlIl
                  .IIlilIliiIli(
                     this.IIiIiiIlIl.Iiilliiliiil() || this.IIiIiiIlIl.IlIillIiilIi() || this.iliIiiIlIl.IiIiliIiiiIi() && this.IIiIiiIlIl.Ililllililil()
                  )
            );
            this.lilIliilIl(this.lIlIliIlIl(var8, var11, var6, now));
         }
      }
   }

   public boolean IIillIiliIil() {
      return this.iiIliiIlIl;
   }

   private IlillIIillillIIi illIlIilIl(liIIiilliiIIiill tone, String hint, String state, String name) {
      return new IlillIIillillIIi(
         tone, iIiIlIliIl(hint, 12), state, this.llIliiIlIl.Iiiiliiiiiii(), this.llIliiIlIl.IIIIllIIIl(), name == null ? null : iIiIlIliIl(name, 48)
      );
   }

   private static String IIiIllIiIl(illiIiilIiliIiil v) {
      String var1 = v.liiiIIllIl().iliIliIlll;
      if (!var1.contains(liIlliiIll<"liIlliiIll","fGqEkza1f6auW5W4H2zHx4qdNnLi0v9MuZVyloHF">())) {
         return iIiIlIliIl(var1, 48);
      } else {
         String var2 = v.iIlIlllllill() != null && !v.iIlIlllllill().isBlank()
            ? v.iIlIlllllill()
            : liIlliiIll<"liIlliiIll","mVwg+Y8zltxWZq4hi0Dz2tDXL+R2VAsMkHwRaW1hnDX1odIa">();
         return iIiIlIliIl(String.format(Locale.ROOT, var1, var2), 48);
      }
   }

   private static class_304[] iiiIlIIIll(class_315 o) {
      class_304[] var1 = new class_304[]{
         o.field_1894,
         o.field_1881,
         o.field_1913,
         o.field_1849,
         o.field_1903,
         o.field_1832,
         o.field_1867,
         o.field_1886,
         o.field_1904,
         o.field_1871,
         o.field_1869,
         o.field_1831,
         o.field_1822
      };
      class_304[] var2 = o.field_1852 == null ? new class_304[0] : o.field_1852;
      class_304[] var3 = Arrays.copyOf(var1, var1.length + var2.length);
      System.arraycopy(var2, 0, var3, var1.length, var2.length);
      return var3;
   }

   public void liiiIIllIl() {
      class_310 var1 = class_310.method_1551();
      long var2 = IIIiillllIIiilll.IliIlllilIi();
      this.llIIlilIIl();
      this.iIiIiiIlIl.IliIlllilIi();
      this.liIliiIlIl.lIiiIiIlilli();
      if (var1.field_1724 != null && var1.method_1562() != null) {
         this.lIiIiiIlIl.IliIlllilIi(var1.method_1562(), var2);
         this.lllliiIlIl = this.illIlIilIl(
            liIIiilliiIIiill.iiIIiliill,
            liIlliiIll<"liIlliiIll","pzdflUyNq5XQRLBfF5G9ni8/gQzzhirVAUBph0sBHvrlgbo=">(),
            null,
            liIlliiIll<"liIlliiIll","YLZOHc3HyXqxvxuKpmBWA8AJWh46d7qiUqJaSFL729aIE6MNrwg7fogl">()
         );
      } else {
         this.lIiIiiIlIl.IliIlllilIi(null, var2);
         this.lllliiIlIl = this.illIlIilIl(
            liIIiilliiIIiill.iiIIiliill,
            liIlliiIll<"liIlliiIll","pzdflUyNq5XQRLBfF5G9ni8/gQzzhirVAUBph0sBHvrlgbo=">(),
            null,
            liIlliiIll<"liIlliiIll","L+bzo8/djwfdXlTDYtMCDj5KUK2nUWs0l8t3JsLqxT9ptgHJqXe6NS5CjP6netIDeOA=">()
         );
      }
   }

   public void iliIiiliiiii(IliIliIllliIliIl e) {
      if (e != null && e.iilIIiiIll != null) {
         if (e.iilIIiiIll instanceof class_2645) {
            this.iIlliiIlIl = true;
         }

         this.lliIiiIlIl.IliIlllilIi(e.iilIIiiIll);
      }
   }

   private class_1309 Illillliilli(class_1309 cur, long tick) {
      long var8 = -8625412310716236564L;
      class_310 var4 = class_310.method_1551();
      var8 ^= ((long)this.llIliiIlIl.IiIiliIiiiIi() << 32 ^ var8) & -1L << 32;
      if (var4.field_1687 != null
         && (int)(var8 >>> 32) >= 0
         && (int)(var8 >>> 32) != cur.method_5628()
         && this.llIliiIlIl.IIlilIliiIli((int)(var8 >>> 32), tick, 60L)) {
         if (var4.field_1687.method_8469((int)(var8 >>> 32)) instanceof class_1309 var6 && liiIIIlliiiIIIll.IliIlllilIi(var6, lilllliiilllli.iiIiIiIIIl)) {
            return var6;
         }

         return null;
      } else {
         return null;
      }
   }

   public void Iilllilliill(class_243 velocity, boolean explosion) {
      if (velocity != null && this.iiIliiIlIl) {
         this.ilIliiIlIl.lIiiIiIlilli(IIllIIlilIllIIli.IlIlllIlilIl());
         if (!explosion) {
            this.IiIliiIlIl.liiiIIllIl(IIllIIlilIllIIli.IlIlllIlilIl());
         }
      }
   }

   private void Iilililiiili(IlIillIiilIi e, long tick, int selfId) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:365)
      //   at java.base/java.util.ArrayList.get(ArrayList.java:428)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processStatement(SwitchPatternMatchProcessor.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processPatternMatchingRec(SwitchPatternMatchProcessor.java:40)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processPatternMatchingRec(SwitchPatternMatchProcessor.java:35)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processPatternMatchingRec(SwitchPatternMatchProcessor.java:35)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchPatternMatchProcessor.processPatternMatching(SwitchPatternMatchProcessor.java:21)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:318)
      //
      // Bytecode:
      // 00: ldc2_w -306120812587419189
      // 03: lstore 11
      // 05: aload 1
      // 06: dup
      // 07: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a: pop
      // 0b: astore 5
      // 0d: lconst_0
      // 0e: lload 11
      // 10: dup2_x2
      // 11: lxor
      // 12: lconst_1
      // 13: lneg
      // 14: bipush 32
      // 16: lshl
      // 17: land
      // 18: lxor
      // 19: lstore 11
      // 1b: aload 5
      // 1d: lload 11
      // 1f: bipush 32
      // 21: lushr
      // 22: l2i
      // 23: invokedynamic typeSwitch (Ljava/lang/Object;I)I bsm=java/lang/runtime/SwitchBootstraps.typeSwitch (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ gg/corz/IiIiliIiiiIi, gg/corz/ilIiIiIiIiIiIiIi, gg/corz/IIlilIIllIlilIIl, gg/corz/llIiIIliilIiIIli ]
      // 28: tableswitch 131 0 3 32 54 77 107
      // 48: aload 5
      // 4a: checkcast gg/corz/IiIiliIiiiIi
      // 4d: astore 7
      // 4f: aload 0
      // 50: getfield gg/corz/liIlIIIliiIlIIIl.IliIiiIlIl Lgg/corz/iIIilIiIlIilIi;
      // 53: aload 7
      // 55: invokevirtual gg/corz/IiIiliIiiiIi.IliIlllilIi ()J
      // 58: invokevirtual gg/corz/iIIilIiIlIilIi.liiiIIllIl (J)V
      // 5b: goto ab
      // 5e: aload 5
      // 60: checkcast gg/corz/ilIiIiIiIiIiIiIi
      // 63: astore 8
      // 65: aload 0
      // 66: getfield gg/corz/liIlIIIliiIlIIIl.llIliiIlIl Lgg/corz/ililIIilIiilIIil;
      // 69: aload 8
      // 6b: invokevirtual gg/corz/ilIiIiIiIiIiIiIi.IliIlllilIi ()I
      // 6e: lload 2
      // 6f: invokevirtual gg/corz/ililIIilIiilIIil.iIlIlllllill (IJ)V
      // 72: goto ab
      // 75: aload 5
      // 77: checkcast gg/corz/IIlilIIllIlilIIl
      // 7a: astore 9
      // 7c: aload 0
      // 7d: getfield gg/corz/liIlIIIliiIlIIIl.llIliiIlIl Lgg/corz/ililIIilIiilIIil;
      // 80: aload 9
      // 82: invokevirtual gg/corz/IIlilIIllIlilIIl.IliIlllilIi ()I
      // 85: aload 9
      // 87: invokevirtual gg/corz/IIlilIIllIlilIIl.liiiIIllIl ()I
      // 8a: iload 4
      // 8c: lload 2
      // 8d: invokevirtual gg/corz/ililIIilIiilIIil.IilliliilIIi (IIIJ)V
      // 90: goto ab
      // 93: aload 5
      // 95: checkcast gg/corz/llIiIIliilIiIIli
      // 98: astore 10
      // 9a: aload 0
      // 9b: getfield gg/corz/liIlIIIliiIlIIIl.llIliiIlIl Lgg/corz/ililIIilIiilIIil;
      // 9e: aload 10
      // a0: invokevirtual gg/corz/llIiIIliilIiIIli.IliIlllilIi ()I
      // a3: iload 4
      // a5: invokevirtual gg/corz/ililIIilIiilIIil.lIiiIiIlilli (II)V
      // a8: goto ab
      // ab: return
   }

   public liIlIIIliiIlIIIl(lliliiiililiii module) {
      this.iIiIiiIlIl = new ilIiilIlIiIiilIl();
      this.IliIiiIlIl = new iIIilIiIlIilIi();
      this.lliIiiIlIl = new lIlilIiiIlilIi();
      this.iliIiiIlIl = new iilllIiIIillIi(new Random());
      this.IiiIiiIlIl = new illillIlIilillIl(this.IIiIiiIlIl, this.iliIiiIlIl);
      this.liiIiiIlIl = new liiIiiiiiiIiii();
      this.iiiIiiIlIl = new IIiIIIIllIiIIIIl(this.liiIiiIlIl);
      this.IIIliiIlIl = new lIlIiIIliIlIiIIl(this.IIiIiiIlIl, this.IiiIiiIlIl);
      this.lIIliiIlIl = new IilIllililIlli(700, 1200);
      this.iIIliiIlIl = iIIIllilIlIIllil.IIIllIIliIIl(this.lIIliiIlIl, iilIiiIIiIii.liIiIilIliiIiIilIl);
      this.IlIliiIlIl = new lllliIilillliIil();
      this.llIliiIlIl = new ililIIilIiilIIil();
      this.IiIliiIlIl = new IllilIlllllilIll(new Random(), this.iIIliiIlIl);
      this.lllliiIlIl = IlillIIillillIIi.lIiIIIiiil;
      this.IilliiIlIl = lIIIilIliIIIilIl.iIIiIlliIl;
      this.lliliiIlIl = Long.MIN_VALUE;
      this.iilIiiIlIl = module;
      this.ilIliiIlIl = new Iillllllilllll(module, this.iliIiiIlIl, this.IiiIiiIlIl, this.IIIliiIlIl, this.IIiIiiIlIl);
      this.liIliiIlIl = new illIIliIilIIli(module);
   }

   private void Iiiiliiiiiii(illiIiilIiliIiil v) {
      this.IIIIllIIIl();
      this.lIlliiIlIl = false;
      this.iiIliiIlIl = false;
      this.IIlliiIlIl = false;
      if (v.liiiIIllIl() == iiiiiiIlIIIIIIll.iIIIliIlll) {
         this.iliIiiIlIl.liiiIIllIl();
         this.IIIliiIlIl.iIlIlllllill();
      }

      this.lilIliilIl(
         this.illIlIilIl(liIIiilliiIIiill.lIlIiliill, liIlliiIll<"liIlliiIll","AU/BZ62Ny6ubvA21K2Egnvu+YSxrLQWtoPYOC6yYOJotEQ==">(), null, IIiIllIiIl(v))
      );
   }

   private static String IlIllllIll(Throwable t) {
      long var4 = 7098267503715033173L;
      StringBuilder var1 = new StringBuilder(String.valueOf(t));
      StackTraceElement[] var2 = t.getStackTrace();

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < Math.min(4, var2.length); var6 += 4294967296L) {
         var1.append(liIlliiIll<"liIlliiIll","9E+ugntvMLll/MXAbBOb8SLTgCCjXfxhPRcd0PgPt3E=">()).append(var2[(int)(var6 >>> 32)]);
      }

      return var1.toString();
   }

   private static void lIIlliIIll(AutoCloseable c) {
      if (c != null) {
         try {
            c.close();
         } catch (Exception var2) {
         }
      }
   }
}
