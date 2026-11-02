package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_2338.class_2339;

public final class iiiiliIiIIIIiiIi {
   public static final double IllIliiIIi = 0.08;
   public static final String IiiIliiIIi = "fired";
   public static final int liIIliiIIi = 2;
   private class_2338 iIIiliiIIi;
   private int IlliliiIIi;
   public static final int ilIIliiIIi = 2;
   private IIllIIllIllIIl iiIiliiIIi;
   public static final String lliIliiIIi = "dig";
   private float IlilliiIIi;
   private long iillliiIIi;
   private long illiliiIIi;
   public static final double lllIliiIIi = 0.5;
   public static final int liiIliiIIi = 4;
   private final lIlIiIIliIlIiIIl lIllliiIIi;
   public static final int iiiIliiIIi = 200;
   private boolean lIliliiIIi;
   public static final String lilIliiIIi = "stale reach";
   private float ililliiIIi;
   private class_2338 IIilliiIIi;
   private final Map<Long, Long> IlllliiIIi = new HashMap<>();
   private float llilliiIIi;
   private Iiilllliilll IIliliiIIi;
   private final Map<Long, iilIiiiIIiIiii> llllliiIIi = new HashMap<>();
   private Predicate<class_243> IiIiliiIIi;
   public static final int IIIlliiIIi = 2;
   public static final String iilIliiIIi = "stale hit";
   public static final float lIIIliiIIi = 4.0F;
   private iiIIIIIlIIlIIIIl lIilliiIIi;
   private long lIIiliiIIi;
   public static final float iliiIiiIIi = 11.0F;
   public static final int iIIlliiIIi = 2;
   public static final long ilIlliiIIi = 100L;
   public static final String lIiIliiIIi = "hit";
   public static final double iIlIliiIIi = 4.5;
   private double iIilliiIIi;
   private final Map<Long, iiIIIIIlIIlIIIIl> IillliiIIi;
   private long llIiliiIIi;
   private final liIlIllliiIlIlll iIllliiIIi;
   public static final String IiiiIiiIIi = "unplaced";
   public static final int llIlliiIIi = 10;
   public static final long lliiIiiIIi = 3000L;
   public static final String iiiiIiiIIi = "armed";
   private class_243 IlIiliiIIi;
   private long ilIiliiIIi;
   public static final int IlIlliiIIi = 9;
   private boolean iililiiIIi;
   public static final String liiiIiiIIi = "placed";
   public static final String IilIliiIIi = "stale far";
   public static final float iIIIliiIIi = 0.5F;
   public static final int iiIIliiIIi = 5;
   private String llliliiIIi;
   public static final String iIiIliiIIi = "weak";
   private long lililiiIIi;
   public static final int lIIlliiIIi = 3;
   private IiiIliliiIli liIiliiIIi;
   private class_2338 IililiiIIi;
   public static final double illIliiIIi = 0.5;
   public static final float IIIIliiIIi = 2.0F;
   private final lilllllliillllll IIllliiIIi;
   private int lIiiliiIIi;
   private class_2338 iiilliiIIi;
   public static final int IIlIliiIIi = 2;
   public static final int llIIliiIIi = 8;
   private boolean IiilliiIIi;
   public static final int lIlIliiIIi = 2;
   public static final String iliIliiIIi = "owed";
   private long IIIiliiIIi;
   private boolean liilliiIIi;
   private long lillliiIIi;
   public static final String IIiIliiIIi = "stale away";
   public static final String IliIliiIIi = "instant";
   private boolean IIiiliiIIi;
   private long iIliliiIIi;
   public static final int IiIIliiIIi = 3;
   private final Map<Long, illiIlIiliIl> illlliiIIi = new HashMap<>();
   private static final String liIlliiIIi = "timeout";
   private static final class_2350[] iiIlliiIIi = class_2350.values();
   public static final float IlIIliiIIi = 3.0F;
   public static final double IiIlliiIIi = 60.0;

   public boolean iIlllIllll(class_2338 c) {
      return c != null && this.illlliiIIi.containsKey(c.method_10063());
   }

   private static float IIililIili(liiilIiliiiilIil t) {
      if (t == null) {
         return Float.POSITIVE_INFINITY;
      } else {
         float var1 = t.Illillliilli() > 0.0F && Float.isFinite(t.Illillliilli()) ? t.Illillliilli() : 1.0F;
         return t.IliIlllilIi() / var1;
      }
   }

   private static float IiIliliIli(IIllIIllIllIIl land, class_2338 cell, int s) {
      class_746 var3 = class_310.method_1551().field_1724;
      if (var3 != null && land.IlIlllIlilIl() != null) {
         float var4 = IiliiIililiiIi.liiiIIllIl(cell, null, null);
         return iiIiiliIIliili.iliIiiliiiii(
            var4, lllIliIlillIliIl.iiiIlIIIll(var3), new IilIlIIllilIlIIl(land.IIillIiliIil(), land.IlIlllIlilIl().iIIIlIlIIl()), s
         );
      } else {
         return Float.NaN;
      }
   }

   static String IIiillIiil(boolean hurt, boolean away, boolean fires, boolean outOfReach, boolean keeps) {
      if (!hurt) {
         return lliIIliliIIl<"lliIIliliIIl","DnEWKgg00JzujJgin/2zkJWAKur3RpMTWsIRzU7B74yBH94nnQ==">();
      } else if (away) {
         return lliIIliliIIl<"lliIIliliIIl","WHtv0PUnO3ysWsku5AaeCx8Rj8OYC6KBULo3Cwer0A7e1IVsSEn1">();
      } else if (fires && !outOfReach) {
         return lliIIliliIIl<"lliIIliliIIl","GRUynBExg1mjtH0EhYJhjBcsUP8yne1AqwJoFIpuoKY0eYxmVQ==">();
      } else {
         return keeps ? lliIIliliIIl<"lliIIliliIIl","dkmejihalzZjno5KvNJJ29rMHmCrw1z9vrEGVOuzkfJ/cicGisc=">() : null;
      }
   }

   private boolean lilliiilli(IIllIIllIllIIl s) {
      lliiilIiiliiilIi var2 = s == null ? null : s.IlIlllIlilIl();
      liiilIiliiiilIil var3 = s == null ? null : s.IiIlliIliiIl();
      return var2 != null && var3 != null && !lIIlliIIll(s) ? IiiIlliiIl(var2.IIIIllIIIl(), var2.iIIIlIlIIl(), var3.Illlllllilll()) : false;
   }

   public boolean lllllillll(IIllIIllIllIIl s) {
      return !this.illlliiIIi.isEmpty() && this.IilIililIi(s) != null;
   }

   public void IIlllIlliIll() {
      if (this.iIllliiIIi.Iilllilliill()) {
         if (this.iIllliiIIi.Ililllililil() == null
            || !this.iIlllIllll(this.iIllliiIIi.Ililllililil())
            || lliiIliliiIl.IilliliilIIi(this.iIllliiIIi.Ililllililil()) < 0) {
            this.IIIlilIIli(this.iIllliiIIi.Ililllililil());
         }

         this.IIliliiIIi = null;
         this.lIliliiIIi = false;
      }

      this.iIllliiIIi.IIIilIIiiIIi();
      this.iililiiIIi = false;
      this.IIiiliiIIi = false;
      this.ilIiliiIIi = Long.MIN_VALUE;
   }

   static boolean lililiilil(int count) {
      return count >= 2;
   }

   static float IIiIllIiIl(float planned) {
      return Math.max(2.0F, Math.min(4.0F, 0.5F * planned));
   }

   private boolean iiiliIIIii(class_2338 cell) {
      Iiilllliilll var2 = this.iIllliiIIi.iIlIlllllill();
      if (var2 != null && var2.IIlllIlliIll()) {
         IIllIIllIllIIl var3 = this.iiIiliiIIi;
         if (var3 != null && cell != null && var3.IIIllIIliIIl() == this.IIllliiIIi.IIillIiliIil() && var3.IiIlliIliiIl() != null) {
            Iiilllliilll var4 = this.IIliilIlii(var3, cell, false);
            if (var4 == null) {
               return false;
            } else {
               if (this.iIllliiIIi.liiiIIllIl(var4)) {
                  this.IIliliiIIi = var4;
               }

               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   static boolean iIiliIlili(long planTick, long tick) {
      return planTick == Long.MIN_VALUE || tick < planTick || tick - planTick >= 2L;
   }

   static boolean Iiliililii(IIllIIllIllIIl s) {
      IlIIIlilllIIIlil var1 = s != null && s.Iiilliiliiil() != null && s.Iiilliiliiil().IliIlllilIi() != null
         ? s.Iiilliiliiil().IliIlllilIi()
         : IlIIIlilllIIIlil.iliIiilIil;
      return var1 != IlIIIlilllIIIlil.liiIiilIil;
   }

   static int Iiiilliiil(int clicksLeft, int readyIn) {
      return Math.max(1, Math.min(8, Math.max(clicksLeft, readyIn)));
   }

   static boolean IIlIilIlIi(String reason) {
      return reason == null
         || !reason.endsWith(lliIIliliIIl<"lliIIliliIIl","q8DsrKVlVpytZ8sxTPDoAYEo+lrF+NC+qFzCusy7uJI0vN1zJi3n6Jd8Wv4=">())
            && !lliIIliliIIl<"lliIIliliIIl","3HKOCDi+ByerO5zcED7dc1i+lNNcIl3eGcIV9udiAFXGEg==">().equals(reason);
   }

   static int lilIliilIl(int[] reserve, int learned, boolean[] unconfirmed, boolean[] counts) {
      long var6 = 136352599292811182L;
      if (reserve == null) {
         return 0;
      } else {
         var6 ^= (0L ^ var6) & -1L << 32;

         for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < reserve.length && (int)var6 < 9; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            if (reserve[(int)var6] > 0 && !liillIlliiillIll.iIlIlllllill((int)var6, learned, unconfirmed, counts, false)) {
               var6 ^= ((long)((int)(var6 >>> 32) + reserve[(int)var6]) << 32 ^ var6) & -1L << 32;
            }
         }

         return (int)(var6 >>> 32);
      }
   }

   static boolean IllIllllIl(boolean detonateSlot, int anchorSlot, int placeAnchor, int glowSlot, int charges) {
      if (detonateSlot && placeAnchor < 0) {
         return false;
      } else {
         return (detonateSlot || anchorSlot <= 0) && glowSlot < 0 ? false : charges >= 0;
      }
   }

   private Iiilllliilll IIliilIlii(IIllIIllIllIIl s, class_2338 forcedCell, boolean allowCover) {
      return this.iIliiIllii(s, forcedCell, allowCover, null);
   }

   static boolean iIiIlIliIl(float planned, float ehp, float live) {
      return planned >= live || planned >= IIiIllIiIl(ehp);
   }

   private boolean iiiilIIIIi(IIllIIllIllIIl s) {
      long var18 = 9141265198718892450L;
      long var20 = 5298567487394113927L;
      long var22 = 5369368380441145394L;
      if (this.iIllliiIIi.Iilllilliill() && s != null && s.IlIlllIlilIl() != null && s.IiIlliIliiIl() != null && s.IiIlliIliiIl().lIiiIiIlilli() != null) {
         this.llIiliiIIi = this.IIllliiIIi.IIillIiliIil();
         class_2338 var2 = this.iIllliiIIi.Ililllililil();
         if (var2 == null) {
            return false;
         } else {
            liiilIiliiiilIil var3 = s.IiIlliIliiIl();
            lliiilIiiliiilIi var4 = s.IlIlllIlilIl();
            class_243 var5 = var4.liiiIIllIl();
            class_243 var6 = var4.iIlIlllllill() != null ? var4.iIlIlllllill() : var5;
            var18 ^= (
                  (long)(
                           var5 != null
                                 && var6 != null
                                 && illilIilil(lllIliIlillIliIl.IIlilIliiIli(var6, lllIliIlillIliIl.lIiiIiIlilli(var2)), lliiIliliiIl.liiiIIllIl())
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var18
               )
               & -1L << 32;
            if (this.iIlllIllll(var2) && lliiIliliiIl.IilliliilIIi(var2) >= 0) {
               if ((int)(var18 >>> 32) == 0 && s.IliIlllilIi().iIIIlIlIIl()) {
                  this.llIliilIli(s, var3, var2, Iiiilliiil(lliililiil(this.iIllliiIIi.IIillIiliIil(), lliiIliliiIl.IilliliilIIi(var2)), s.Iilllilliill()));
               }

               if ((int)(var18 >>> 32) == 0) {
                  return false;
               } else {
                  this.IlIIillIIi(var2, lliIIliliIIl<"lliIIliliIIl","WHtv0PUnO3ysWsku5AaeCx8Rj8OYC6KBULo3Cwer0A7e1IVsSEn1">());
                  return true;
               }
            } else if (!s.IliIlllilIi().iIIIlIlIIl()) {
               var18 ^= ((long)lliiIliliiIl.IilliliilIIi(var2) ^ var18) & -1L >>> 32;
               Iiilllliilll var9 = this.iIllliiIIi.iIlIlllllill();
               float var10 = var9 == null ? 0.0F : var9.iliIiiliiiii();
               float var11 = this.iIIliIlIli(var3, var2, Iiiilliiil(lliililiil(this.iIllliiIIi.IIillIiliIil(), (int)var18), s.Iilllilliill()));
               var20 ^= ((long)(this.lilliiilli(s) && !IiIilliIil(this.ilIiliiIIi, this.IIllliiIIi.IIillIiliIil()) && !this.IIiiliiIIi ? 1 : 0) << 32 ^ var20)
                  & -1L << 32;
               var20 ^= ((long)(!iiIilIIlil((int)var18, s.Iilllilliill()) && ((int)var18 < 1 || !this.Illlilllli(s, var2)) ? 0 : 1) ^ var20) & -1L >>> 32;
               class_243 var14 = var4.lIiiIiIlilli() == null ? class_243.field_1353 : var4.lIiiIiIlilli();
               class_243 var15 = var3.iliIiiliiiii() != null ? var3.iliIiiliiiii() : var3.lIiiIiIlilli().method_73189();
               var22 ^= (
                     (long)(
                              var5 != null
                                    && var15 != null
                                    && Illillllil(
                                       var5.field_1352,
                                       var5.field_1350,
                                       var14.field_1352,
                                       var14.field_1350,
                                       var15.field_1352,
                                       var15.field_1350,
                                       (double)var2.method_10263() + 0.5,
                                       (double)var2.method_10260() + 0.5
                                    )
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var22
                  )
                  & -1L << 32;
               String var17 = IIiillIiil(
                  iIiIlIliIl(var11, var10, IIililIili(var3)),
                  (boolean)((int)(var18 >>> 32)),
                  (boolean)((int)(var20 >>> 32)),
                  (boolean)((int)var20),
                  (boolean)((int)(var22 >>> 32))
               );
               if (var17 == null) {
                  return false;
               } else {
                  this.lIIIiiIIIi(var2, var17, iIiilIliil(var17));
                  return true;
               }
            } else if ((int)(var18 >>> 32) != 0) {
               this.lIIIiiIIIi(var2, lliIIliliIIl<"lliIIliliIIl","WHtv0PUnO3ysWsku5AaeCx8Rj8OYC6KBULo3Cwer0A7e1IVsSEn1">(), false);
               return true;
            } else if (this.llIliilIli(s, var3, var2, Iiiilliiil(lliililiil(this.iIllliiIIi.IIillIiliIil(), lliiIliliiIl.IilliliilIIi(var2)), s.Iilllilliill()))
               )
             {
               return false;
            } else {
               this.lIIIiiIIIi(var2, lliIIliliIIl<"lliIIliliIIl","DnEWKgg00JzujJgin/2zkJWAKur3RpMTWsIRzU7B74yBH94nnQ==">(), true);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   static boolean IIIIllIIIl(iIilIlilIlilIlil charges, int phase) {
      return charges == iIilIlilIlilIlil.illilIiIil && phase < 0;
   }

   static boolean illliIilli(float ehp, float excess) {
      return Float.isFinite(ehp) && !(ehp <= 0.0F) ? ehp >= 4.0F || Float.isFinite(excess) && excess > 0.0F && ehp >= excess : false;
   }

   private void iIlIiIllIi(class_2338 tick, long cell) {
      long var8 = 3033083164782518159L;
      long var4 = tick.method_10063();
      illiIlIiliIl var6 = this.illlliiIIi.get(var4);
      if (var6 != null) {
         var8 ^= ((long)(var6.iIlIlllllill() + 1) << 32 ^ var8) & -1L << 32;
         if ((int)(var8 >>> 32) >= 3) {
            this.illlliiIIi.remove(var4);
            this.IlllliiIIi.put(var4, IIIiillllIIiilll.IliIlllilIi() + 3000L);
         } else {
            this.illlliiIIi.put(var4, new illiIlIiliIl(var6.IliIlllilIi(), cell + 2L, (int)(var8 >>> 32)));
         }
      }
   }

   private Predicate<class_243> iiliiIIiii(Predicate<class_243> base, class_638 anchorsOnly) {
      return anchorsOnlyx -> {
         if (anchorsOnlyx == null) {
            return true;
         } else {
            class_2338 var4 = class_2338.method_49638(anchorsOnlyx);
            if (this.iliiiIiiii(var4)) {
               return true;
            } else {
               return anchorsOnly != null && !anchorsOnly.method_8320(var4).method_27852(class_2246.field_23152)
                  ? true
                  : base != null && base.test(anchorsOnlyx);
            }
         }
      };
   }

   private void ilIIiIiIIi(class_2338 tick, long cell) {
      if (tick != null) {
         this.illlliiIIi.putIfAbsent(tick.method_10063(), new illiIlIiliIl(cell, Long.MIN_VALUE, 0));
         if (this.illlliiIIi.size() > 4) {
            long var4 = 0L;
            long var6 = Long.MAX_VALUE;

            for (Entry var9 : this.illlliiIIi.entrySet()) {
               if (((illiIlIiliIl)var9.getValue()).IliIlllilIi() < var6) {
                  var6 = ((illiIlIiliIl)var9.getValue()).IliIlllilIi();
                  var4 = (Long)var9.getKey();
               }
            }

            this.illlliiIIi.remove(var4);
         }
      }
   }

   private static boolean iilllIIill(class_238 foes, class_243 box, List<liiilIiliiiilIil> hisEye) {
      if (box != null && lllIliIlillIliIl.IIlilIliiIli(box, foes) <= 4.5) {
         return true;
      } else if (hisEye == null) {
         return false;
      } else {
         for (liiilIiliiiilIil var4 : hisEye) {
            class_243 var5 = var4 == null
               ? null
               : (var4.IiIlliIliiIl() != null ? var4.IiIlliIliiIl() : (var4.lIiiIiIlilli() != null ? var4.lIiiIiIlilli().method_33571() : null));
            if (var5 != null && lllIliIlillIliIl.IIlilIliiIli(var5, foes) <= 4.5) {
               return true;
            }
         }

         return false;
      }
   }

   public String IIlilIliiIli() {
      return this.llliliiIIi != null && !this.llliliiIIi.isBlank()
         ? this.llliliiIIi.trim().replace(' ', '_')
         : lliIIliliIIl<"lliIIliliIIl","8RPKKqjxyZxtOf2Y7ojZ3NhQqWUSN5PB7ebFdZ8=">();
   }

   static boolean lIlliiIlli(ilIiliilIiIiliil damage, float knock, float tm, float ehp) {
      return damage != null && damage.Ililllililil(knock, tm, Float.isFinite(ehp) && ehp > 0.0F && knock >= ehp);
   }

   private boolean ilIiiIiIii(IIllIIllIllIIl p, Iiilllliilll s) {
      long var9 = -3054607937373241893L;
      long var11 = 4850739479876586824L;
      liiilIiliiiilIil var3 = p.IiIlliIliiIl();
      if (var3 != null && var3.lIiiIiIlilli() != null && s != null && s.liiiIIllIl() != null && s.Iiilliiliiil()) {
         var9 ^= ((long)iIIilIlIil(var3.IIlllIlliIll(), var3.IlIlllIlilIl() == null ? 0.0 : var3.IlIlllIlilIl().field_1351) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)iliiiillIiiiiill.iIlIiIllIi(s.Ililllililil()) ^ var9) & -1L >>> 32;
         if (!IIIillIIil(s.Illlllllilll(), p.Iilllilliill(), (int)var9, (boolean)((int)(var9 >>> 32)))) {
            return false;
         } else {
            var11 ^= ((long)liilliiill(s.Illlllllilll(), (int)var9) << 32 ^ var11) & -1L << 32;
            float var7 = Math.min(s.iliIiiliiiii(), this.iIIliIlIli(var3, s.liiiIIllIl(), Iiiilliiil((int)(var11 >>> 32), p.Iilllilliill())));
            float var8 = this.liIiliiIIi == null ? 3.0F : this.liIiliiIIi.IIIllIIliIIl();
            return lliIliliIl(var7, IIililIili(var3), var8, false);
         }
      } else {
         return false;
      }
   }

   public class_2338 IIIilIIiiIIi() {
      return this.Iiilliiliiil() ? this.iIllliiIIi.Ililllililil() : null;
   }

   static boolean liIlliiIll(ilIiliilIiIiliil tm, float hp, float full, float dealt, float his, boolean cost, boolean kills, boolean real, boolean pops) {
      if (tm == null || !tm.lIiiIiIlilli(tm.IlIlllIlilIl(hp, full), dealt, tm.IIIllIIliIIl(kills, cost))) {
         return false;
      } else if (cost) {
         return true;
      } else {
         return real && tm.IiIlliIliiIl(hp, full) ? true : pops && tm.IIlllIlliIll(his, false, hp, full, false);
      }
   }

   public class_243 lIilliIill(IIllIIllIllIIl d, IiiIliliiIli s, iiliiiIiIIiiiiIi advice) {
      if (!this.iIllliiIIi.Iilllilliill() && d != null && s != null && d.IiIlliIliiIl() != null) {
         Iiilllliilll var4 = this.IIliliiIIi;
         if (var4 == null || var4.liiiIIllIl() == null || this.lIiiiiIiii(d) != null) {
            return null;
         } else if (!Ilillllill(d, s, advice)) {
            return null;
         } else {
            class_2338 var5 = var4.liiiIIllIl();
            long var6 = this.IIllliiIIi.IIillIiliIil();
            if (this.lIIiliiIIi == var6 && var5.equals(this.iIIiliiIIi)) {
               return this.IlIiliiIIi;
            } else {
               this.lIIiliiIIi = var6;
               this.iIIiliiIIi = var5;
               this.IlIiliiIIi = this.ilillIiill(var4);
               return this.IlIiliiIIi;
            }
         }
      } else {
         return null;
      }
   }

   static class_243 llliiillii(liiilIiliiiilIil self, lliiilIiiliiilIi world, class_638 t) {
      if (self != null && world != null && t != null && world.liiiIIllIl() != null && self.IIlllIlliIll()) {
         iIIiIIliIlIiIIli var3 = self.IIiilIiiiIii();
         if (var3 != iIIiIIliIlIiIIli.ilililIlIi
            && var3 != iIIiIIliIlIiIIli.IiililIlIi
            && var3 != iIIiIIliIlIiIIli.liililIlIi
            && var3 != iIIiIIliIlIiIIli.iiililIlIi) {
            return null;
         } else {
            class_243 var4 = self.IIIllIIliIIl() != null ? self.IIIllIIliIIl() : self.iliIiiliiiii();
            if (var4 == null) {
               return null;
            } else if (!iliiiillIiiiiill.llIIlilIIl(
               IilIilllilIill.lIiiIiIlilli(t, class_2338.method_49637(var4.field_1352, var4.field_1351 + 0.001, var4.field_1350)), true
            )) {
               return null;
            } else {
               double var5 = world.liiiIIllIl().field_1352 - var4.field_1352;
               double var7 = world.liiiIIllIl().field_1350 - var4.field_1350;
               double var9 = Math.hypot(var5, var7);
               return var9 > 1.0E-6 && !(var9 > 6.0) ? new class_243(var5 / var9, 0.0, var7 / var9) : null;
            }
         }
      } else {
         return null;
      }
   }

   static int lliililiil(iIilIlilIlilIlil charges, int phase) {
      if (charges == null) {
         return 0;
      } else {
         return switch (charges) {
            case illilIiIil -> phase < 0 ? 3 : 2;
            case IililIiIil, lililIiIil -> phase >= 1 ? 1 : 2;
            case iililIiIil, IIiilIiIil -> 1;
            default -> 0;
         };
      }
   }

   public Iiilllliilll IiIIlliIIl() {
      return this.IIliliiIIi;
   }

   public boolean liiiIIllIl(IIllIIllIllIIl s) {
      long var5 = -6641713724223694588L;
      if (!this.iIllliiIIi.Iilllilliill() && s != null && s.IiIlliIliiIl() != null) {
         this.iiIiliiIIi = s;
         if (this.lIiiiiIiii(s) != null) {
            return false;
         } else if (this.liiIiiiiIi(s)) {
            return true;
         } else {
            this.Iiililiili(s);
            Iiilllliilll var2 = this.IIliliiIIi;
            if (var2 == null) {
               return false;
            } else {
               liiilIiliiiilIil var3 = s.IiIlliIliiIl();
               if (!lIIlliIIll(s) && s.Iilllilliill() > IIiilIiiiIii(var2.Iilllilliill(), Iliilliiilii(var3.IIiilIiiiIii(), var3.Iliilliiilii()))) {
                  this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","WjKv3dMxtq+E4PUGlhKeVvSABIpplFV6YAIWi+5V+8E=">();
                  return false;
               } else {
                  var2 = this.lliliilili(s, var2);
                  if (var2 == null) {
                     this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","gKZjGvVg3/sHA+u1RZ1Xn53REvYE3MpiyIQZZw74ITbjdUY=">();
                     return false;
                  } else {
                     var5 ^= ((long)this.ilIiiIiIii(s, var2) << 32 ^ var5) & -1L << 32;
                     if (this.lilliiilli(s) && (int)(var5 >>> 32) == 0) {
                        this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","2raSN/rXpkSwqMjYpmSiNnZoAbvOd2HGGvqhFcok3w==">();
                        return false;
                     } else {
                        this.iililiiIIi = false;
                        if (this.lIIiiiIIii(s, var2, (boolean)((int)(var5 >>> 32)))) {
                           return true;
                        } else {
                           if (var2.liiiIIllIl() != null) {
                              this.IlllliiIIi.put(var2.liiiIIllIl().method_10063(), IIIiillllIIiilll.IliIlllilIi() + 3000L);
                           }

                           this.IIliliiIIi = null;
                           this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","mdUEEPAoRuMzEycCYCaqWOHAyxu0/AkEuDD9KgPCsiT7ZXcTgggJ">();
                           return false;
                        }
                     }
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   private void lIIIiiIIIi(class_2338 reason, String blacklistNow, boolean cell) {
      this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
      if (cell && reason != null) {
         this.IlllliiIIi.put(reason.method_10063(), IIIiillllIIiilll.IliIlllilIi() + 3000L);
         this.llllliiIIi.remove(reason.method_10063());
      } else {
         this.IIIlilIIli(reason);
      }

      this.iIllliiIIi.IIIilIIiiIIi();
      this.IIliliiIIi = null;
      this.lIliliiIIi = false;
      this.iililiiIIi = false;
      this.IIiiliiIIi = false;
      this.ilIiliiIIi = Long.MIN_VALUE;
      this.llliliiIIi = blacklistNow;
   }

   private boolean lllIiillIi(class_2338 c) {
      return this.iiilliiIIi != null && c != null && c.equals(this.iiilliiIIi) && IIIiillllIIiilll.IliIlllilIi() <= this.IIIiliiIIi;
   }

   private class_2338 IilIililIi(IIllIIllIllIIl s) {
      long var19 = -3791395542420890349L;
      if (s == null) {
         return null;
      } else if (this.iillliiIIi == s.IIIllIIliIIl()) {
         this.iilIiIIiIi(this.lIilliiIIi);
         return this.IIilliiIIi;
      } else {
         this.iillliiIIi = s.IIIllIIliIIl();
         this.IIilliiIIi = null;
         this.lIilliiIIi = iiIIIIIlIIlIIIIl.lIiiIiIlIl;
         this.iIilliiIIi = 0.0;
         class_746 var2 = class_310.method_1551().field_1724;
         if (!this.illlliiIIi.isEmpty()
            && s.IiIlliIliiIl() != null
            && s.IiIlliIliiIl().lIiiIiIlilli() != null
            && var2 != null
            && class_310.method_1551().field_1687 != null) {
            long var3 = s.IIIllIIliIIl();
            this.illlliiIIi
               .entrySet()
               .removeIf(e -> lliiIliliiIl.IilliliilIIi(class_2338.method_10092(e.getKey())) < 0 || var3 - e.getValue().IliIlllilIi() > 200L);
            class_243 var5 = var2.method_33571();
            double var6 = lliiIliliiIl.liiiIIllIl();
            class_243 var8 = s.IiIlliIliiIl().lIiiIiIlilli().method_73189();
            ArrayList var9 = new ArrayList(this.illlliiIIi.size());

            for (Entry var11 : this.illlliiIIi.entrySet()) {
               class_2338 var12 = class_2338.method_10092((Long)var11.getKey());
               illiIlIiliIl var13 = (illiIlIiliIl)var11.getValue();
               if (var3 >= var13.liiiIIllIl()
                  && !this.lllIiillIi(var12)
                  && !(lllIliIlillIliIl.IIlilIliiIli(var5, lllIliIlillIliIl.lIiiIiIlilli(var12)) > var6)
                  && (this.IiIiliiIIi == null || !this.IiIiliiIIi.test(class_243.method_24953(var12)))) {
                  var9.add(var11);
               }
            }

            var9.sort(Comparator.comparingDouble(his -> class_243.method_24953(class_2338.method_10092((Long)his.getKey())).method_1025(var8)));
            var19 ^= (0L ^ var19) & -1L << 32;

            for (Entry var22 : var9) {
               class_2338 var23 = class_2338.method_10092((Long)var22.getKey());
               illiIlIiliIl var14 = (illiIlIiliIl)var22.getValue();
               if ((int)(var19 >>> 32) >= 2) {
                  break;
               }

               var19 += 4294967296L;
               if (this.lIiIiiIiIi(s, var23, var14.IliIlllilIi())) {
                  iiIIIIIlIIlIIIIl var15 = this.IillliiIIi.get(var23.method_10063());
                  float[] var16 = ilIiiIiIii.Ililllililil(var5, class_243.method_24953(var23));
                  double var17 = liiIIliliiiIIlil.Iilllilliill(this.IIllliiIIi.IliIlllilIi(), this.IIllliiIIi.liiiIIllIl(), var16[0], var16[1]);
                  if (!IIllllIlll(var17, var15.lIiiIiIlilli())
                     && IiIiiiilliIiiiil.iIlIlllllill(var23, var6, this.IIllliiIIi.IliIlllilIi(), this.IIllliiIIi.liiiIIllIl()) != null
                     && (this.IIilliiIIi == null || var15.liiiIIllIl() > this.lIilliiIIi.liiiIIllIl())) {
                     this.IIilliiIIi = var23;
                     this.lIilliiIIi = var15;
                     this.iIilliiIIi = var17;
                  }
               }
            }

            this.iilIiIIiIi(this.lIilliiIIi);
            return this.IIilliiIIi;
         } else {
            return null;
         }
      }
   }

   private boolean Illlilllli(IIllIIllIllIIl cell, class_2338 s) {
      if (cell != null && s != null && cell.IIIllIIliIIl() == this.IIllliiIIi.IIillIiliIil() && cell.Iilllilliill() > 0) {
         liiilIiliiiilIil var3 = cell.IiIlliIliiIl();
         if (var3 != null && var3.lIiiIiIlilli() != null) {
            float var4 = var3.llIIlilIIl();
            if (Float.isFinite(var4) && !(var4 >= Float.MAX_VALUE)) {
               float var5 = IiliiIililiiIi.IliIlllilIi(var3.lIiiIiIlilli(), null, s, null);
               iiIllIlIIlllIl var6 = var3.IlIillIiilIi() != null ? var3.IlIillIiilIi() : lllIliIlillIliIl.iiiIlIIIll(var3.lIiiIiIlilli());
               float var7 = iiIiiliIIliili.lIiiIiIlilli(Math.max(0.0F, var5 - var4), var6);
               return illliIilli(var7, IIililIili(var3));
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean Iiilliiliiil() {
      return this.iililiiIIi && this.iIllliiIIi.Iilllilliill();
   }

   public class_2338 IIIllIIliIIl() {
      return this.iIllliiIIi.Iilllilliill() ? this.iIllliiIIi.Ililllililil() : null;
   }

   static long llIililIil(long turnTicks, int tick, int clicks) {
      return turnTicks + (long)liilliiill(tick, clicks) + 2L;
   }

   public iIilIlilIlilIlil IlIlllIlilIl() {
      return this.iIllliiIIi.IIillIiliIil();
   }

   static boolean lIliliIlil(int readyIn, int clicks) {
      return IIIillIIil(readyIn, clicks, 0, false);
   }

   public boolean iliIiiliiiii() {
      return this.iIllliiIIi.Iilllilliill()
         && (
            this.iIllliiIIi.IIillIiliIil() == iIilIlilIlilIlil.illilIiIil
               || this.iIllliiIIi.IIillIiliIil() == iIilIlilIlilIlil.IililIiIil
               || this.iIllliiIIi.IIillIiliIil() == iIilIlilIlilIlil.lililIiIil
         );
   }

   private boolean Iliiilliii(class_746 p, class_638 w) {
      long var12 = 5144014644424312067L;
      long var14 = -1184971031549627141L;
      class_243 var3 = p.method_33571();
      double var4 = lliiIliliiIl.liiiIIllIl();
      var12 ^= ((long)((int)Math.ceil(var4)) << 32 ^ var12) & -1L << 32;
      class_2338 var7 = class_2338.method_49638(var3);
      class_2339 var8 = new class_2339();

      for (long var17 = var12 ^ ((long)(-((int)(var12 >>> 32))) ^ var12) & -1L >>> 32;
         (int)var17 <= (int)(var17 >>> 32);
         var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32
      ) {
         var14 ^= ((long)(-((int)(var17 >>> 32))) << 32 ^ var14) & -1L << 32;

         while ((int)(var14 >>> 32) <= (int)(var17 >>> 32)) {
            for (var14 ^= ((long)(-((int)(var17 >>> 32))) ^ var14) & -1L >>> 32;
               (int)var14 <= (int)(var17 >>> 32);
               var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32
            ) {
               var8.method_10103(var7.method_10263() + (int)var17, var7.method_10264() + (int)(var14 >>> 32), var7.method_10260() + (int)var14);
               if (w.method_8320(var8).method_27852(class_2246.field_23152)
                  && lliiIliliiIl.IilliliilIIi(var8) > 0
                  && !(class_243.method_24953(var8).method_1022(var3) > var4 + 0.5)
                  && (!this.iliiiIiiii(var8) || this.iIlllIllll(var8))) {
                  return true;
               }
            }

            var14 += 4294967296L;
         }
      }

      return false;
   }

   public static boolean iiiIlIIIll(String why) {
      return lliIIliliIIl<"lliIIliliIIl","1C9UaU0nlopEu1BBOHrFysZHflLDJGnCP9DGsKFeZy1b9YQ=">().equals(why)
         || lliIIliliIIl<"lliIIliliIIl","di8cPsLrkXo/9uc08viguarQppUSnfP8BAaUAmEw6I4WCAR7">().equals(why)
         || lliIIliliIIl<"lliIIliliIIl","EB/uBRETqXjmb8PMhVuLoLn5+jfI3BTKPOq/u/CfHKYbFQ==">().equals(why)
         || lliIIliliIIl<"lliIIliliIIl","bqm/w4xDKL6T8fSAxUbXM7gBFLHmRgLV3/Mvug2LMDMp">().equals(why)
         || lliIIliliIIl<"lliIIliliIIl","zAa1zoz3inGtoRSR+01F2owlHkmvOH8CWUILjQuqFvk=">().equals(why);
   }

   public void iiIIlIIlIl() {
      this.iIllliiIIi.IIIilIIiiIIi();
      this.IlllliiIIi.clear();
      this.llllliiIIi.clear();
      this.illlliiIIi.clear();
      this.IillliiIIi.clear();
      this.lillliiIIi = Long.MIN_VALUE;
      this.iillliiIIi = Long.MIN_VALUE;
      this.IIilliiIIi = null;
      this.lIilliiIIi = iiIIIIIlIIlIIIIl.lIiiIiIlIl;
      this.iIilliiIIi = 0.0;
      this.iiilliiIIi = null;
      this.IIIiliiIIi = Long.MIN_VALUE;
      this.lIIiliiIIi = Long.MIN_VALUE;
      this.iIIiliiIIi = null;
      this.IlIiliiIIi = null;
      this.llIiliiIIi = Long.MIN_VALUE;
      this.ilIiliiIIi = Long.MIN_VALUE;
      this.IIliliiIIi = null;
      this.lIliliiIIi = false;
      this.iIliliiIIi = Long.MIN_VALUE;
      this.IlliliiIIi = -1;
      this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","V54P2IcqtjSOMC8GUsKdxg0x6VyM9HQ0/rwwHY1ujng=">();
      this.illiliiIIi = Long.MIN_VALUE;
      this.IililiiIIi = null;
      this.lililiiIIi = Long.MIN_VALUE;
      this.iililiiIIi = false;
      this.IIiiliiIIi = false;
      this.lIiiliiIIi = -1;
      this.IiIiliiIIi = null;
      this.liIiliiIIi = null;
      this.iiIiliiIIi = null;
   }

   public boolean lIiiIiIlilli() {
      return this.iIllliiIIi.Iilllilliill();
   }

   static boolean lIlIliIlIl(boolean planTargetId, int planTick, int targetId, long tick, long planned) {
      return !planTargetId || planTick != targetId || planned < tick || planned - tick >= 4L;
   }

   private static boolean liiiiiiiii(liiilIiliiiilIil p, Iiilllliilll t) {
      return p != null && t != null && t.iliIiiliiiii() >= p.IliIlllilIi();
   }

   private boolean iliiiIiiii(class_2338 cell) {
      if (cell == null) {
         return false;
      } else {
         if (this.iiilliiIIi != null && IIIiillllIIiilll.IliIlllilIi() > this.IIIiliiIIi) {
            this.iiilliiIIi = null;
         }

         if (this.iiilliiIIi != null && cell.equals(this.iiilliiIIi)) {
            return true;
         } else {
            Long var2 = this.IlllliiIIi.get(cell.method_10063());
            if (var2 == null) {
               return false;
            } else if (IIIiillllIIiilll.IliIlllilIi() >= var2) {
               this.IlllliiIIi.remove(cell.method_10063());
               return false;
            } else {
               return true;
            }
         }
      }
   }

   public iiiiliIiIIIIiiIi(lilllllliillllll slots, lIlIiIIliIlIiIIl host) {
      this.IillliiIIi = new HashMap<>();
      this.lillliiIIi = Long.MIN_VALUE;
      this.iillliiIIi = Long.MIN_VALUE;
      this.lIilliiIIi = iiIIIIIlIIlIIIIl.lIiiIiIlIl;
      this.IIIiliiIIi = Long.MIN_VALUE;
      this.lIIiliiIIi = Long.MIN_VALUE;
      this.llIiliiIIi = Long.MIN_VALUE;
      this.ilIiliiIIi = Long.MIN_VALUE;
      this.iIliliiIIi = Long.MIN_VALUE;
      this.IlliliiIIi = -1;
      this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","V54P2IcqtjSOMC8GUsKdxg0x6VyM9HQ0/rwwHY1ujng=">();
      this.illiliiIIi = Long.MIN_VALUE;
      this.lililiiIIi = Long.MIN_VALUE;
      this.lIiiliiIIi = -1;
      this.IIllliiIIi = slots;
      this.lIllliiIIi = host;
      this.iIllliiIIi = new liIlIllliiIlIlll(slots);
   }

   static boolean ilIllIiIll(
      float totem,
      float real,
      float pops,
      boolean now,
      int cost,
      boolean open,
      boolean full,
      boolean kills,
      boolean behind,
      boolean trading,
      boolean totems,
      boolean hp,
      boolean his,
      float maxSelf
   ) {
      long var16 = -8695975558426093837L;
      var16 ^= ((long)(totem >= pops - 1.0F ? 1 : 0) << 32 ^ var16) & -1L << 32;
      if ((int)(var16 >>> 32) != 0) {
         if (!now) {
            return false;
         } else if (full) {
            return true;
         } else {
            return cost <= 1 ? false : open || behind && trading && totems;
         }
      } else {
         var16 ^= ((long)(open && full ? 1 : 0) ^ var16) & -1L >>> 32;
         if (!his && real > maxSelf && (int)var16 == 0) {
            return false;
         } else if (!now && totem > pops - (his ? 2.0F : 4.0F) && (int)var16 == 0) {
            return false;
         } else {
            return !open && !behind && !(real <= 0.1F) ? totems && hp : true;
         }
      }
   }

   static int Iilililiiili(int prepTicks) {
      return Math.max(0, prepTicks - 1);
   }

   private Iiilllliilll lliliilili(IIllIIllIllIIl p, Iiilllliilll s) {
      if (!iIiliIlili(this.iIliliiIIi, p.IIIllIIliIIl())) {
         return s;
      } else {
         this.lIliliiIIi = false;
         this.Iiililiili(p);
         return this.IIliliiIIi;
      }
   }

   private boolean iiIliIIlli(IIllIIllIllIIl p, Iiilllliilll s) {
      liiilIiliiiilIil var3 = p.IiIlliIliiIl();
      if (var3 != null && var3.lIiiIiIlilli() != null && s.liiiIIllIl() != null) {
         float var4 = Math.min(s.iliIiiliiiii(), this.iIIliIlIli(var3, s.liiiIIllIl(), Iiiilliiil(s.Iilllilliill(), p.Iilllilliill())));
         ilIiliilIiIiliil var5 = p.IliIlllilIi();
         if (var5.iIIIlIlIIl()) {
            return lIlliiIlli(var5, var4, s.IlIillIiilIi(), IIililIili(var3));
         } else {
            float var6 = this.liIiliiIIi == null ? 3.0F : this.liIiliiIIi.IIIllIIliIIl();
            return lliIliliIl(var4, IIililIili(var3), var6, false);
         }
      } else {
         return false;
      }
   }

   static int liilliiill(int turnTicks, int clicks) {
      return Math.max(0, clicks) + Math.max(0, turnTicks - 1) * 2;
   }

   private Iiilllliilll iliIiIiiIi(class_2338 cell, float hp) {
      long var5 = 4032967132173464190L;
      var5 ^= ((long)lliiIliliiIl.IilliliilIIi(cell) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)((int)(var5 >>> 32) >= 1 ? 1 : 2) ^ var5) & -1L >>> 32;
      return new Iiilllliilll(
         cell,
         null,
         false,
         (int)(var5 >>> 32),
         this.IlilliiIIi,
         this.llilliiIIi,
         this.ililliiIIi,
         this.ililliiIIi >= hp - 1.0F,
         this.liilliiIIi,
         (int)var5,
         iliIiillIiiIiill.IilliliilIIi((int)var5),
         (double)this.IlilliiIIi
      );
   }

   public boolean IlIillIiilIi(class_2338 cell) {
      class_2338 var2 = this.IIIilIIiiIIi();
      return var2 != null && cell != null && !var2.equals(cell) && IIIIllIIIl(this.iIllliiIIi.IIillIiliIil(), lliiIliliiIl.IilliliilIIi(var2));
   }

   static boolean IIllllIlll(double pops, boolean turn) {
      return !turn && !(pops <= 60.0);
   }

   static boolean iIIilIlIil(boolean onGround, double vy) {
      return onGround || Double.isFinite(vy) && vy <= 0.0;
   }

   public int Illillliilli() {
      return this.lIiiliiIIi;
   }

   private class_243 ilillIiill(Iiilllliilll p) {
      long var22 = -8854606235499004676L;
      class_746 var2 = class_310.method_1551().field_1724;
      if (var2 != null && class_310.method_1551().field_1687 != null) {
         class_2338 var3 = p.liiiIIllIl();
         float var4 = this.IIllliiIIi.IliIlllilIi();
         float var5 = this.IIllliiIIi.liiiIIllIl();
         double var6 = this.IIllliiIIi.Iilllilliill();
         if (p.IilliliilIIi() && lliiIliliiIl.IilliliilIIi(var3) < 0) {
            class_243 var24 = var2.method_33571();
            class_3965 var9 = null;
            double var10 = Double.MAX_VALUE;
            class_2350[] var12 = iiIlliiIIi;
            var22 ^= ((long)var12.length << 32 ^ var22) & -1L << 32;

            for (long var27 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var27 < (int)(var27 >>> 32); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
               class_2350 var15 = var12[(int)var27];
               class_2338 var16 = var3.method_10093(var15);
               if (!lliiIliliiIl.lIiiIiIlilli(var16)) {
                  class_2350 var17 = var15.method_10153();
                  if (lllIliIlillIliIl.Iilllilliill(var16, var17)) {
                     class_3965 var18 = IiIiiiilliIiiiil.liiiIIllIl(var16, new class_2350[]{var17}, var17, var6, var4, var5);
                     if (var18 != null) {
                        float[] var19 = ilIiiIiIii.Ililllililil(var24, var18.method_17784());
                        double var20 = liiIIliliiiIIlil.Iilllilliill(var4, var5, var19[0], var19[1]);
                        if (var20 < var10) {
                           var10 = var20;
                           var9 = var18;
                        }
                     }
                  }
               }
            }

            if (var9 == null) {
               return null;
            } else {
               class_3965 var25 = IiIiiiilliIiiiil.IilliliilIIi(
                  var9, new class_2350[]{var9.method_17780()}, var9.method_17780(), var6, var4, var5, var3, lIlllIIliIlllIIl.liiiIIllIl()
               );
               return var25 == null ? null : var25.method_17784();
            }
         } else {
            class_3965 var8 = IiIiiiilliIiiiil.IilliliilIIi(
               IiIiiiilliIiiiil.iIlIlllllill(var3, var6, var4, var5), iiIlliiIIi, null, var6, var4, var5, var3, lIlllIIliIlllIIl.liiiIIllIl()
            );
            return var8 == null ? null : var8.method_17784();
         }
      } else {
         return null;
      }
   }

   static boolean illilIilil(double reach, double distanceToCell) {
      return reach > distanceToCell + 0.5;
   }

   private void IlIIillIIi(class_2338 reason, String cell) {
      this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
      this.iIllliiIIi.IIIilIIiiIIi();
      this.IIliliiIIi = null;
      this.lIliliiIIi = false;
      this.iililiiIIi = false;
      this.IIiiliiIIi = false;
      this.ilIiliiIIi = Long.MIN_VALUE;
      this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","sZ4/TekUH+UOuo8Nj/1D4qyFtGq7zrsWouqJZcnUwt7m">() + cell;
   }

   public boolean IiIlliIliiIl() {
      return illIlIilIl(this.iIllliiIIi.IIillIiliIil());
   }

   public IilliIIllilliIIl IliIlllilIi(IIllIIllIllIIl veto, IiiIliliiIli previous, Predicate<class_243> s) {
      long var12 = -1692222298392797661L;
      long var14 = 3953174775278744723L;
      this.IiIiliiIIi = s;
      this.liIiliiIIi = previous;
      this.iiIiliiIIi = veto;
      String var4 = this.lIiiiiIiii(veto);
      if (var4 != null) {
         this.llliliiIIi = var4;
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IiiiliIiil, var4);
      } else if (this.iIllliiIIi.Iilllilliill() && this.iiiilIIIIi(veto)) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IiiiliIiil, this.llliliiIIi);
      } else {
         if (this.iIllliiIIi.Iilllilliill()
            && !this.IIiiliiIIi
            && IIIIllIIIl(this.iIllliiIIi.IIillIiliIil(), lliiIliliiIl.IilliliilIIi(this.iIllliiIIi.Ililllililil()))) {
            class_2338 var5 = this.IilIililIi(veto);
            if (var5 != null && !var5.equals(this.iIllliiIIi.Ililllililil())) {
               this.iIllliiIIi.IIIilIIiiIIi();
               this.IIliliiIIi = null;
               this.lIliliiIIi = false;
               this.iililiiIIi = false;
            }
         }

         if (this.iIllliiIIi.Iilllilliill()) {
            Iiilllliilll var17 = this.IIliliiIIi;
            double var18 = var17 == null ? 0.0 : var17.IIillIiliIil();
            class_2338 var8 = this.iIllliiIIi.Ililllililil();
            var12 ^= ((long)(var8 == null ? -1 : lliiIliliiIl.IilliliilIIi(var8)) << 32 ^ var12) & -1L << 32;
            var12 ^= (
                  (long)(
                        !this.IIiiliiIIi && IIIIllIIIl(this.iIllliiIIi.IIillIiliIil(), (int)(var12 >>> 32)) && this.iIllliiIIi.IIlllIlliIll()
                           ? 10
                           : Math.min(this.iIllliiIIi.IIIllIIliIIl(), 9)
                     )
                     ^ var12
               )
               & -1L >>> 32;
            return new IilliIIllilliIIl(
               iIlIIIIiIllIIIIi.IiiiliIiil,
               true,
               var18,
               (int)var12,
               var17 != null && liiiiiiiii(veto.IiIlliIliiIl(), var17),
               var17 != null && var17.IIlllIlliIll(),
               iIIIlIlIIl(this.IIiiliiIIi, this.iIllliiIIi.IIillIiliIil(), (int)(var12 >>> 32))
            );
         } else {
            class_2338 var16 = this.IilIililIi(veto);
            if (var16 != null) {
               this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","zAa1zoz3inGtoRSR+01F2owlHkmvOH8CWUILjQuqFvk=">();
               return new IilliIIllilliIIl(
                  iIlIIIIiIllIIIIi.IiiiliIiil,
                  true,
                  (double)Math.max(this.IlilliiIIi, 0.25F),
                  iliiiillIiiiiill.iIlIiIllIi(this.iIilliiIIi),
                  this.IiilliiIIi,
                  this.liilliiIIi,
                  lliIIliliIIl<"lliIIliliIIl","zAa1zoz3inGtoRSR+01F2owlHkmvOH8CWUILjQuqFvk=">()
               );
            } else {
               liiilIiliiiilIil var6 = veto.IiIlliIliiIl();
               this.Iiililiili(veto);
               Iiilllliilll var7 = this.IIliliiIIi;
               if (var7 == null) {
                  this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","gKZjGvVg3/sHA+u1RZ1Xn53REvYE3MpiyIQZZw74ITbjdUY=">();
                  return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IiiiliIiil, this.llliliiIIi);
               } else {
                  var14 ^= ((long)this.lilliiilli(veto) << 32 ^ var14) & -1L << 32;
                  if ((int)(var14 >>> 32) != 0 && !this.ilIiiIiIii(veto, var7)) {
                     this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","2raSN/rXpkSwqMjYpmSiNnZoAbvOd2HGGvqhFcok3w==">();
                     return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IiiiliIiil, this.llliliiIIi);
                  } else {
                     var12 ^= ((long)(lIIlliIIll(veto) ? 0 : Math.max(0, veto.Iilllilliill() - var7.Iilllilliill())) << 32 ^ var12) & -1L << 32;
                     double var10 = veto.IliIlllilIi().Iliilliiilii(var7.IIillIiliIil() * (double)iiIiiliIIliili.IIlllIlliIll((int)(var12 >>> 32)));
                     this.llliliiIIi = (int)(var14 >>> 32) != 0
                        ? lliIIliliIIl<"lliIIliliIIl","1C9UaU0nlopEu1BBOHrFysZHflLDJGnCP9DGsKFeZy1b9YQ=">()
                        : lliIIliliIIl<"lliIIliliIIl","ZROQT8CM895R5YLo/os0BdwwnE2zWk2ZWKkkfzKL">();
                     if ((int)(var14 >>> 32) == 0 && var7.IIIilIIiiIIi() > 0) {
                        this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","7shx015Of35Otts8zqU1i8b9S1W8kPv9VdkWBIo+0Q==">();
                     }

                     return new IilliIIllilliIIl(
                        iIlIIIIiIllIIIIi.IiiiliIiil, true, var10, var7.Iilllilliill(), liiiiiiiii(var6, var7), var7.IIlllIlliIll(), this.llliliiIIi
                     );
                  }
               }
            }
         }
      }
   }

   private boolean IlIiillIii(IIllIIllIllIIl s) {
      liiilIiliiiilIil var2 = s.IiIlliIliiIl();
      return var2 != null && s.Iilllilliill() <= 5 && iIIilIlIil(var2.IIlllIlliIll(), var2.IlIlllIlilIl() == null ? 0.0 : var2.IlIlllIlilIl().field_1351);
   }

   static IlIIIlilllIIIlil IlIllllIll(IIllIIllIllIIl s) {
      return s != null && s.Iiilliiliiil() != null && s.Iiilliiliiil().IliIlllilIi() != null ? s.Iiilliiliiil().IliIlllilIi() : IlIIIlilllIIIlil.iliIiilIil;
   }

   private static boolean Iiiiliiiiiii(iIIiIIliIlIiIIli h) {
      return h == iIIiIIliIlIiIIli.iiililIlIi || h == iIIiIIliIlIiIIli.liililIlIi;
   }

   static boolean Ilillllill(IIllIIllIllIIl d, IiiIliliiIli s, iiliiiIiIIiiiiIi advice) {
      if (s.IilliliilIIi() == iIlIIIIiIllIIIIi.IiiiliIiil) {
         return true;
      } else if (advice != null) {
         return advice.IIIllIIliIIl() == iIlIIIIiIllIIIIi.IiiiliIiil && advice.Illlllllilll() == null;
      } else if (s.IilliliilIIi() != iIlIIIIiIllIIIIi.lliiliIiil) {
         return false;
      } else {
         IilliIIllilliIIl var3 = d.IilliliilIIi(iIlIIIIiIllIIIIi.IiiiliIiil);
         if (var3.iIlIlllllill() && Double.isFinite(var3.IilliliilIIi())) {
            IilliIIllilliIIl var4 = d.IilliliilIIi(iIlIIIIiIllIIIIi.iliiliIiil);
            IilliIIllilliIIl var5 = d.IilliliilIIi(iIlIIIIiIllIIIIi.liiiliIiil);
            return (!var4.iIlIlllllill() || var3.IilliliilIIi() >= var4.IilliliilIIi()) && (!var5.iIlIlllllill() || var3.IilliliilIIi() >= var5.IilliliilIIi());
         } else {
            return false;
         }
      }
   }

   private boolean lIiIiiIiIi(IIllIIllIllIIl since, class_2338 cell, long s) {
      if (since != null && cell != null) {
         if (this.lillliiIIi != since.IIIllIIliIIl()) {
            this.IillliiIIi.clear();
            this.lillliiIIi = since.IIIllIIliIIl();
         }

         iiIIIIIlIIlIIIIl var5 = this.IillliiIIi.get(cell.method_10063());
         if (var5 == null) {
            var5 = this.IliIilliIi(since, cell, s);
            this.IillliiIIi.put(cell.method_10063(), var5);
         }

         this.iilIiIIiIi(var5);
         return var5.IliIlllilIi();
      } else {
         return false;
      }
   }

   static boolean IiIilliIil(long until, long tick) {
      return until != Long.MIN_VALUE && tick <= until;
   }

   public boolean IIillIiliIil() {
      return this.lililiiIIi == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   static boolean iIiilIliil(String why) {
      return lliIIliliIIl<"lliIIliliIIl","DnEWKgg00JzujJgin/2zkJWAKur3RpMTWsIRzU7B74yBH94nnQ==">().equals(why)
         || lliIIliliIIl<"lliIIliliIIl","WHtv0PUnO3ysWsku5AaeCx8Rj8OYC6KBULo3Cwer0A7e1IVsSEn1">().equals(why)
         || lliIIliliIIl<"lliIIliliIIl","dkmejihalzZjno5KvNJJ29rMHmCrw1z9vrEGVOuzkfJ/cicGisc=">().equals(why);
   }

   private int liIiiiiIii(IIllIIllIllIIl s, Iiilllliilll p) {
      long var5 = 3801053935083200292L;
      var5 ^= ((long)(s.IlIlllIlilIl() != null && s.IlIlllIlilIl().Iilllilliill() ? 1 : 0) << 32 ^ var5) & -1L << 32;
      if (p.IiIlliIliiIl() && (int)(var5 >>> 32) == 0) {
         var5 ^= ((long)this.lIllliiIIi.IilliliilIIi(st -> st.method_31574(class_1802.field_8288), true) ^ var5) & -1L >>> 32;
         return (int)var5 >= 0 && !IIIIilIilIIIilIi.iiiIlIIIll((int)var5) ? (int)var5 : -1;
      } else {
         var5 ^= ((long)this.lIllliiIIi.IilliliilIIi(lIlllIliIlllIl::iIlIlllllill, false) ^ var5) & -1L >>> 32;
         return (int)var5 >= 0 ? (int)var5 : this.lIllliiIIi.IilliliilIIi(lliiIliliiIl::IlIillIiilIi, false);
      }
   }

   private void Iiililiili(IIllIIllIllIIl s) {
      long var6 = 59894006533749650L;
      long var2 = s.IIIllIIliIIl();
      var6 ^= ((long)s.IiIlliIliiIl().iIlIlllllill() << 32 ^ var6) & -1L << 32;
      if (lIlIliIlIl(this.lIliliiIIi, this.IlliliiIIi, (int)(var6 >>> 32), this.iIliliiIIi, var2)) {
         Iiilllliilll var5 = this.IIliilIlii(s, null, true);
         this.IIliliiIIi = var5 != null && this.iiIliIIlli(s, var5) ? var5 : null;
         this.lIliliiIIi = true;
         this.iIliliiIIi = var2;
         this.IlliliiIIi = (int)(var6 >>> 32);
      }
   }

   private Iiilllliilll iIliiIllii(IIllIIllIllIIl forcedCell, class_2338 allowCover, boolean override, iIIlIIiIlIlIIi s) {
      long var26 = -2319271631086978100L;
      long var28 = 5804088462983638233L;
      long var30 = -3716491443484684337L;
      class_310 var5 = class_310.method_1551();
      class_746 var6 = var5.field_1724;
      class_638 var7 = var5.field_1687;
      liiilIiliiiilIil var8 = forcedCell.IiIlliIliiIl();
      lliiilIiiliiilIi var9 = forcedCell.IlIlllIlilIl();
      if (var6 != null && var7 != null && var8 != null && var8.lIiiIiIlilli() != null && var9 != null) {
         var26 ^= ((long)Math.max(2, Math.min(8, forcedCell.Iilllilliill())) << 32 ^ var26) & -1L << 32;
         iIIlIIiIlIlIIi var11 = s != null ? s : lllIliIlillIliIl.iIIilIlIil(var8.lIiiIiIlilli(), (int)(var26 >>> 32), false, true);
         iIIlIIiIlIlIIi var12 = var9.liiiIIllIl() != null && var9.IilliliilIIi() != null ? new iIIlIIiIlIlIIi(var9.liiiIIllIl(), var9.IilliliilIIi()) : null;
         class_243 var13 = llliiillii(var8, var9, var7);
         IiiIliliiIli var14 = this.liIiliiIIi;
         lIiillIiiIiillIi var15 = lIiillIiiIiillIi.IliIlllilIi();
         float var16;
         if (var14 != null) {
            float var18 = var14.iIlIlllllill() == null ? var15.Iliilliiilii() : var14.iIlIlllllill().liiiIIllIl();
            var15 = var15.lIiiIiIlilli(var14.IIIllIIliIIl()).iliIiiliiiii(var14.IlIlllIlilIl()).IIIllIIliIIl(var18);
            var16 = var14.IiIlliIliiIl();
            var26 ^= ((long)var14.IIlllIlliIll() ^ var26) & -1L >>> 32;
         } else {
            var16 = illIIIIlIilIIIIl.liiiIIllIl(
               var9.IIIllIIliIIl(), var9.IlIlllIlilIl(), var9.Iilllilliill(), forcedCell.IIlilIliiIli(), 11.0F, forcedCell.IliIlllilIi()
            );
            var26 ^= (0L ^ var26) & -1L >>> 32;
         }

         if (Iiliililii(forcedCell)) {
            var15 = var15.Iilllilliill(forcedCell.iIIIlIlIIl(), false);
         }

         ilIiliilIiIiliil var32 = forcedCell.IliIlllilIi();
         if (var32.iIIIlIlIIl()) {
            var15 = var15.IIlllIlliIll(var32).iliIiiliiiii(var32.IIlilIliiIli(var15.IiIIlliIIl()));
         }

         float var19 = var8.Illillliilli() > 0.0F && Float.isFinite(var8.Illillliilli()) ? var8.Illillliilli() : 1.0F;
         var28 ^= ((long)this.lIllliiIIi.IilliliilIIi(st -> st.method_31574(class_1802.field_23141), false) << 32 ^ var28) & -1L << 32;
         var28 ^= ((long)this.lIllliiIIi.IilliliilIIi(st -> st.method_31574(class_1802.field_8801), false) ^ var28) & -1L >>> 32;
         var30 ^= ((long)((int)var28 < 0 ? 0 : IIIIIllIIIIl(var6)) << 32 ^ var30) & -1L << 32;
         Predicate var23 = this.iiliiIIiii(this.IiIiliiIIi, (int)(var28 >>> 32) < 0 ? var7 : null);
         iliiIiiIiiiIii var24 = new iliiIiiIiiiIii(
            var8.lIiiIiIlilli(),
            var11,
            var12,
            this.IIllliiIIi.IliIlllilIi(),
            this.IIllliiIIi.liiiIIllIl(),
            var16,
            (boolean)((int)var26),
            new IilIlIIllilIlIIl(forcedCell.Iilllilliill(), var8.llIIlilIIl()),
            new IilIlIIllilIlIIl(forcedCell.IIillIiliIil(), var9.iIIIlIlIIl()),
            var8.IliIlllilIi() / var19,
            var8.Iilililiiili(),
            override,
            (int)(var30 >>> 32),
            var15,
            var23,
            allowCover,
            var13
         );
         Iiilllliilll var25 = iliIiillIiiIiill.IIIIllIIIl(var24);
         if (var25 == null || var25.liiiIIllIl() == null) {
            return null;
         } else if (allowCover == null && this.iliiiIiiii(var25.liiiIIllIl())) {
            return null;
         } else {
            return !IllIllllIl(var25.IilliliilIIi(), var25.lIiiIiIlilli(), (int)(var28 >>> 32), (int)var28, this.liIiiiiIii(forcedCell, var25)) ? null : var25;
         }
      } else {
         return null;
      }
   }

   private void IIIlilIIli(class_2338 cell) {
      long var8 = -353374226470122770L;
      if (cell != null) {
         long var2 = IIIiillllIIiilll.IliIlllilIi();
         long var4 = cell.method_10063();
         iilIiiiIIiIiii var6 = this.llllliiIIi.get(var4);
         var8 ^= ((long)(var6 != null && var2 < var6.liiiIIllIl() ? var6.IliIlllilIi() + 1 : 1) << 32 ^ var8) & -1L << 32;
         if (lililiilil((int)(var8 >>> 32))) {
            this.llllliiIIi.remove(var4);
            this.IlllliiIIi.put(var4, var2 + 3000L);
         } else {
            this.llllliiIIi.put(var4, new iilIiiiIIiIiii((int)(var8 >>> 32), var2 + 3000L));
         }
      }
   }

   public static boolean lIIlliIIll(IIllIIllIllIIl s) {
      return s != null && (s.IliIlllilIi().iIIIlIlIIl() || IlIllllIll(s) == IlIIIlilllIIIlil.iliIiilIil);
   }

   public boolean Iilllilliill() {
      return this.illiliiIIi == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   private static int IIIIIllIIIIl(class_746 p) {
      long var6 = -3175326668900587013L;
      int[] var1 = new int[9];
      boolean[] var2 = new boolean[9];
      boolean[] var3 = new boolean[9];

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < 9; var8 += 4294967296L) {
         class_1799 var5 = p.method_31548().method_5438((int)(var8 >>> 32));
         var1[(int)(var8 >>> 32)] = var5.method_31574(class_1802.field_8801) ? var5.method_7947() : 0;
         var2[(int)(var8 >>> 32)] = IIIIilIilIIIilIi.ilIllIiIll((int)(var8 >>> 32));
         var3[(int)(var8 >>> 32)] = IIIIilIilIIIilIi.iiiIlIIIll((int)(var8 >>> 32));
      }

      return lilIliilIl(var1, IIIIilIilIIIilIi.IlIllllIll(), var2, var3);
   }

   private boolean llIliilIli(IIllIIllIllIIl s, liiilIiliiiilIil t, class_2338 horizon, int cell) {
      long var13 = -4982011965610854993L;
      class_1309 var5 = t.lIiiIiIlilli();
      float var6 = Math.max(
         IiliiIililiiIi.IliIlllilIi(var5, null, horizon, null),
         IiliiIililiiIi.IliIlllilIi(var5, lllIliIlillIliIl.iIIilIlIil(var5, cell, false, true), horizon, null)
      );
      iiIllIlIIlllIl var7 = t.IlIillIiilIi() != null ? t.IlIillIiilIi() : lllIliIlillIliIl.iiiIlIIIll(var5);
      float var8 = iiIiiliIIliili.iliIiiliiiii(var6, var7, new IilIlIIllilIlIIl(s.Iilllilliill(), t.llIIlilIIl()), cell);
      float var9 = iiIiiliIIliili.iIlIlllllill(var6, var7, 5.0F);
      float var10 = IIililIili(t);
      if (s.IliIlllilIi().iiIIlIIlIl()) {
         var13 ^= ((long)Math.max(1, lliililiil(this.iIllliiIIi.IIillIiliIil(), lliiIliliiIl.IilliliilIIi(horizon))) << 32 ^ var13) & -1L << 32;
         float var12 = iiIiiliIIliili.iliIiiliiiii(var6, var7, new IilIlIIllilIlIIl(s.Iilllilliill(), t.llIIlilIIl()), (int)(var13 >>> 32));
         this.IIllliiIIi.Iliilliiilii(var12, var9, Float.isFinite(var10) && var10 > 0.0F && var12 >= var10, var10, IiIliliIli(s, horizon, (int)(var13 >>> 32)));
      } else {
         this.IIllliiIIi.IIiilIiiiIii(var8, var9, Float.isFinite(var10) && var10 > 0.0F && var8 >= var10, var10);
      }

      return lIlliiIlli(s.IliIlllilIi(), var8, var9, var10);
   }

   public class_2338 Ililllililil() {
      return this.Iilllilliill() ? this.IililiiIIi : null;
   }

   public String Illlllllilll() {
      return this.llliliiIIi;
   }

   private String lIiiiiIiii(IIllIIllIllIIl s) {
      long var7 = 995063562145912626L;
      if (s == null || s.IiIlliIliiIl() == null || s.IiIlliIliiIl().lIiiIiIlilli() == null) {
         return lliIIliliIIl<"lliIIliliIIl","n5bDoqL82jTS0dWElvAG9uQXaRm5Tz/KA9+9jSWkLgdZIFuIZA==">();
      } else if (s.Iiilliiliiil() != null && !s.Iiilliiliiil().iliIiiliiiii()) {
         return lliIIliliIIl<"lliIIliliIIl","p5mielctQa4DapYaenpFBqfQDUIHrlTrKs//xHDA8g==">();
      } else if (!lliiIliliiIl.iIlIlllllill()) {
         return lliIIliliIIl<"lliIIliliIIl","ngZzqkROj/9CwlWS29hYNDgnsVOfugEJ18MEXHk7xkO6Ug==">();
      } else if (this.iIllliiIIi.Iilllilliill()) {
         return null;
      } else {
         class_310 var2 = class_310.method_1551();
         class_746 var3 = var2.field_1724;
         class_638 var4 = var2.field_1687;
         if (var3 != null && var4 != null) {
            if (var3.method_6079().method_31574(class_1802.field_8801)) {
               return lliIIliliIIl<"lliIIliliIIl","4i8fvN72edGiIHjaaEzM/63saKdyUkTb7w3cGIOkk8utrynS4izcqgxtiHh2BYMp">();
            } else if (!var3.method_5715() && !this.IIllliiIIi.IiIlliIliiIl()) {
               var7 ^= ((long)(this.lIllliiIIi.IilliliilIIi(st -> st.method_31574(class_1802.field_23141), false) >= 0 ? 1 : 0) << 32 ^ var7) & -1L << 32;
               var7 ^= ((long)(this.lIllliiIIi.IilliliilIIi(st -> st.method_31574(class_1802.field_8801), false) >= 0 ? 1 : 0) ^ var7) & -1L >>> 32;
               if ((int)(var7 >>> 32) != 0 && (int)var7 != 0) {
                  return null;
               } else if (!this.Iliiilliii(var3, var4)) {
                  return (int)(var7 >>> 32) != 0
                     ? lliIIliliIIl<"lliIIliliIIl","nNaLV10rhfO8zUuW7RhczMoXQUbcOZQc+lbjp4BGeBBnlHM7rDHzqg==">()
                     : lliIIliliIIl<"lliIIliliIIl","j0/gjoFR6e6SWgSOSmp3npcg0HZN0vkRl00MYMbtFDLuqv+QgKs=">();
               } else {
                  return null;
               }
            } else {
               return lliIIliliIIl<"lliIIliliIIl","XbPZN9wB+4lxEkqQwO29pJ1EsLbPtRqYsgmoLf9R6fiaZulK">();
            }
         } else {
            return lliIIliliIIl<"lliIIliliIIl","vWk/F86O+Q5uN00hpS4THmJ2c79Q8oDstMsubv0DNUylJdWy">();
         }
      }
   }

   public List<class_2338> Iillllilll(class_243 eye, List<liiilIiliiiilIil> foes) {
      long var15 = -7584105976084422310L;
      var15 ^= ((long)this.lllIiillIi(this.iiilliiIIi) << 32 ^ var15) & -1L << 32;
      if (eye != null && (!this.illlliiIIi.isEmpty() || (int)(var15 >>> 32) != 0)) {
         IIllIIllIllIIl var4 = this.iiIiliiIIi;
         class_1309 var5 = var4 != null && var4.IiIlliIliiIl() != null ? var4.IiIlliIliiIl().lIiiIiIlilli() : null;
         class_243 var6 = var5 == null ? null : var5.method_33571();
         double var7 = lliiIliliiIl.liiiIIllIl() + 0.5;
         ArrayList var9 = new ArrayList();

         for (long var11 : this.illlliiIIi.keySet()) {
            class_2338 var13 = class_2338.method_10092(var11);
            if (lliiIliliiIl.IilliliilIIi(var13) >= 0) {
               class_238 var14 = lllIliIlillIliIl.lIiiIiIlilli(var13);
               if (!(lllIliIlillIliIl.IIlilIliiIli(eye, var14) > var7) && !iilllIIill(var14, var6, foes)) {
                  var9.add(var13);
               }
            }
         }

         if ((int)(var15 >>> 32) != 0 && !var9.contains(this.iiilliiIIi)) {
            var9.add(this.iiilliiIIi);
         }

         return var9;
      } else {
         return List.of();
      }
   }

   private void iilIiIIiIi(iiIIIIIlIIlIIIIl f) {
      iiIIIIIlIIlIIIIl var2 = f == null ? iiIIIIIlIIlIIIIl.lIiiIiIlIl : f;
      this.IlilliiIIi = var2.liiiIIllIl();
      this.llilliiIIi = var2.iIlIlllllill();
      this.ililliiIIi = var2.IilliliilIIi();
      this.IiilliiIIi = var2.lIiiIiIlilli();
      this.liilliiIIi = var2.iliIiiliiiii();
   }

   static boolean Illillllil(double usZ, double vz, double vx, double cellZ, double himX, double cellX, double usX, double himZ) {
      double var16 = himX - usZ;
      double var18 = cellX - vz;
      double var20 = Math.sqrt(var16 * var16 + var18 * var18);
      if (var20 < 1.0E-6) {
         return false;
      } else {
         var16 /= var20;
         var18 /= var20;
         double var22 = (usX - usZ) * var16 + (himZ - vz) * var18;
         double var24 = vx * var16 + cellZ * var18;
         return var22 < -0.5 && var24 < -0.08;
      }
   }

   static boolean illIlIilIl(iIilIlilIlilIlil ph) {
      return ph == iIilIlilIlilIlil.lililIiIil || ph == iIilIlilIlilIlil.iililIiIil || ph == iIilIlilIlilIlil.IIiilIiIil;
   }

   static iIIlIIiIlIlIIi llIIlilIIl(IIiIllIiIl step) {
      return step != null && step.iIlIlllllill() != null && step.IilliliilIIi() != null ? new iIIlIIiIlIlIIi(step.iIlIlllllill(), step.IilliliilIIi()) : null;
   }

   private iiIIIIIlIIlIIIIl IliIilliIi(IIllIIllIllIIl s, class_2338 since, long cell) {
      long var32 = -5187270267559396246L;
      long var34 = 7366427961107554807L;
      long var36 = 2446809302478027440L;
      long var28 = -524800131014801518L;
      long var30 = 7245753312049232452L;
      liiilIiliiiilIil var5 = s.IiIlliIliiIl();
      class_746 var6 = class_310.method_1551().field_1724;
      if (var5 != null && var5.lIiiIiIlilli() != null && var6 != null && s.IlIlllIlilIl() != null) {
         class_1309 var7 = var5.lIiiIiIlilli();
         var28 ^= ((long)(lliiIliliiIl.IilliliilIIi(since) >= 1 ? 1 : 2) << 32 ^ var28) & -1L << 32;
         float var9 = Math.max(
            IiliiIililiiIi.IliIlllilIi(var7, null, since, null),
            IiliiIililiiIi.IliIlllilIi(var7, lllIliIlillIliIl.iIIilIlIil(var7, (int)(var28 >>> 32), false, true), since, null)
         );
         iiIllIlIIlllIl var10 = var5.IlIillIiilIi() != null ? var5.IlIillIiilIi() : lllIliIlillIliIl.iiiIlIIIll(var7);
         float var11 = iiIiiliIIliili.iliIiiliiiii(var9, var10, new IilIlIIllilIlIIl(s.Iilllilliill(), var5.llIIlilIIl()), (int)(var28 >>> 32));
         float var12 = iiIiiliIIliili.iIlIlllllill(var9, var10, 5.0F);
         float var13 = IIililIili(var5);
         var28 ^= ((long)(Float.isFinite(var13) && var13 > 0.0F && var11 >= var13 ? 1 : 0) ^ var28) & -1L >>> 32;
         float var15 = IiliiIililiiIi.liiiIIllIl(since, null, null);
         iiIllIlIIlllIl var16 = lllIliIlillIliIl.iiiIlIIIll(var6);
         float var17 = iiIiiliIIliili.lIiiIiIlilli(var15, var16);
         float var18 = iiIiiliIIliili.iliIiiliiiii(var15, var16, new IilIlIIllilIlIIl(s.IIillIiliIil(), s.IlIlllIlilIl().iIIIlIlIIl()), 1);
         var30 ^= ((long)(lllIliIlillIliIl.IIlilIliiIli(var7.method_33571(), lllIliIlillIliIl.lIiiIiIlilli(since)) <= 4.5 ? 1 : 0) << 32 ^ var30) & -1L << 32;
         var30 ^= ((long)(!(var11 >= 1.0F) && !(var12 >= 0.25F) ? 0 : 1) ^ var30) & -1L >>> 32;
         var32 ^= ((long)(!lIIlliIIll(s) && s.Iilllilliill() > 0 && !illliIilli(var11, var13) && s.IIIllIIliIIl() - cell < 10L ? 0 : 1) << 32 ^ var32)
            & -1L << 32;
         float var22 = var6.method_6032() + var6.method_6067();
         var32 ^= ((long)((int)var28 != 0 && !var5.Iilililiiili() ? 1 : 0) ^ var32) & -1L >>> 32;
         var34 ^= ((long)(s.Iilllilliill() <= (int)(var28 >>> 32) ? 1 : 0) << 32 ^ var34) & -1L << 32;
         float var25 = (int)(var28 >>> 32) == 1
            ? var18
            : iiIiiliIIliili.iliIiiliiiii(var15, var16, new IilIlIIllilIlIIl(s.IIillIiliIil(), s.IlIlllIlilIl().iIIIlIlIIl()), (int)(var28 >>> 32));
         var34 ^= (
               (long)(
                     s.IliIlllilIi().iiIIlIIlIl()
                        ? liIlliiIll(
                           s.IliIlllilIi(),
                           var17,
                           var25,
                           var22,
                           var11,
                           (boolean)((int)var28),
                           (boolean)((int)var32),
                           (boolean)((int)(var30 >>> 32)),
                           (boolean)((int)var30)
                        )
                        : ilIllIiIll(
                           var17,
                           var18,
                           var22,
                           s.IlIlllIlilIl().Iilllilliill(),
                           s.IlIlllIlilIl().IIillIiliIil(),
                           (boolean)((int)var28),
                           (boolean)((int)var32),
                           s.liiiIIllIl(),
                           (boolean)((int)(var30 >>> 32)),
                           (boolean)((int)(var34 >>> 32)),
                           (boolean)((int)var30),
                           (boolean)((int)(var32 >>> 32)),
                           s.IliIlllilIi().iIIIlIlIIl(),
                           this.IIllliiIIi.IIIIllIIIl()
                        )
                  )
                  ^ var34
            )
            & -1L >>> 32;
         var36 ^= ((long)((int)var34 == 0 || (int)(var28 >>> 32) != 1 && (int)var28 == 0 && (int)(var30 >>> 32) == 0 && (int)var30 == 0 ? 0 : 1) << 32 ^ var36)
            & -1L << 32;
         return new iiIIIIIlIIlIIIIl((boolean)((int)(var36 >>> 32)), var11, var18, var17, (boolean)((int)var28), (boolean)((int)var32));
      } else {
         return iiIIIIIlIIlIIIIl.lIiiIiIlIl;
      }
   }

   private boolean lIIiiiIIii(IIllIIllIllIIl p, Iiilllliilll s, boolean instant) {
      long var11 = -2966064813511059770L;
      long var13 = -6226075609538123612L;
      long var15 = 105273152171295655L;
      class_310 var4 = class_310.method_1551();
      class_746 var5 = var4.field_1724;
      if (var5 != null && var4.field_1687 != null && s.liiiIIllIl() != null) {
         var11 ^= ((long)lliiIliliiIl.IilliliilIIi(s.liiiIIllIl()) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)this.lIllliiIIi.IilliliilIIi(st -> st.method_31574(class_1802.field_23141), false) ^ var11) & -1L >>> 32;
         var13 ^= ((long)this.lIllliiIIi.IilliliilIIi(st -> st.method_31574(class_1802.field_8801), false) << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)this.liIiiiiIii(p, s) ^ var13) & -1L >>> 32;
         if (!IllIllllIl((int)(var11 >>> 32) < 0, (int)(var11 >>> 32), (int)var11, (int)(var13 >>> 32), (int)var13)) {
            return false;
         } else {
            this.lIiiliiIIi = (int)(var11 >>> 32) < 0 ? -1 : 2;
            this.IIiiliiIIi = false;
            var15 ^= ((long)this.iIllliiIIi.IliIlllilIi(s, (int)var11, (int)(var13 >>> 32), (int)var13, !lIIlliIIll(p)) << 32 ^ var15) & -1L << 32;
            this.ilIiliiIIi = (int)(var15 >>> 32) != 0 && instant
               ? llIililIil(this.IIllliiIIi.IIillIiliIil(), s.Illlllllilll(), iliiiillIiiiiill.iIlIiIllIi(s.Ililllililil()))
               : Long.MIN_VALUE;
            this.llliliiIIi = (int)(var15 >>> 32) != 0
               ? lliIIliliIIl<"lliIIliliIIl","1BZMjy6id5MOLFSOSAJAD8JWdVz6UvkwAahTR3HWhgk7">()
               : lliIIliliIIl<"lliIIliliIIl","mdUEEPAoRuMzEycCYCaqWOHAyxu0/AkEuDD9KgPCsiT7ZXcTgggJ">();
            return (boolean)((int)(var15 >>> 32));
         }
      } else {
         return false;
      }
   }

   public static boolean Iliilliiilii(iIIiIIliIlIiIIli main, iIIiIIliIlIiIIli off) {
      return !Iiiiliiiiiii(main) && !Iiiiliiiiiii(off);
   }

   static boolean IIIillIIil(int readyIn, int clicks, int turnTicks, boolean landed) {
      long var5 = 270943894132823029L;
      if (readyIn >= 1 && readyIn <= 3) {
         var5 ^= ((long)liilliiill(readyIn, turnTicks) << 32 ^ var5) & -1L << 32;
         return (int)(var5 >>> 32) <= 5 && clicks <= (int)(var5 >>> 32) && (landed || readyIn <= 1);
      } else {
         return false;
      }
   }

   public void IilliliilIIi(boolean release) {
      long var14 = -7859290334381809441L;
      if (this.iIllliiIIi.Iilllilliill()) {
         IIllIIllIllIIl var2 = this.iiIiliiIIi;
         if (var2 == null
            || var2.IIIllIIliIIl() != this.IIllliiIIi.IIillIiliIil()
            || this.llIiliiIIi == this.IIllliiIIi.IIillIiliIil()
            || !this.iiiilIIIIi(var2)) {
            class_2338 var3 = this.iIllliiIIi.Ililllililil();
            if (var3 != null && this.IiIiliiIIi != null && this.IiIiliiIIi.test(class_243.method_24953(var3))) {
               this.iIllliiIIi.IIIilIIiiIIi();
               this.IIliliiIIi = null;
               this.lIliliiIIi = false;
               this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","flooDwSOyQV1yCl9+cfDSFuf4+ngv3tb5+G+FIUDxMUN3w==">();
            } else {
               if (!release && this.iIllliiIIi.IIillIiliIil() == iIilIlilIlilIlil.iililIiIil && this.Illlilllli(var2, var3)) {
                  release = true;
               }

               if (!release && this.iIllliiIIi.IIillIiliIil() == iIilIlilIlilIlil.iililIiIil && var2 != null && lIIlliIIll(var2)) {
                  release = true;
               }

               if (release && this.iIllliiIIi.IIillIiliIil() == iIilIlilIlilIlil.iililIiIil && !this.iiiliIIIii(var3) && !this.iIlllIllll(var3)) {
                  this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
                  if (var3 != null) {
                     this.IlllliiIIi.put(var3.method_10063(), IIIiillllIIiilll.IliIlllilIi() + 3000L);
                  }

                  this.iIllliiIIi.IIIilIIiiIIi();
                  this.IIliliiIIi = null;
                  this.lIliliiIIi = false;
                  this.iililiiIIi = false;
                  this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","L8ROrxZ9G7CCINXn5xXS71w8uXonXt/aifxjCKkMKHrqAZYmyA==">();
               } else {
                  if (release) {
                     this.iIllliiIIi.lIiiIiIlilli();
                  }

                  if (var3 != null && this.IIiiliiIIi && lliiIliliiIl.IilliliilIIi(var3) >= 0) {
                     this.ilIIiIiIIi(var3, IIllIIlilIllIIli.IlIlllIlilIl());
                  }

                  illiIlIiliIl var4 = var3 == null ? null : this.illlliiIIi.get(var3.method_10063());
                  this.iIllliiIIi
                     .iliIiiliiiii(
                        var4 != null
                           && var2 != null
                           && var2.IIIllIIliIIl() == this.IIllliiIIi.IIillIiliIil()
                           && this.lIiIiiIiIi(var2, var3, var4.IliIlllilIi())
                     );
                  iIilIlilIlilIlil var5 = this.iIllliiIIi.IIillIiliIil();
                  lilIillliilIilll var6 = this.iIllliiIIi.IilliliilIIi();
                  if (this.lIiiliiIIi < 0 && var5 == iIilIlilIlilIlil.illilIiIil) {
                     if (var6 == lilIillliilIilll.IIIllIlill || this.iIllliiIIi.IlIlllIlilIl()) {
                        this.lIiiliiIIi = 1;
                     } else if (this.iIllliiIIi.IiIlliIliiIl()) {
                        this.lIiiliiIIi = 0;
                     } else if (var6 != lilIillliilIilll.iIIllIlill && this.iIllliiIIi.IIillIiliIil() != iIilIlilIlilIlil.illilIiIil) {
                        this.lIiiliiIIi = 2;
                     }
                  }

                  long var7 = IIllIIlilIllIIli.IlIlllIlilIl();
                  iIilIlilIlilIlil var9 = this.iIllliiIIi.IIillIiliIil();
                  if (var3 != null
                     && (
                        var9 == iIilIlilIlilIlil.iililIiIil
                           || var9 == iIilIlilIlilIlil.IIiilIiIil
                           || var6 == lilIillliilIilll.IIIllIlill && var9 == iIilIlilIlilIlil.lililIiIil
                           || this.IIiiliiIIi
                              && (var9 == iIilIlilIlilIlil.IililIiIil || var9 == iIilIlilIlilIlil.lililIiIil)
                              && lliiIliliiIl.IilliliilIIi(var3) >= 0
                     )) {
                     this.ilIIiIiIIi(var3, var7);
                  }

                  if (var6 == lilIillliilIilll.IIIllIlill) {
                     this.IIiiliiIIi = true;
                  }

                  if (var6 == lilIillliilIilll.IIIllIlill && this.iIllliiIIi.IIillIiliIil() == iIilIlilIlilIlil.IIiilIiIil) {
                     this.illiliiIIi = var7;
                     this.IililiiIIi = var3;
                     this.iiilliiIIi = var3;
                     this.IIIiliiIIi = IIIiillllIIiilll.IliIlllilIi() + (long)illIllilIilIllil.IiIlliIliiIl() + 100L;
                     iliilliIiiilli.IlIillIiilIi(var3, 5.0F, this.IIIiliiIIi);
                     illiIlIiliIl var16 = var3 == null ? null : this.illlliiIIi.get(var3.method_10063());
                     if (var16 != null) {
                        var14 ^= ((long)(var16.iIlIlllllill() + 1) << 32 ^ var14) & -1L << 32;
                        if ((int)(var14 >>> 32) >= 3) {
                           this.illlliiIIi.remove(var3.method_10063());
                           this.IlllliiIIi.put(var3.method_10063(), IIIiillllIIiilll.IliIlllilIi() + 3000L);
                        } else {
                           long var12 = var7 + 1L + (long)((int)Math.ceil((double)((long)illIllilIilIllil.IiIlliIliiIl() + 100L) / 50.0));
                           this.illlliiIIi.put(var3.method_10063(), new illiIlIiliIl(var16.IliIlllilIi(), var12, (int)(var14 >>> 32)));
                        }
                     }

                     this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","bANKrvgpA+bT02QmG/nojAUmSqnpxbaCMZVQviaus6N+">();
                     this.IIliliiIIi = null;
                     this.lIliliiIIi = false;
                     this.iIllliiIIi.IIIilIIiiIIi();
                     this.iililiiIIi = false;
                     this.IIiiliiIIi = false;
                     this.ilIiliiIIi = Long.MIN_VALUE;
                  } else {
                     if (var6 == lilIillliilIilll.iIIllIlill) {
                        this.lililiiIIi = var7;
                        String var10 = this.iIllliiIIi.Iiilliiliiil();
                        this.llliliiIIi = var10 == null ? lliIIliliIIl<"lliIIliliIIl","H0CaJ5NEqnRmB06PPOL99Y+Dzuz15ODs4KMgc2lBhfoeKw==">() : var10;
                        class_2338 var11 = this.iIllliiIIi.Ililllililil();
                        if (var11 != null && this.iIlllIllll(var11) && lliiIliliiIl.IilliliilIIi(var11) >= 0) {
                           this.liIIiiiIIi(var11, var10, var7);
                           return;
                        }

                        var14 ^= (
                              (long)(
                                    (
                                             !lliIIliliIIl<"lliIIliliIIl","SnrRy/l54OouCic9MD6jRm5WTE8JdNG+JdYvAfok/E2zyyI=">().equals(var10)
                                                || var5 != iIilIlilIlilIlil.iililIiIil
                                          )
                                          && (
                                             var5 != iIilIlilIlilIlil.lililIiIil
                                                || var10 == null
                                                || !var10.endsWith(
                                                   lliIIliliIIl<"lliIIliliIIl","q8DsrKVlVpytZ8sxTPDoAYEo+lrF+NC+qFzCusy7uJI0vN1zJi3n6Jd8Wv4=">()
                                                )
                                          )
                                          && (
                                             var5 != iIilIlilIlilIlil.illilIiIil
                                                || var10 == null
                                                || !var10.endsWith(lliIIliliIIl<"lliIIliliIIl","zogUBIslTzS9T2ABGR0l74Z2nBo5UHmHTYaC38iiMsCoWw==">())
                                          )
                                       ? 0
                                       : 1
                                 )
                                 ^ var14
                           )
                           & -1L >>> 32;
                        if (var11 != null && (int)var14 != 0) {
                           this.IIIlilIIli(var11);
                        } else if (var11 != null) {
                           this.IlllliiIIi.put(var11.method_10063(), IIIiillllIIiilll.IliIlllilIi() + 3000L);
                        }

                        this.IIliliiIIi = null;
                        this.lIliliiIIi = false;
                        this.iIllliiIIi.IIIilIIiiIIi();
                        this.iililiiIIi = false;
                     } else if (var6 == lilIillliilIilll.lIIllIlill) {
                        if (var3 != null) {
                           this.illlliiIIi.remove(var3.method_10063());
                        }

                        this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","fij5vKNm2yiSCqp4Ngwy9hP34cEhZtMGZFyy0yxSwIE=">();
                        this.IIliliiIIi = null;
                        this.lIliliiIIi = false;
                        this.iIllliiIIi.IIIilIIiiIIi();
                        this.iililiiIIi = false;
                     } else {
                        this.llliliiIIi = this.iIllliiIIi.IIillIiliIil().name().toLowerCase(Locale.ROOT);
                     }
                  }
               }
            }
         }
      }
   }

   static boolean lliIliliIl(float forced, float ehp, float damage, boolean minDamage) {
      return forced >= ehp ? true : forced >= (minDamage ? 2.0F : Math.max(3.0F, damage));
   }

   private void liIIiiiIIi(class_2338 reason, String now, long cell) {
      long var9 = 2385527071541648271L;
      long var5 = reason.method_10063();
      illiIlIiliIl var7 = this.illlliiIIi.get(var5);
      if (var7 != null) {
         var9 ^= ((long)(var7.iIlIlllllill() + (IIlIilIlIi(now) ? 1 : 0)) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) >= 3) {
            this.illlliiIIi.remove(var5);
            this.IlllliiIIi.put(var5, IIIiillllIIiilll.IliIlllilIi() + 3000L);
         } else {
            this.illlliiIIi.put(var5, new illiIlIiliIl(var7.IliIlllilIi(), cell + 2L, (int)(var9 >>> 32)));
         }
      }

      this.IlIIillIIi(reason, now);
   }

   private float iIIliIlIli(liiilIiliiiilIil horizon, class_2338 t, int cell) {
      class_1309 var4 = horizon.lIiiIiIlilli();
      float var5 = IiliiIililiiIi.IliIlllilIi(var4, null, t, null);
      float var6 = IiliiIililiiIi.IliIlllilIi(var4, lllIliIlillIliIl.iIIilIlIil(var4, cell, false, true), t, null);
      iiIllIlIIlllIl var7 = horizon.IlIillIiilIi() != null ? horizon.IlIillIiilIi() : lllIliIlillIliIl.iiiIlIIIll(var4);
      return iiIiiliIIliili.lIiiIiIlilli(Math.max(var5, var6), var7);
   }

   private boolean liiIiiiiIi(IIllIIllIllIIl s) {
      class_2338 var2 = this.IilIililIi(s);
      class_746 var3 = class_310.method_1551().field_1724;
      if (var2 != null && var3 != null) {
         this.IIliliiIIi = this.iliIiIiiIi(var2, var3.method_6032() + var3.method_6067());
         this.lIliliiIIi = true;
         this.iIliliiIIi = s.IIIllIIliIIl();
         this.IlliliiIIi = s.IiIlliIliiIl().iIlIlllllill();
         this.iililiiIIi = false;
         if (this.lIIiiiIIii(s, this.IIliliiIIi, false)) {
            this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","zAa1zoz3inGtoRSR+01F2owlHkmvOH8CWUILjQuqFvk=">();
            return true;
         } else {
            this.iIlIiIllIi(var2, s.IIIllIIliIIl());
            this.IIliliiIIi = null;
            this.lIliliiIIi = false;
            return false;
         }
      } else {
         return false;
      }
   }

   public String IiIiliIiiiIi() {
      return this.iIllliiIIi.Iilllilliill() ? this.iIllliiIIi.IIillIiliIil().name() : lliIIliliIIl<"lliIIliliIIl","8RPKKqjxyZxtOf2Y7ojZ3NhQqWUSN5PB7ebFdZ8=">();
   }

   static int IIiilIiiiIii(int early, boolean prepTicks) {
      return Math.max(0, early - 1 + (prepTicks ? 1 : 0));
   }

   static boolean iiIilIIlil(int charges, int readyIn) {
      return charges >= 1 && readyIn <= 0;
   }

   static String iIIIlIlIIl(boolean clicked, iIilIlilIlilIlil charges, int phase) {
      if (phase < 1 && charges != iIilIlilIlilIlil.iililIiIil && charges != iIilIlilIlilIlil.IIiilIiIil) {
         return clicked
            ? lliIIliliIIl<"lliIIliliIIl","EB/uBRETqXjmb8PMhVuLoLn5+jfI3BTKPOq/u/CfHKYbFQ==">()
            : lliIIliliIIl<"lliIIliliIIl","di8cPsLrkXo/9uc08viguarQppUSnfP8BAaUAmEw6I4WCAR7">();
      } else {
         return lliIIliliIIl<"lliIIliliIIl","bqm/w4xDKL6T8fSAxUbXM7gBFLHmRgLV3/Mvug2LMDMp">();
      }
   }

   public boolean iIlIlllllill(IIllIIllIllIIl s, IIiIllIiIl step) {
      long var7 = 3679260071532690314L;
      if (!this.iIllliiIIi.Iilllilliill() && s != null && s.IiIlliIliiIl() != null && step != null && step.IliIlllilIi() != null) {
         this.iiIiliiIIi = s;
         if (this.lIiiiiIiii(s) != null) {
            this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
            return false;
         } else {
            class_2338 var3 = step.IliIlllilIi().method_10062();
            if (this.iliiiIiiii(var3)) {
               this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
               return false;
            } else if (lliiIliliiIl.IilliliilIIi(var3) < 0 && iliilliIiiilli.Iiilliiliiil(var3, iliilliIiiilli.IIillIiliIil())) {
               this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","zogUBIslTzS9T2ABGR0l74Z2nBo5UHmHTYaC38iiMsCoWw==">();
               return false;
            } else {
               var7 ^= ((long)this.lilliiilli(s) << 32 ^ var7) & -1L << 32;
               if ((int)(var7 >>> 32) != 0 && !iiIilIIlil(lliiIliliiIl.IilliliilIIi(var3), s.Iilllilliill()) && !this.IlIiillIii(s)) {
                  this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
                  this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","2raSN/rXpkSwqMjYpmSiNnZoAbvOd2HGGvqhFcok3w==">();
                  return false;
               } else {
                  Iiilllliilll var5 = this.iIliiIllii(s, var3, true, llIIlilIIl(step));
                  if (var5 == null) {
                     this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
                     this.IlllliiIIi.put(var3.method_10063(), IIIiillllIIiilll.IliIlllilIi() + 3000L);
                     this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","RJetSs2dQelbyTBRKVcPyb8eDcvjkMtx4dnJIgeXfZ78o8iHYPVcBR8Q">();
                     return false;
                  } else {
                     var7 ^= ((long)this.ilIiiIiIii(s, var5) ^ var7) & -1L >>> 32;
                     if ((int)(var7 >>> 32) != 0 && !iiIilIIlil(lliiIliliiIl.IilliliilIIi(var3), s.Iilllilliill()) && (int)var7 == 0) {
                        this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
                        this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","2raSN/rXpkSwqMjYpmSiNnZoAbvOd2HGGvqhFcok3w==">();
                        return false;
                     } else if (!lliIliliIl(var5.iliIiiliiiii(), IIililIili(s.IiIlliIliiIl()), 0.0F, true)
                        && !lIlliiIlli(s.IliIlllilIi(), var5.iliIiiliiiii(), var5.IlIillIiilIi(), IIililIili(s.IiIlliIliiIl()))) {
                        this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
                        this.IIIlilIIli(var3);
                        this.llliliiIIi = lliIIliliIIl<"lliIIliliIIl","H2+GCBE9Sw8mziSBGx7l3PyeB6amOXSYuRgkv3Yvl0A=">();
                        return false;
                     } else {
                        this.IIliliiIIi = var5;
                        this.lIliliiIIi = true;
                        this.iIliliiIIi = s.IIIllIIliIIl();
                        this.IlliliiIIi = s.IiIlliIliiIl().iIlIlllllill();
                        this.iililiiIIi = true;
                        if (!this.lIIiiiIIii(s, var5, (boolean)((int)var7))) {
                           this.lililiiIIi = IIllIIlilIllIIli.IlIlllIlilIl();
                           return false;
                        } else {
                           return true;
                        }
                     }
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   static boolean IiiIlliiIl(int ticksSinceFresh, float distance, double lastScaledTaken) {
      return iliiiillIiiiiill.ilIllIiIll(ticksSinceFresh, distance, lastScaledTaken);
   }
}
