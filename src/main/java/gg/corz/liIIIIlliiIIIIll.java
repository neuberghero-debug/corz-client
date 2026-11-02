package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_9334;

public final class liIIIIlliiIIIIll {
   private int ilIiliIlll;
   private boolean iIliliIlll;
   public static final int IIilliIlll = 45;
   public static final int IlilliIlll = 50;
   public static final double llilliIlll = 4.0;
   public static final int lIilliIlll = 40;
   private long iiIiliIlll;
   public static final int ililliIlll = 60;
   private iIIIliIiIlIIliIi lIIiliIlll;
   private final iilllIiIIillIi IiilliIlll;
   private long IIliliIlll;
   private int IiIiliIlll;
   private final illillIlIilillIl liilliIlll;
   private final lIlIiIIliIlIiIIl IIIiliIlll;
   private boolean llIiliIlll;
   private boolean IlliliIlll;
   private lliiIllliliiIlll iIIiliIlll = lliiIllliliiIlll.IiIlllIill;
   private final IIllllIlll iiilliIlll;
   private long lIliliIlll;
   private boolean liIiliIlll;
   private int IlIiliIlll = -1;
   public static final int iIilliIlll = 20;

   static long lIiiIiIlilli(long cooldownUntil, long tick, long gapUntil) {
      long var6 = Math.max(tick, gapUntil);
      return var6 != Long.MIN_VALUE && var6 > cooldownUntil ? var6 - cooldownUntil : 0L;
   }

   private boolean Illillliilli(class_746 p, long tick) {
      long var5 = 7547423697975840942L;
      if (this.lIIiliIlll != null && this.IIIiliIlll.IilliliilIIi(liIIIIlliiIIIIll::Iilililiiili, false) < 0) {
         for (long var7 = var5 ^ (38654705664L ^ var5) & -1L << 32; (int)(var7 >>> 32) <= 35; var7 += 4294967296L) {
            if (Iilililiiili(p.method_31548().method_5438((int)(var7 >>> 32)))) {
               this.lIIiliIlll.IliIlllilIi(lIliliiIlili.liIlIllIliiIlIllIl, tick + 60L);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   static boolean Iilililiiili(class_1799 s) {
      return s != null && (s.method_31574(class_1802.field_8463) || s.method_31574(class_1802.field_8367));
   }

   static boolean liiiIIllIl(lliiIllliliiIlll to, lliiIllliliiIlll using, boolean from) {
      return to == lliiIllliliiIlll.IIllllIill && using == lliiIllliliiIlll.lIllllIill && from;
   }

   private static IlIIIlilllIIIlil iIIIlIlIIl(IIllIIllIllIIl s) {
      return s != null && s.Iiilliiliiil() != null && s.Iiilliiliiil().IliIlllilIi() != null ? s.Iiilliiliiil().IliIlllilIi() : IlIIIlilllIIIlil.iliIiilIil;
   }

   private void IIiilIiiiIii(class_310 mc, class_746 p, boolean using) {
      illIilIilIil.IliIlllilIi(mc.field_1690.field_1904, IillIIIllillIIIl.IliIlllilIi(mc.field_1690.field_1904));
      this.liIiliIlll = false;
      if (liiiIIllIl(lliiIllliliiIlll.IIllllIill, lliiIllliliiIlll.lIllllIill, using) && p.method_6115()) {
         this.iiilliIlll.Illlllllilll(llIIiiililIIiiil.IllliIIiil);
      }
   }

   public lliiIllliliiIlll IIillIiliIil() {
      return this.iIIiliIlll;
   }

   private static boolean IIIIllIIIl(class_1799 s) {
      if (s == null || s.method_7960()) {
         return false;
      } else if (s.method_31574(class_1802.field_8463) || s.method_31574(class_1802.field_8367)) {
         return false;
      } else {
         return !s.method_31574(class_1802.field_8233)
               && !s.method_31574(class_1802.field_8766)
               && !s.method_31574(class_1802.field_8635)
               && !s.method_31574(class_1802.field_8511)
               && !s.method_31574(class_1802.field_8680)
               && !s.method_31574(class_1802.field_8323)
            ? s.method_57826(class_9334.field_50075)
            : false;
      }
   }

   public boolean Illlllllilll() {
      return this.iIIiliIlll == lliiIllliliiIlll.IIllllIill || this.liIiliIlll;
   }

   public boolean Ililllililil() {
      return this.iIIiliIlll == lliiIllliliiIlll.IiIlllIill || this.iIIiliIlll == lliiIllliliiIlll.iIllllIill || this.iIIiliIlll == lliiIllliliiIlll.IlllllIill;
   }

   private int Iliilliiilii(class_746 hunger, boolean gapOk, boolean p) {
      long var6 = 4787790174970647642L;
      if (gapOk) {
         var6 ^= ((long)this.IIIiliIlll.IilliliilIIi(px -> IIIIllIIIl(px) && hunger.method_7332(false), false) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) >= 0 || !p) {
            return (int)(var6 >>> 32);
         }
      }

      if (!p) {
         return -1;
      } else {
         var6 ^= ((long)this.IIIiliIlll.IilliliilIIi(st -> st.method_31574(class_1802.field_8367), false) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)this.IIIiliIlll.IilliliilIIi(st -> st.method_31574(class_1802.field_8463), false) ^ var6) & -1L >>> 32;
         if (gapOk) {
            return (int)var6 >= 0 ? (int)var6 : (int)(var6 >>> 32);
         } else {
            return (int)(var6 >>> 32) >= 0 ? (int)(var6 >>> 32) : (int)var6;
         }
      }
   }

   public void IlIillIiilIi() {
      this.Iilllilliill();
      this.iIIiliIlll = lliiIllliliiIlll.IiIlllIill;
      this.IlIiliIlll = -1;
      this.iiIiliIlll = Long.MIN_VALUE;
      this.IIliliIlll = Long.MIN_VALUE;
      this.lIliliIlll = Long.MIN_VALUE;
      this.iIliliIlll = false;
      this.IlliliIlll = true;
   }

   public int IIIilIIiiIIi() {
      return this.IlIiliIlll;
   }

   private static boolean Iiiiliiiiiii(class_746 slot, int p) {
      if (p >= 0 && p < 9) {
         class_1799 var2 = slot.method_31548().method_5438(p);
         if (var2.method_7960()) {
            return false;
         } else {
            return !var2.method_31574(class_1802.field_8463) && !var2.method_31574(class_1802.field_8367) ? IIIIllIIIl(var2) && slot.method_7332(false) : true;
         }
      } else {
         return false;
      }
   }

   static boolean iIlIlllllill(lliiIllliliiIlll s) {
      return s == lliiIllliliiIlll.IIllllIill;
   }

   public boolean IiIlliIliiIl(boolean hungerOnly) {
      long var8 = -7877672992127204214L;
      if (this.iIIiliIlll != lliiIllliliiIlll.liIlllIill && this.iIIiliIlll != lliiIllliliiIlll.iiIlllIill && this.iIIiliIlll != lliiIllliliiIlll.IIllllIill) {
         class_310 var2 = class_310.method_1551();
         class_746 var3 = var2.field_1724;
         if (var3 == null) {
            return false;
         } else {
            long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
            if (var4 < this.iiIiliIlll) {
               return false;
            } else {
               var8 ^= ((long)IilliliilIIi(var4, this.IIliliIlll, var3.method_7344().method_7586() <= 6) << 32 ^ var8) & -1L << 32;
               var8 ^= ((long)this.Iliilliiilii(var3, hungerOnly, (boolean)((int)(var8 >>> 32))) ^ var8) & -1L >>> 32;
               if ((int)var8 < 0) {
                  if ((int)(var8 >>> 32) != 0) {
                     this.Illillliilli(var3, var4);
                  }

                  return false;
               } else {
                  this.IlIiliIlll = (int)var8;
                  this.llIiliIlll = hungerOnly;
                  this.IlliliIlll = (boolean)((int)(var8 >>> 32));
                  this.iIliliIlll = false;
                  this.ilIiliIlll = 0;
                  this.IiIiliIlll = 0;
                  this.iIIiliIlll = lliiIllliliiIlll.liIlllIill;
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   public long IIIllIIliIIl(long tick) {
      return lIiiIiIlilli(tick, this.iiIiliIlll, this.IIliliIlll);
   }

   private void IIlilIliiIli(boolean tick, long finished) {
      long var4 = lIllilIliIllilIl.IIlllIlliIll(this.iIliliIlll, tick, this.ilIiliIlll, finished);
      if (var4 > finished) {
         if (tick) {
            this.IIliliIlll = Math.max(this.IIliliIlll, var4);
         } else {
            this.iiIiliIlll = Math.max(this.iiIiliIlll, var4);
         }
      }
   }

   static lliiIllliliiIlll IliIlllilIi(lliiIllliliiIlll s, boolean slotStable, boolean abort, boolean mayAct, int using, boolean useTicks) {
      if (s == null) {
         return lliiIllliliiIlll.IiIlllIill;
      } else {
         return switch (s) {
            case iiIlllIill -> lliiIllliliiIlll.IiIlllIill;
            case liIlllIill -> useTicks ? lliiIllliliiIlll.IlllllIill : (slotStable ? lliiIllliliiIlll.iiIlllIill : lliiIllliliiIlll.liIlllIill);
            case iIllllIill -> useTicks
            ? lliiIllliliiIlll.IlllllIill
            : (
               !slotStable
                  ? lliiIllliliiIlll.liIlllIill
                  : (!abort ? lliiIllliliiIlll.iiIlllIill : (mayAct ? lliiIllliliiIlll.IIllllIill : lliiIllliliiIlll.IlllllIill))
            );
            case IiIlllIill -> !useTicks && mayAct && using <= 45 ? lliiIllliliiIlll.IIllllIill : lliiIllliliiIlll.lIllllIill;
            case IIllllIill -> lliiIllliliiIlll.iIllllIill;
            case lIllllIill, IlllllIill -> lliiIllliliiIlll.IiIlllIill;
         };
      }
   }

   public lliiIllliliiIlll IIlllIlliIll(boolean abort) {
      long var13 = 1638767349057002244L;
      long var15 = -6935923165511463510L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      if (var3 != null && var2.field_1761 != null && var2.field_1690 != null) {
         long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
         switch (this.iIIiliIlll) {
            case iiIlllIill:
               return lliiIllliliiIlll.IiIlllIill;
            case liIlllIill:
            case iIllllIill:
            case IiIlllIill:
            default:
               if (this.iIIiliIlll == lliiIllliliiIlll.liIlllIill) {
                  var13 ^= ((long)(Iiiiliiiiiii(var3, this.IlIiliIlll) && this.IIIiliIlll.lIiiIiIlilli(this.IlIiliIlll, false) ? 1 : 0) << 32 ^ var13)
                     & -1L << 32;
                  if (!Iiiiliiiiiii(var3, this.IlIiliIlll)) {
                     var13 ^= ((long)this.Iliilliiilii(var3, this.llIiliIlll, this.IlliliIlll) ^ var13) & -1L >>> 32;
                     if ((int)var13 < 0) {
                        return this.IiIiliIiiiIi(var4);
                     }

                     this.IlIiliIlll = (int)var13;
                     var13 ^= ((long)this.IIIiliIlll.lIiiIiIlilli(this.IlIiliIlll, false) << 32 ^ var13) & -1L << 32;
                  }

                  if (++this.IiIiliIlll > 20) {
                     return this.IiIiliIiiiIi(var4);
                  }

                  lliiIllliliiIlll var7 = IliIlllilIi(lliiIllliliiIlll.liIlllIill, (boolean)((int)(var13 >>> 32)), false, false, 0, abort);
                  if (var7 == lliiIllliliiIlll.IlllllIill) {
                     return this.IiIiliIiiiIi(var4);
                  }

                  this.iIIiliIlll = var7;
                  if (this.iIIiliIlll == lliiIllliliiIlll.liIlllIill) {
                     return this.iIIiliIlll;
                  }
               }

               if (this.iIIiliIlll == lliiIllliliiIlll.iiIlllIill) {
                  if (++this.IiIiliIlll > 20) {
                     return this.IiIiliIiiiIi(var4);
                  } else {
                     var13 ^= ((long)(this.liilliIlll.IlIlllIlilIl(this.IlIiliIlll) && Iiiiliiiiiii(var3, this.IlIiliIlll) ? 1 : 0) << 32 ^ var13) & -1L << 32;
                     var13 ^= ((long)((int)(var13 >>> 32) != 0 && !abort && this.liilliIlll.liiiIIllIl() && this.liilliIlll.IiIlliIliiIl() ? 1 : 0) ^ var13)
                        & -1L >>> 32;
                     var15 ^= (0L ^ var15) & -1L << 32;
                     if ((int)var13 != 0) {
                        class_1269 var9;
                        try (IlIIiiIillIIiiIi var10 = this.liilliIlll.IIlllIlliIll()) {
                           var9 = var2.field_1761.method_2919(var3, class_1268.field_5808);
                        }

                        var15 ^= ((long)(var9 != null && var9.method_23665() && var3.method_6115() ? 1 : 0) << 32 ^ var15) & -1L << 32;
                        if ((int)(var15 >>> 32) != 0) {
                           illIilIilIil.IliIlllilIi(var2.field_1690.field_1904, true);
                           this.liIiliIlll = true;
                           this.ilIiliIlll = 0;
                           this.iIliliIlll = Iilililiiili(var3.method_31548().method_5438(this.IlIiliIlll));
                           this.IiilliIlll.Illlllllilll(IiilIiIiliilIiIi.ilIllIiIIi, 50);
                        }
                     }

                     lliiIllliliiIlll var19 = IliIlllilIi(
                        lliiIllliliiIlll.iiIlllIill, (boolean)((int)(var13 >>> 32)), (boolean)((int)var13), (boolean)((int)(var15 >>> 32)), 0, abort
                     );
                     if (var19 == lliiIllliliiIlll.IlllllIill) {
                        return this.IiIiliIiiiIi(var4);
                     } else {
                        if (var19 == lliiIllliliiIlll.liIlllIill) {
                           this.IIIiliIlll.lIiiIiIlilli(this.IlIiliIlll, false);
                        }

                        this.iIIiliIlll = var19;
                        return this.iIIiliIlll;
                     }
                  }
               } else if (this.iIIiliIlll == lliiIllliliiIlll.IIllllIill) {
                  var13 ^= ((long)var3.method_6115() << 32 ^ var13) & -1L << 32;
                  var13 ^= ((long)(var3.method_31548().method_67532() != this.IlIiliIlll ? 1 : 0) ^ var13) & -1L >>> 32;
                  this.ilIiliIlll++;
                  lliiIllliliiIlll var8 = IliIlllilIi(
                     lliiIllliliiIlll.IIllllIill, true, true, (boolean)((int)(var13 >>> 32)), this.ilIiliIlll, abort || (int)var13 != 0
                  );
                  if (var8 == lliiIllliliiIlll.lIllllIill) {
                     this.IIiilIiiiIii(var2, var3, (boolean)((int)(var13 >>> 32)));
                     this.IIlilIliiIli((int)(var13 >>> 32) == 0, var4);
                     this.lIliliIlll = var4;
                     this.iIIiliIlll = lliiIllliliiIlll.iIllllIill;
                     return lliiIllliliiIlll.lIllllIill;
                  } else {
                     illIilIilIil.IliIlllilIi(var2.field_1690.field_1904, true);
                     this.liIiliIlll = true;
                     this.IiilliIlll.Illlllllilll(IiilIiIiliilIiIi.ilIllIiIIi, 50);
                     return lliiIllliliiIlll.IIllllIill;
                  }
               } else {
                  return this.iIIiliIlll;
               }
            case IIllllIill:
               this.iIIiliIlll = lliiIllliliiIlll.iIllllIill;
               return lliiIllliliiIlll.iIllllIill;
            case lIllllIill:
            case IlllllIill:
               lliiIllliliiIlll var6 = this.iIIiliIlll;
               this.iIIiliIlll = lliiIllliliiIlll.IiIlllIill;
               return var6 == lliiIllliliiIlll.IlllllIill ? lliiIllliliiIlll.IiIlllIill : lliiIllliliiIlll.iIllllIill;
         }
      } else {
         this.Iilllilliill();
         return this.iIIiliIlll;
      }
   }

   private lliiIllliliiIlll IiIiliIiiiIi(long tick) {
      class_310 var3 = class_310.method_1551();
      if (this.liIiliIlll && var3.field_1690 != null) {
         illIilIilIil.IliIlllilIi(var3.field_1690.field_1904, IillIIIllillIIIl.IliIlllilIi(var3.field_1690.field_1904));
      }

      this.liIiliIlll = false;
      this.iiIiliIlll = tick + 40L;
      this.iIIiliIlll = lliiIllliliiIlll.IlllllIill;
      return lliiIllliliiIlll.IlllllIill;
   }

   public void iliIiiliiiii(iIIIliIiIlIIliIi k) {
      this.lIIiliIlll = k;
   }

   public IilliIIllilliIIl IlIlllIlilIl(IIllIIllIllIIl s) {
      long var11 = -5690784795827057297L;
      long var13 = 5956473924419294658L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      if (var3 == null) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IIIIiiIiil, lIlIliIlIl<"lIlIliIlIl","UG1UHoF9+4S1XHOuBcPbYVR1D1AiNtpRL2scFLs+n4f9gBMXbQ==">());
      } else if (this.iIIiliIlll != lliiIllliliiIlll.liIlllIill
         && this.iIIiliIlll != lliiIllliliiIlll.iiIlllIill
         && this.iIIiliIlll != lliiIllliliiIlll.IIllllIill) {
         long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (var4 < this.iiIiliIlll) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IIIIiiIiil, lIlIliIlIl<"lIlIliIlIl","R0m4Q/2dvb8X0E+CIgZjHrdI6/jFSj9+dO32fkxF0o5F9I3T">());
         } else {
            lliiilIiiliiilIi var6 = s == null ? null : s.IlIlllIlilIl();
            var11 ^= ((long)(var6 != null && !lIllilIliIllilIl.lIiiIiIlilli(var6, iIIIlIlIIl(s)) && lIllilIliIllilIl.iliIiiliiiii(var6) ? 1 : 0) << 32 ^ var11)
               & -1L << 32;
            var11 ^= ((long)IilliliilIIi(var4, this.IIliliIlll, lIllilIliIllilIl.IIIllIIliIIl(var6)) ^ var11) & -1L >>> 32;
            var13 ^= ((long)this.Iliilliiilii(var3, (boolean)((int)(var11 >>> 32)), (boolean)((int)var11)) << 32 ^ var13) & -1L << 32;
            if ((int)(var13 >>> 32) < 0) {
               if ((int)var11 == 0 && this.Iliilliiilii(var3, (boolean)((int)(var11 >>> 32)), true) >= 0) {
                  return IilliIIllilliIIl.IliIlllilIi(
                     iIlIIIIiIllIIIIi.IIIIiiIiil, lIlIliIlIl<"lIlIliIlIl","R0m4Q/2dvb8X0E+CIgZjHrdI6/jFSj9+dO32fkxF0o5F9I3T">()
                  );
               } else {
                  return (int)var11 != 0 && lIllilIliIllilIl.IlIlllIlilIl(var6, iIIIlIlIIl(s)) && this.Illillliilli(var3, var4)
                     ? IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IIIIiiIiil, lIlIliIlIl<"lIlIliIlIl","H0640YgADTDIHkfm97/9P1oeioZL9LfSuh0bXBlvoY5B">())
                     : IilliIIllilliIIl.IliIlllilIi(
                        iIlIIIIiIllIIIIi.IIIIiiIiil,
                        (int)var11 != 0
                           ? lIlIliIlIl<"lIlIliIlIl","uUXPVZTtKFW6zN93z9nYkB24R/VEvfweFtkL/IXs5q0DYFo=">()
                           : lIlIliIlIl<"lIlIliIlIl","R0m4Q/2dvb8X0E+CIgZjHrdI6/jFSj9+dO32fkxF0o5F9I3T">()
                     );
               }
            } else {
               var13 ^= ((long)(var3.method_31548().method_67532() == (int)(var13 >>> 32) ? 0 : 2) ^ var13) & -1L >>> 32;
               return new IilliIIllilliIIl(
                  iIlIIIIiIllIIIIi.IIIIiiIiil,
                  true,
                  4.0,
                  (int)var13 + 32,
                  false,
                  false,
                  (int)(var11 >>> 32) != 0
                     ? lIlIliIlIl<"lIlIliIlIl","Dn3nrohIuloma3c9Z95sVRVncmI+GIrlM3lKqyncnhY=">()
                     : lIlIliIlIl<"lIlIliIlIl","OqvqZt2p7NNUYupngstzYYHXIkWTiaJCaUEAgs1cUpBc5g==">()
               );
            }
         }
      } else {
         return new IilliIIllilliIIl(
            iIlIIIIiIllIIIIi.IIIIiiIiil, true, 4.0, 0, false, false, lIlIliIlIl<"lIlIliIlIl","wU2umblXfKIv2WSVahrFG27/lBaNc58ul+jCXll9qshotQ==">()
         );
      }
   }

   public boolean Iiilliiliiil() {
      return this.lIliliIlll == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   public void Iilllilliill() {
      long var6 = -4004029246416950642L;
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      var6 ^= (
            (long)(this.iIIiliIlll != lliiIllliliiIlll.IIllllIill && this.iIIiliIlll != lliiIllliliiIlll.iiIlllIill && !this.liIiliIlll ? 0 : 1) << 32 ^ var6
         )
         & -1L << 32;
      if ((int)(var6 >>> 32) != 0 && var1.field_1690 != null) {
         illIilIilIil.IliIlllilIi(var1.field_1690.field_1904, IillIIIllillIIIl.IliIlllilIi(var1.field_1690.field_1904));
         if (var2 != null && var2.method_6115() && this.iIIiliIlll == lliiIllliliiIlll.IIllllIill) {
            this.iiilliIlll.Illlllllilll(llIIiiililIIiiil.IllliIIiil);
         }
      }

      this.liIiliIlll = false;
      if (this.iIIiliIlll != lliiIllliliiIlll.IiIlllIill) {
         if (this.iIIiliIlll == lliiIllliliiIlll.IIllllIill) {
            long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
            this.lIliliIlll = var4;
            this.IIlilIliiIli(var2 != null && !var2.method_6115(), var4);
         }

         this.iIIiliIlll = lliiIllliliiIlll.IiIlllIill;
      }

      this.ilIiliIlll = 0;
      this.IiIiliIlll = 0;
   }

   static boolean IilliliilIIi(long tick, long gapUntil, boolean starving) {
      return tick >= gapUntil || starving;
   }

   public liIIIIlliiIIIIll(iilllIiIIillIi aim, illillIlIilillIl ledger, IIllllIlll gates, lIlIiIIliIlIiIIl slots) {
      this.iiIiliIlll = Long.MIN_VALUE;
      this.IIliliIlll = Long.MIN_VALUE;
      this.lIliliIlll = Long.MIN_VALUE;
      this.IlliliIlll = true;
      this.IiilliIlll = aim;
      this.liilliIlll = ledger;
      this.iiilliIlll = gates;
      this.IIIiliIlll = slots;
   }
}
