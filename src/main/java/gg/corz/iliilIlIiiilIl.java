package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.IntFunction;
import net.minecraft.class_1511;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class iliilIlIiiilIl {
   public static final int IiliIllllliliIllll = 2;
   private Set<Integer> iIiIlllllIliIlllll;
   private List<ilIllIIiIiIllIIi> iilllllllIIillllll;
   public static final double iIilIllllIlilIllll = 3.1;
   private final IilIllililIlli lIlIllllliIlIlllll;
   public static final int lIiiIlllliIiiIllll = 99;
   private IntFunction<iillilIIilil> IllIllllllllIlllll;
   public static final int lIIiIlllliIIiIllll = 5;
   public static final double ilIiIllllIiIiIllll = 4.5;
   public static final int iiilIllllIIIiIllll = 4;
   private int iIlllllllIllllllll;
   public static final double IIilIlllllIilIllll = 4.6;
   private List<IIIilIIiiIIi> Iillllllllilllllll;
   public static final double IliiIlllllliiIllll = 1.62;
   public static final double iiIlIllllIIllIllll = 3.2;
   private iiIllIlIIlllIl lIilllllliIillllll;
   public static final float iiIIlllllIIlIlllll = 0.6F;
   public static final int iiliIllllIIiiIllll = 4;
   public static final double liIiIlllliiIiIllll = 3.5;
   private float iiiIlllllIIIllllll;
   public static final double llIlIllllilIlIllll = 8.0;
   public static final int lillIlllliillIllll = 4;
   public static final int lIllIlllliIllIllll = 3;
   private float IiiIlllllliiIlllll;
   public static final int IiIlIllllliIlIllll = 4;
   private class_243 IIiIllllllIiIlllll;
   private float Ilillllllllillllll;
   private final List<ilIllIIiIiIllIIi> IlIllllllllIllllll;
   public static final float liiiIlllliiiiIllll = 5.0F;
   private long lilIllllliilIlllll;
   public static final double iIliIllllIlliIllll = 0.5;
   private final List<ilIllIIiIiIllIIi> lIIlllllliIIllllll;
   private class_2338 lliIllllliliIlllll;
   public static final float llilIllllililIllll = 0.6F;
   public static final double IlllIllllllllIllll = 10.0;
   public static final int llIIlllllilIIlllll = 2;
   public static final float iliiIllllIiiiIllll = 6.0F;
   public static final double IIIIllllllIIIlllll = 0.28;
   public static final int IiilIllllliilIllll = 4;
   private class_1937 ilillllllIiillllll;
   public static final int iIIIlllllIlIIlllll = 20;
   private long ilIllllllIiIllllll;
   public static final float IIliIlllllIliIllll = 9.0F;
   public static final int llliIllllilliIllll = 45;
   private IlIillllIill illIlllllIilIlllll = IlIillllIill.IIIIilIilIIIilIi;
   private float liIlllllliiIllllll;
   public static final int IlIiIllllllIiIllll = 2;
   private iliIliilIiiIliil lllllllllillllllll;
   public static final int IiIIlllllliIIlllll = 2;
   private class_2338 IIllllllllIlllllll;
   public static final int illlIllllIillIllll = 2;

   public float Iilllilliill(class_243 feet, class_238 box, List<liiilIiliiiilIil> enemies) {
      class_310 var4 = class_310.method_1551();
      if (var4.field_1687 != null && var4.field_1724 != null && feet != null && box != null) {
         ArrayList var5 = new ArrayList(4);

         for (ilIllIIiIiIllIIi var7 : this.IlIllllllllIllllll) {
            if (var5.size() >= 2) {
               break;
            }

            var5.add(var7);
         }

         this.IIillIiliIil(var5, feet);
         var5.addAll(this.IiIlliIliiIl());
         float var14 = 0.0F;

         for (ilIllIIiIiIllIIi var8 : var5) {
            double var9 = feet.method_1022(var8.liiiIIllIl());
            if (!(var9 > (double)var8.lIiiIiIlilli() * 2.0)) {
               float var11;
               if (this.lIlIllllliIlIlllll != null && !this.lIlIllllliIlIlllll.liiiIIllIl(12, 3)) {
                  var11 = IiIiliIiiiIi(var9, var8.lIiiIiIlilli(), var8.iliIiiliiiii(), this.lIilllllliIillllll);
               } else {
                  float var12 = ilIillIiIill.IliIlllilIi(var8.liiiIIllIl(), box, var4.field_1724, var8.iIlIlllllill(), var8.IilliliilIIi());
                  float var13 = (float)liiIIliliiiIIlil.IliIlllilIi(var9, (double)var12, (double)var8.lIiiIiIlilli());
                  var11 = iiIiiliIIliili.lIiiIiIlilli(iiIiiliIIliili.IliIlllilIi(var13, this.lIilllllliIillllll.lIiiIiIlilli()), this.lIilllllliIillllll)
                     * var8.iliIiiliiiii();
               }

               var14 = Math.max(var14, var11);
            }
         }

         if (enemies != null) {
            for (liiilIiliiiilIil var17 : enemies) {
               if (var17.IIIllIIliIIl() != null
                  && !(var17.IIIllIIliIIl().method_1022(feet) > 3.5)
                  && (
                     var17.IIiilIiiiIii() == iIIiIIliIlIiIIli.IIIiilIlIi
                        || var17.IIiilIiiiIii() == iIIiIIliIlIiIIli.lIIiilIlIi
                        || var17.IIiilIiiiIii() == iIIiIIliIlIiIIli.iIIiilIlIi
                  )) {
                  var14 = Math.max(var14, iIiIlIiIliIlIi.liiiIIllIl(9.0F, 0.0F, 1.0F, false, this.lIilllllliIillllll, this.Ilillllllllillllll));
               }
            }
         }

         return var14;
      } else {
         return 0.0F;
      }
   }

   public void IliIlllilIi(IntFunction<iillilIIilil> source) {
      this.IllIllllllllIlllll = source;
   }

   public iliilIlIiiilIl(IilIllililIlli rhythms, IntFunction<iillilIIilil> budget) {
      this.lilIllllliilIlllll = Long.MIN_VALUE;
      this.iIiIlllllIliIlllll = new HashSet<>();
      this.lIIlllllliIIllllll = new ArrayList<>();
      this.IlIllllllllIllllll = new ArrayList<>();
      this.ilIllllllIiIllllll = Long.MIN_VALUE;
      this.iIlllllllIllllllll = 99;
      this.Iillllllllilllllll = List.of();
      this.iilllllllIIillllll = List.of();
      this.lIilllllliIillllll = iiIllIlIIlllIl.lliIilIlliliIilIll;
      this.lIlIllllliIlIlllll = rhythms;
      this.IllIllllllllIlllll = budget;
   }

   private Map<Integer, Boolean> Iiilliiliiil(class_1937 self, class_746 world, lliiilIiiliiilIi foes, List<liiilIiliiiilIil> player) {
      long var24 = 5684100882097302991L;
      long var26 = -1790286867961095639L;
      long var28 = 3565762862767244743L;
      HashMap var5 = new HashMap();
      class_2338 var6 = class_2338.method_49638(foes.liiiIIllIl());
      ArrayList var7 = new ArrayList();

      for (liiilIiliiiilIil var9 : player) {
         if (var9.IIIllIIliIIl() != null && var9.Illlllllilll() <= 10.0) {
            var7.add(var9);
         }
      }

      if (var7.isEmpty()) {
         this.lliIllllliliIlllll = null;
         this.IiiIlllllliiIlllll = 0.0F;
         this.iiiIlllllIIIllllll = 0.0F;
         this.lIIlllllliIIllllll.clear();
         return var5;
      } else {
         HashMap var30 = new HashMap();
         var24 ^= (-4294967296L ^ var24) & -1L << 32;

         while ((int)(var24 >>> 32) <= 0) {
            for (var24 ^= (-2L ^ var24) & -1L >>> 32; (int)var24 <= 2; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
               var26 ^= (-8589934592L ^ var26) & -1L << 32;

               while ((int)(var26 >>> 32) <= 2) {
                  class_2338 var12 = var6.method_10069((int)var24, (int)(var24 >>> 32), (int)(var26 >>> 32));
                  var26 ^= ((long)(lllIliIlillIliIl.IliIlllilIi(var12) && self.method_22347(var12.method_10084()) ? 1 : 0) ^ var26) & -1L >>> 32;
                  class_243 var14 = new class_243((double)var12.method_10263() + 0.5, (double)var12.method_10264() + 1.0, (double)var12.method_10260() + 0.5);
                  class_238 var15 = lllIliIlillIliIl.IilliliilIIi(var12);
                  Boolean var16 = null;

                  for (liiilIiliiiilIil var18 : var7) {
                     var28 ^= (
                           (long)(var18.IIiilIiiiIii() != iIIiIIliIlIiIIli.IiililIlIi && var18.Iliilliiilii() != iIIiIIliIlIiIIli.IiililIlIi ? 0 : 1) << 32
                              ^ var28
                        )
                        & -1L << 32;
                     if ((int)var26 != 0 || (int)(var28 >>> 32) != 0) {
                        class_243 var20 = var18.IlIlllIlilIl() == null ? class_243.field_1353 : var18.IlIlllIlilIl();
                        class_243 var21 = var18.IIIllIIliIIl().method_1031(var20.field_1352 * 4.0, var20.field_1351 * 4.0 + 1.62, var20.field_1350 * 4.0);
                        if (!(var21.method_1022(var14) > 4.6) && !(lllIliIlillIliIl.IIlilIliiIli(var21, var15) > 3.1)) {
                           if (var16 == null) {
                              var16 = (int)var26 != 0 ? self.method_8335(null, lllIliIlillIliIl.iIlIlllllill(var12)).isEmpty() : IIlilIliiIli(self, var12);
                           }

                           if (!var16) {
                              break;
                           }

                           var5.put(var18.iIlIlllllill(), Boolean.TRUE);
                           liililiiilil var22 = new liililiiilil(var12, (int)var26 == 0);
                           float var23 = (int)var26 != 0 ? 1.0F : 0.6F;
                           var30.merge(var22, var23, Math::max);
                        }
                     }
                  }

                  var26 += 4294967296L;
               }
            }

            var24 += 4294967296L;
         }

         ArrayList var31 = new ArrayList(var30.entrySet());
         class_243 var10 = foes.liiiIIllIl();
         var31.sort(
            Comparator.<Entry>comparingDouble(
                  en -> (double)(
                        lllIliIlillIliIl.ilIllIiIll(world, var10.method_1022(lllIliIlillIliIl.liiiIIllIl(((liililiiilil)en.getKey()).IliIlllilIi())), 6.0F)
                           * (Float)en.getValue()
                     )
               )
               .reversed()
         );
         ArrayList var11 = new ArrayList();
         var28 ^= (0L ^ var28) & -1L >>> 32;
         var26 ^= (0L ^ var26) & -1L >>> 32;

         for (Entry var33 : var31) {
            if ((int)var28 >= 4) {
               break;
            }

            if (this.lIlIllllliIlIlllll != null && !this.lIlIllllliIlIlllll.liiiIIllIl(45, 3)) {
               var26 ^= (1L ^ var26) & -1L >>> 32;
               break;
            }

            var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32;
            liililiiilil var34 = (liililiiilil)var33.getKey();
            class_243 var35 = lllIliIlillIliIl.liiiIIllIl(var34.IliIlllilIi());
            class_2338 var36 = var34.liiiIIllIl() ? var34.IliIlllilIi() : null;
            float var19 = lllIliIlillIliIl.IlIllllIll(world, var35, var10, foes.IilliliilIIi(), var36, null, 6.0F);
            float var37 = iiIiiliIIliili.lIiiIiIlilli(var19, this.lIilllllliIillllll) * (Float)var33.getValue();
            var11.add(new ilIllIIiIiIllIIi(var34.IliIlllilIi(), var35, var36, null, 6.0F, (Float)var33.getValue(), var37));
         }

         if ((int)var26 != 0 && var11.isEmpty() && !var31.isEmpty()) {
            return var5;
         } else {
            var11.sort(Comparator.<ilIllIIiIiIllIIi>comparingDouble(s -> (double)s.IIIllIIliIIl()).reversed());
            this.lIIlllllliIIllllll.clear();
            this.lIIlllllliIIllllll.addAll(var11);
            this.lliIllllliliIlllll = var11.isEmpty() ? null : ((ilIllIIiIiIllIIi)var11.get(0)).IliIlllilIi();
            this.IiiIlllllliiIlllll = var11.isEmpty() ? 0.0F : ((ilIllIIiIiIllIIi)var11.get(0)).IIIllIIliIIl();
            this.iiiIlllllIIIllllll = var11.size() < 2 ? 0.0F : ((ilIllIIiIiIllIIi)var11.get(1)).IIIllIIliIIl();
            return var5;
         }
      }
   }

   private List<ilIllIIiIiIllIIi> IiIlliIliiIl() {
      iliIliilIiiIliil var1 = this.lllllllllillllllll;
      if (var1 == null) {
         return List.of();
      } else {
         List var2 = var1.iliIiiliiiii();
         if (var2 != this.Iillllllllilllllll) {
            ArrayList var3 = new ArrayList(2);

            for (IIIilIIiiIIi var5 : IlIlllIlilIl(var2)) {
               var3.add(
                  new ilIllIIiIiIllIIi(
                     var5.lIiiIiIlilli(),
                     class_243.method_24953(var5.lIiiIiIlilli()),
                     null,
                     var5.lIiiIiIlilli(),
                     5.0F,
                     var5.Iilllilliill(),
                     var5.IiIlliIliiIl()
                  )
               );
            }

            this.Iillllllllilllllll = var2;
            this.iilllllllIIillllll = List.copyOf(var3);
         }

         return this.iilllllllIIillllll;
      }
   }

   private static boolean IIlilIliiIli(class_1937 b, class_2338 world) {
      return lllIliIlillIliIl.Illlllllilll(world.method_10074()) && lllIliIlillIliIl.IlIillIiilIi(world);
   }

   public iliilIlIiiilIl(IilIllililIlli budget) {
      this(budget, null);
   }

   public iillilIIilil liiiIIllIl(int id) {
      IntFunction var2 = this.IllIllllllllIlllll;
      return var2 == null ? null : (iillilIIilil)var2.apply(id);
   }

   private void IIillIiliIil(List<ilIllIIiIiIllIIi> out, class_243 feet) {
      while (out.size() < 2) {
         ilIllIIiIiIllIIi var3 = null;
         float var4 = 0.0F;

         for (ilIllIIiIiIllIIi var6 : this.lIIlllllliIIllllll) {
            if (!out.contains(var6)) {
               double var7 = feet.method_1022(var6.liiiIIllIl());
               if (!(var7 > (double)var6.lIiiIiIlilli() * 2.0)) {
                  float var9 = IiIiliIiiiIi(var7, var6.lIiiIiIlilli(), var6.iliIiiliiiii(), this.lIilllllliIillllll);
                  if (var3 == null || var9 > var4) {
                     var3 = var6;
                     var4 = var9;
                  }
               }
            }
         }

         if (var3 == null) {
            return;
         }

         out.add(var3);
      }
   }

   public IlIillllIill Illlllllilll() {
      return this.illIlllllIilIlllll;
   }

   public void iIlIlllllill(iliIliilIiiIliil source) {
      this.lllllllllillllllll = source;
   }

   private void IIIilIIiiIIi(class_1937 foes, class_746 world, lliiilIiiliiilIi player, List<liiilIiliiiilIil> self) {
      long var16 = 5681611284894189416L;
      long var14 = 1225126627033180174L;
      this.liIlllllliiIllllll = 0.0F;
      this.IIllllllllIlllllll = null;
      if (foes.method_27983() != class_1937.field_25180) {
         class_2338 var5 = class_2338.method_49638(player.liiiIIllIl());
         class_243 var6 = player.liiiIIllIl();
         var14 ^= (-8589934592L ^ var14) & -1L << 32;

         while ((int)(var14 >>> 32) <= 2) {
            for (var14 ^= (-5L ^ var14) & -1L >>> 32; (int)var14 <= 5; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
               for (var16 ^= (-21474836480L ^ var16) & -1L << 32; (int)(var16 >>> 32) <= 5; var16 += 4294967296L) {
                  class_2338 var10 = var5.method_10069((int)var14, (int)(var14 >>> 32), (int)(var16 >>> 32));
                  class_2680 var11 = foes.method_8320(var10);
                  if (var11.method_27852(class_2246.field_23152) && (Integer)var11.method_11654(class_4969.field_23153) > 0) {
                     class_243 var12 = class_243.method_24953(var10);
                     if (!(var12.method_1022(var6) > 10.0) && (this.lIlIllllliIlIlllll == null || this.lIlIllllliIlIlllll.liiiIIllIl(45, 3))) {
                        float var13 = iiIiiliIIliili.lIiiIiIlilli(
                           lllIliIlillIliIl.IlIllllIll(world, var12, var6, player.IilliliilIIi(), null, var10, 5.0F), this.lIilllllliIillllll
                        );
                        if (var13 > this.liIlllllliiIllllll) {
                           this.liIlllllliiIllllll = var13;
                           this.IIllllllllIlllllll = var10;
                        }
                     }
                  }
               }
            }

            var14 += 4294967296L;
         }

         this.IlIillIiilIi(foes, world, player, self);
      }
   }

   public void Ililllililil() {
      this.illIlllllIilIlllll = IlIillllIill.IIIIilIilIIIilIi;
      this.lilIllllliilIlllll = Long.MIN_VALUE;
      this.IIiIllllllIiIlllll = null;
      this.iIiIlllllIliIlllll = new HashSet<>();
      this.lliIllllliliIlllll = null;
      this.IiiIlllllliiIlllll = 0.0F;
      this.iiiIlllllIIIllllll = 0.0F;
      this.lIIlllllliIIllllll.clear();
      this.IlIllllllllIllllll.clear();
      this.ilIllllllIiIllllll = Long.MIN_VALUE;
      this.liIlllllliiIllllll = 0.0F;
      this.IIllllllllIlllllll = null;
      this.iIlllllllIllllllll = 99;
      this.Iillllllllilllllll = List.of();
      this.iilllllllIIillllll = List.of();
      this.lIilllllliIillllll = iiIllIlIIlllIl.lliIilIlliliIilIll;
      this.Ilillllllllillllll = 0.0F;
      this.ilillllllIiillllll = null;
   }

   public IlIillllIill IilliliilIIi(long selfClosedFor, lliiilIiiliiilIi tick, List<liiilIiliiiilIil> enemies, int self) {
      long var32 = -8716396872996073767L;
      long var34 = -9220824583110751860L;
      long var36 = 67412387237308872L;
      long var38 = 5902791242653530728L;
      long var40 = -84340575525403386L;
      long var42 = 1470984029307000377L;
      class_310 var6 = class_310.method_1551();
      class_638 var7 = var6.field_1687;
      class_746 var8 = var6.field_1724;
      if (var7 != null && var8 != null && tick != null) {
         if (var7 != this.ilillllllIiillllll) {
            this.Ililllililil();
            this.ilillllllIiillllll = var7;
         }

         List var9 = enemies == null ? List.of() : enemies;
         this.lIilllllliIillllll = tick.IiIlliIliiIl() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : tick.IiIlliIliiIl();
         class_243 var10 = tick.liiiIIllIl();
         List var11 = var7.method_8390(
            class_1511.class,
            tick.IilliliilIIi().method_1014(8.0),
            feetPos -> feetPos.method_5805() && !feetPos.method_31481() && feetPos.method_73189().method_1022(var10) <= 8.0
         );
         HashSet var12 = new HashSet();

         for (class_1511 var14 : var11) {
            var12.add(var14.method_5628());
         }

         var32 ^= ((long)(!var12.equals(this.iIiIlllllIliIlllll) ? 1 : 0) << 32 ^ var32) & -1L << 32;
         var32 ^= ((long)(this.IIiIllllllIiIlllll != null && !(var10.method_1022(this.IIiIllllllIiIlllll) > 0.5) ? 0 : 1) ^ var32) & -1L >>> 32;
         var34 ^= ((long)(this.lilIllllliilIlllll != Long.MIN_VALUE && selfClosedFor - this.lilIllllliilIlllll < 2L ? 0 : 1) << 32 ^ var34) & -1L << 32;
         if ((int)(var34 >>> 32) == 0 && (int)(var32 >>> 32) == 0 && (int)var32 == 0) {
            this.illIlllllIilIlllll = this.IIlllIlliIll(this.illIlllllIilIlllll, tick);
            return this.illIlllllIilIlllll;
         } else {
            this.lilIllllliilIlllll = selfClosedFor;
            this.IIiIllllllIiIlllll = var10;
            this.iIiIlllllIliIlllll = var12;
            this.Ilillllllllillllll = lllIliIlillIliIl.iIiIlIliIl(var8);
            IilIlIIllilIlIIl var16 = new IilIlIIllilIlIIl(Math.max(0, self), tick.iIIIlIlIIl());
            var11.sort(Comparator.comparingDouble(c -> c.method_73189().method_1025(var10)));
            float var17 = 0.0F;
            var34 ^= ~var34 & -1L >>> 32;
            class_243 var19 = null;
            var36 ^= (0L ^ var36) & -1L << 32;
            var36 ^= (99L ^ var36) & -1L >>> 32;
            this.IlIllllllllIllllll.clear();
            var38 ^= (0L ^ var38) & -1L << 32;

            for (class_1511 var24 : var11) {
               if ((int)(var38 >>> 32) >= 4) {
                  break;
               }

               var38 += 4294967296L;
               class_243 var25 = var24.method_73189();
               var38 ^= ((long)Illillliilli(var24.method_5829(), var9) ^ var38) & -1L >>> 32;
               if ((int)var38 >= 0) {
                  if (this.lIlIllllliIlIlllll != null) {
                     this.lIlIllllliIlIlllll.liiiIIllIl(45, 1);
                  }

                  float var27 = lllIliIlillIliIl.IlIllllIll(var8, var25, var10, tick.IilliliilIIi(), null, null, 6.0F);
                  float var28 = iiIiiliIIliili.IIIllIIliIIl(var27, this.lIilllllliIillllll, var16, (int)var38);
                  this.IlIllllllllIllllll.add(new ilIllIIiIiIllIIi(var24.method_24515().method_10074(), var25, null, null, 6.0F, 1.0F, var28));
                  var36 ^= ((long)Math.min((int)var36, (int)var38) ^ var36) & -1L >>> 32;
                  if ((int)var38 == 0) {
                     var36 ^= (4294967296L ^ var36) & -1L << 32;
                  }

                  if (var28 > var17) {
                     var17 = var28;
                     var34 ^= ((long)var24.method_5628() ^ var34) & -1L >>> 32;
                     var19 = var25;
                  }
               }
            }

            this.IlIllllllllIllllll.sort(Comparator.<ilIllIIiIiIllIIi>comparingDouble(s -> (double)s.IIIllIIliIIl()).reversed());
            Map var44 = this.Iiilliiliiil(var7, var8, tick, var9);
            if (this.ilIllllllIiIllllll == Long.MIN_VALUE || selfClosedFor - this.ilIllllllIiIllllll >= 4L) {
               this.ilIllllllIiIllllll = selfClosedFor;
               if (this.lllllllllillllllll == null) {
                  this.IIIilIIiiIIi(var7, var8, tick, var9);
               } else {
                  this.liIlllllliiIllllll = 0.0F;
                  this.IIllllllllIlllllll = null;
                  this.IlIillIiilIi(var7, var8, tick, var9);
               }
            }

            float var45 = 0.0F;

            for (liiilIiliiiilIil var26 : var9) {
               if (!(var26.Illlllllilll() > 3.5)
                  && (
                     var26.IIiilIiiiIii() == iIIiIIliIlIiIIli.IIIiilIlIi
                        || var26.IIiilIiiiIii() == iIIiIIliIlIiIIli.lIIiilIlIi
                        || var26.IIiilIiiiIii() == iIIiIIliIlIiIIli.iIIiilIlIi
                  )) {
                  var45 = Math.max(var45, iIiIlIiIliIlIi.liiiIIllIl(9.0F, 0.0F, 1.0F, false, this.lIilllllliIillllll, this.Ilillllllllillllll));
               }
            }

            float var47 = Math.max(Math.max(var17, this.IiiIlllllliiIlllll), Math.max(this.liIlllllliiIllllll, var45));
            if ((int)(var36 >>> 32) != 0) {
               var38 ^= (0L ^ var38) & -1L >>> 32;
            } else {
               var40 ^= (425201762304L ^ var40) & -1L << 32;

               for (liiilIiliiiilIil var29 : var9) {
                  var40 ^= (99L ^ var40) & -1L >>> 32;
                  iillilIIilil var31 = this.IllIllllllllIlllll == null ? null : this.IllIllllllllIlllll.apply(var29.iIlIlllllill());
                  if (var31 != null) {
                     var40 ^= ((long)var31.IIillIiliIil(selfClosedFor) ^ var40) & -1L >>> 32;
                  }

                  if (Boolean.TRUE.equals(var44.get(var29.iIlIlllllill()))) {
                     var40 ^= ((long)Math.min((int)var40, 4) ^ var40) & -1L >>> 32;
                  }

                  var40 ^= ((long)Math.min((int)(var40 >>> 32), Math.max(Math.max(0, self), (int)var40)) << 32 ^ var40) & -1L << 32;
               }

               var40 ^= ((long)Math.min((int)(var40 >>> 32), Math.max(Math.max(0, self), (int)var36)) << 32 ^ var40) & -1L << 32;
               var38 ^= ((long)((int)(var40 >>> 32)) ^ var38) & -1L >>> 32;
            }

            this.iIlllllllIllllllll = (int)var38;
            float var48 = tick.IliIlllilIi();
            var42 ^= ((long)(var47 >= var48 - 1.0F ? 1 : 0) << 32 ^ var42) & -1L << 32;
            var42 ^= ((long)((int)(var42 >>> 32) != 0 && !tick.Iilllilliill() ? 1 : 0) ^ var42) & -1L >>> 32;
            this.illIlllllIilIlllll = this.IIlllIlliIll(
               new IlIillllIill(
                  var47,
                  var17,
                  (int)var34,
                  var19,
                  this.lliIllllliliIlllll,
                  this.IiiIlllllliiIlllll,
                  this.iiiIlllllIIIllllll,
                  this.liIlllllliiIllllll,
                  this.IIllllllllIlllllll,
                  var45,
                  (int)var38,
                  (boolean)((int)var42),
                  (boolean)((int)(var42 >>> 32))
               ),
               tick
            );
            return this.illIlllllIilIlllll;
         }
      } else {
         this.illIlllllIilIlllll = IlIillllIill.IIIIilIilIIIilIi;
         return this.illIlllllIilIlllll;
      }
   }

   static int IIIllIIliIIl(int eta, IIIilIIiiIIi top) {
      return top != null && top.IliIlllilIi() && !(top.Iilllilliill() < 0.6F) ? Math.min(eta, top.Illlllllilll()) : eta;
   }

   static float lIiiIiIlilli(float head, List<IIIilIIiiIIi> anchors) {
      float var2 = Math.max(0.0F, head);
      if (anchors == null) {
         return var2;
      } else {
         for (IIIilIIiiIIi var4 : anchors) {
            if (var4 != null && var4.IliIlllilIi() && (var4.iliIiiliiiii() >= 1 || var4.Illlllllilll() <= 2)) {
               var2 = Math.max(var2, var4.IiIlliIliiIl());
            }
         }

         return var2;
      }
   }

   static class_2338 iliIiiliiiii(class_2338 head, IIIilIIiiIIi top) {
      return top != null && top.IliIlllilIi() ? top.lIiiIiIlilli() : head;
   }

   private void IlIillIiilIi(class_1937 self, class_746 foes, lliiilIiiliiilIi world, List<liiilIiliiiilIil> player) {
      long var12 = -5323177873477204153L;
      if (self.method_27983() != class_1937.field_25180) {
         class_243 var5 = world.liiiIIllIl();
         class_2338 var6 = class_2338.method_49638(var5).method_10086(2);
         if (self.method_8320(var6).method_45474()) {
            class_243 var7 = class_243.method_24953(var6);

            for (liiilIiliiiilIil var9 : player) {
               var12 ^= (
                     (long)(
                              var9.IIiilIiiiIii() != iIIiIIliIlIiIIli.liililIlIi
                                    && var9.IIiilIiiiIii() != iIIiIIliIlIiIIli.iiililIlIi
                                    && var9.Iliilliiilii() != iIIiIIliIlIiIIli.liililIlIi
                                    && var9.Iliilliiilii() != iIIiIIliIlIiIIli.iiililIlIi
                                 ? 0
                                 : 1
                           )
                           << 32
                        ^ var12
                  )
                  & -1L << 32;
               if ((int)(var12 >>> 32) != 0 && var9.IiIlliIliiIl() != null && !(var9.IiIlliIliiIl().method_1022(var7) > 4.5)) {
                  if (this.lIlIllllliIlIlllll != null && !this.lIlIllllliIlIlllll.liiiIIllIl(45, 3)) {
                     break;
                  }

                  float var11 = iiIiiliIIliili.lIiiIiIlilli(
                     lllIliIlillIliIl.IlIllllIll(foes, var7, var5, world.IilliliilIIi(), null, var6, 5.0F), this.lIilllllliIillllll
                  );
                  if (var11 > this.liIlllllliiIllllll) {
                     this.liIlllllliiIllllll = var11;
                     this.IIllllllllIlllllll = var6;
                  }
                  break;
               }
            }
         }
      }
   }

   static List<IIIilIIiiIIi> IlIlllIlilIl(List<IIIilIIiiIIi> anchors) {
      ArrayList var1 = new ArrayList(2);
      if (anchors == null) {
         return var1;
      } else {
         ArrayList var2 = new ArrayList();

         for (IIIilIIiiIIi var4 : anchors) {
            if (var4 != null && var4.IliIlllilIi() && var4.Iilllilliill() > 0.0F) {
               var2.add(var4);
            }
         }

         var2.sort(Comparator.<IIIilIIiiIIi>comparingDouble(a -> (double)a.liiiIIllIl()).reversed());

         for (IIIilIIiiIIi var6 : var2) {
            if (var1.size() >= 2) {
               break;
            }

            var1.add(var6);
         }

         return var1;
      }
   }

   static float IiIiliIiiiIi(double weight, float armor, float distance, iiIllIlIIlllIl power) {
      iiIllIlIIlllIl var5 = power == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : power;
      float var6 = (float)liiIIliliiiIIlil.IliIlllilIi(weight, 1.0, (double)armor);
      return iiIiiliIIliili.lIiiIiIlilli(iiIiiliIIliili.IliIlllilIi(var6, var5.lIiiIiIlilli()), var5) * distance;
   }

   private static int Illillliilli(class_238 foes, List<liiilIiliiiilIil> crystalBox) {
      long var11 = -2694910328615676190L;
      var11 ^= (-4294967296L ^ var11) & -1L << 32;

      for (liiilIiliiiilIil var4 : crystalBox) {
         class_243 var5 = var4.IiIlliIliiIl() != null
            ? var4.IiIlliIliiIl()
            : (var4.IIIllIIliIIl() == null ? null : var4.IIIllIIliIIl().method_1031(0.0, 1.62, 0.0));
         if (var5 != null) {
            if (lllIliIlillIliIl.IIlilIliiIli(var5, foes) <= 3.2) {
               return 0;
            }

            class_243 var6 = var4.IlIlllIlilIl() == null ? class_243.field_1353 : var4.IlIlllIlilIl();
            if (var4.IIIllIIliIIl() != null) {
               class_243 var7 = var4.IIIllIIliIIl().method_1031(var6.field_1352 * 3.0, var6.field_1351 * 3.0 + 1.62, var6.field_1350 * 3.0);
               if (lllIliIlillIliIl.IIlilIliiIli(var7, foes) <= 3.2) {
                  var11 ^= ((long)((int)(var11 >>> 32) < 0 ? 3 : Math.min((int)(var11 >>> 32), 3)) << 32 ^ var11) & -1L << 32;
               } else {
                  double var8 = lllIliIlillIliIl.IIlilIliiIli(var5, foes) - 3.2;
                  var11 ^= ((long)((int)Math.ceil(var8 / 0.28)) ^ var11) & -1L >>> 32;
                  if ((int)var11 <= 20) {
                     var11 ^= ((long)((int)(var11 >>> 32) < 0 ? (int)var11 : Math.min((int)(var11 >>> 32), (int)var11)) << 32 ^ var11) & -1L << 32;
                  }
               }
            }
         }
      }

      return (int)(var11 >>> 32);
   }

   private IlIillllIill IIlllIlliIll(IlIillllIill self, lliiilIiiliiilIi t) {
      long var11 = -3630572647589689846L;
      long var13 = 3259110167862928774L;
      if (self == null) {
         return IlIillllIill.IIIIilIilIIIilIi;
      } else {
         float var3 = this.liIlllllliiIllllll;
         class_2338 var4 = this.IIllllllllIlllllll;
         var11 ^= ((long)this.iIlllllllIllllllll << 32 ^ var11) & -1L << 32;
         iliIliilIiiIliil var6 = this.lllllllllillllllll;
         if (var6 != null) {
            var3 = lIiiIiIlilli(this.liIlllllliiIllllll, var6.iliIiiliiiii());
            var4 = iliIiiliiiii(this.IIllllllllIlllllll, var6.lIiiIiIlilli());
            var11 ^= ((long)IIIllIIliIIl(this.iIlllllllIllllllll, var6.lIiiIiIlilli()) << 32 ^ var11) & -1L << 32;
         }

         float var7 = Math.max(Math.max(self.liiiIIllIl(), self.iliIiiliiiii()), Math.max(var3, self.IIlllIlliIll()));
         float var8 = t.IliIlllilIi();
         var11 ^= ((long)(var7 >= var8 - 1.0F ? 1 : 0) ^ var11) & -1L >>> 32;
         var13 ^= ((long)((int)var11 != 0 && !t.Iilllilliill() ? 1 : 0) << 32 ^ var13) & -1L << 32;
         return var7 == self.IliIlllilIi()
               && var3 == self.IlIlllIlilIl()
               && Objects.equals(var4, self.IiIlliIliiIl())
               && (int)(var11 >>> 32) == self.Illlllllilll()
               && (int)(var13 >>> 32) == self.Iilllilliill()
               && (int)var11 == self.IIillIiliIil()
            ? self
            : new IlIillllIill(
               var7,
               self.liiiIIllIl(),
               self.iIlIlllllill(),
               self.IilliliilIIi(),
               self.lIiiIiIlilli(),
               self.iliIiiliiiii(),
               self.IIIllIIliIIl(),
               var3,
               var4,
               self.IIlllIlliIll(),
               (int)(var11 >>> 32),
               (boolean)((int)(var13 >>> 32)),
               (boolean)((int)var11)
            );
      }
   }
}
