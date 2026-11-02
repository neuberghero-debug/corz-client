package gg.corz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class lIlIillliIlIilll implements iiIIilllIIlIilll {
   public static final double liiIIIlill = 0.75;
   private int IIIiIIlill;
   private long illiIIlill;
   private lIlIiiIliIlIiiIl liIiIIlill;
   private IilliIIllilliIIl iIIiIIlill;
   private class_243 ilIiIIlill;
   private final lIiiililiIiiilil lillIIlill;
   private int llIiIIlill;
   public static final float ilIlIIlill = 2.0F;
   private boolean llliIIlill;
   private final lIlIiIIliIlIiIIl IillIIlill;
   private long iiilIIlill;
   public static final double iIllIIlill = 2.0;
   public static final double IIllIIlill = 0.1;
   public static final int lliIIIlill = 60;
   public static final double liIlIIlill = 6.0;
   public static final float IlIlIIlill = 6.0F;
   private boolean lIilIIlill = true;
   public static final int iIIlIIlill = 32;
   private liiilIiliiiilIil llilIIlill;
   private int ililIIlill;
   private illlliIlIillliIl IlilIIlill = illlliIlIillliIl.IilIiiiIll;
   private long IlIiIIlill;
   private final Object IlllIIlill;
   private boolean IIliIIlill;
   public static final float IiIlIIlill = 0.5F;
   private boolean lIIiIIlill;
   private boolean lIliIIlill;
   private boolean iIilIIlill;
   private IlliIlillliIli iiIiIIlill;
   public static final float iiIlIIlill = 20.0F;
   private final IIIIillllIIIilll iillIIlill;
   private boolean IlliIIlill;
   public static final float llIlIIlill = 4.0F;
   private IlliIlllllliIlll IiilIIlill = IlliIlllllliIlll.IiiIIlIill;
   private final Map<Integer, int[]> liilIIlill = new HashMap<>();
   private boolean IIilIIlill;
   private long IiIiIIlill;
   public static final double iiiIIIlill = 6.0;
   private boolean iIliIIlill;
   public static final int lIIlIIlill = 40;
   public static final double IiiIIIlill = 1.62;
   private final iilllIiIIillIi llllIIlill;
   private final illillIlIilillIl illlIIlill;
   public static final float IIIlIIlill = 11.0F;
   public static final double iliIIIlill = 3.2;
   public static final String lIllIIlill = "held";

   private void iiiIlIIIll(int tick, long id) {
      int[] var4 = this.liilIIlill.get(tick);
      if (var4 == null) {
         if (this.liilIIlill.size() >= 32) {
            this.lIIlliIIll(id);
         }

         this.liilIIlill.put(tick, new int[]{1, (int)(id & 2147483647L)});
      } else {
         var4[0]++;
         var4[1] = (int)(id & 2147483647L);
      }
   }

   private static boolean ilIllIiIll(liiilIiliiiilIil t) {
      return t.IllIllllIl() || !t.Iilililiiili();
   }

   static IilliIIllilliIIl iIlllIllll(IilliIIllilliIIl o, IlliIlillliIli obsidian, boolean kind, boolean crystals) {
      if (o == null) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iliiliIiil, Illillllil<"Illillllil","9l5XA8ZklMVhHZBSI6yf5OAZNrv9vzXZP/PaECcwjmM=">());
      } else {
         return lllllillll(obsidian, false, kind, crystals)
            ? o
            : IilliIIllilliIIl.IliIlllilIi(
               iIlIIIIiIllIIIIi.iliiliIiil,
               kind
                  ? Illillllil<"Illillllil","sYpAD1ymuYdwj+5jWctDrwcCRzy87m83lSTmDoN10y/dnB4kGnbO">()
                  : Illillllil<"Illillllil","aN/jOBYS0nFjGRDDWq5Dck3xbr+hIo9769qg6GHMT1h7neziAHH/">()
            );
      }
   }

   static int IIllllIlll(IlliIlillliIli reattack, int kind) {
      if (reattack == null) {
         return kind;
      } else {
         return switch (reattack) {
            case iliiIlIIIl -> 0;
            case lliiIlIIIl -> kind;
            case IiiiIlIIIl -> 1 + kind;
         };
      }
   }

   private boolean ilillIiill() {
      return this.IillIIlill.IilliliilIIi(st -> st.method_31574(class_1802.field_8301), false) >= 0;
   }

   @Override
   public float[] IliIlllilIi(float fromPitch, float toYaw, float toPitch, float fromYaw, boolean settle) {
      return this.llllIIlill.IlIillIiilIi(fromPitch, toYaw, toPitch, fromYaw, settle ? IIIliIilIIliIi.illIIiliiIilIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii);
   }

   private void lliIliliIl(liiilIiliiiilIil t, class_1511 crystal, long known, float[] tick) {
      long var10 = -3759379531020231587L;
      class_1309 var6 = t.lIiiIiIlilli();
      float var7;
      float var8;
      if (tick != null) {
         var7 = tick[0];
         var8 = tick[1];
      } else {
         iIIlIIiIlIlIIi var9 = lllIliIlillIliIl.iIIilIlIil(var6, 1, false, true);
         var7 = lllIliIlillIliIl.IlIllllIll(var6, crystal.method_73189(), var9.IliIlllilIi(), var9.liiiIIllIl(), null, null, 6.0F);
         var8 = iiIiiliIIliili.lIiiIiIlilli(var7, t.IlIillIiilIi());
      }

      var10 ^= ((long)((int)Math.ceil(Math.max(0.0, (double)illIllilIilIllil.IIIllIIliIIl()) / 50.0)) << 32 ^ var10) & -1L << 32;
      if (this.lillIIlill != null) {
         this.lillIIlill.IilliliilIIi(t.iIlIlllllill(), known, (int)(var10 >>> 32) + 3);
      }

      if (this.iillIIlill != null) {
         this.iillIIlill.iIlIlllllill(t.iIlIlllllill(), known, var7, var8);
      }
   }

   static boolean IIlilIliiIli(boolean spam, boolean tempo, boolean reattack, boolean directed, int targetReadyIn, int excessGood) {
      return spam && !tempo && !reattack && !directed && targetReadyIn > excessGood + 2;
   }

   static boolean liIlliiIll(boolean open, boolean wasOpen, boolean wasTrading, boolean trading) {
      return open != wasOpen || open && wasTrading != trading;
   }

   private void lIIlliIIll(long tick) {
      long var7 = 5303174690673391792L;
      var7 ^= ((long)((int)(tick & 2147483647L)) << 32 ^ var7) & -1L << 32;
      Iterator var4 = this.liilIIlill.entrySet().iterator();

      while (var4.hasNext()) {
         int[] var5 = (int[])((Entry)var4.next()).getValue();
         var7 ^= ((long)((int)(var7 >>> 32) - var5[1]) ^ var7) & -1L >>> 32;
         if ((int)var7 < 0 || (int)var7 > 40) {
            var4.remove();
         }
      }
   }

   static boolean IiIiliIiiiIi(boolean directed, boolean excessGood, boolean reattack, int tempo, int targetReadyIn) {
      return IIlilIliiIli(directed, false, excessGood, reattack, tempo, targetReadyIn);
   }

   public lIlIillliIlIilll(Object owner, iilllIiIIillIi slots, illillIlIilillIl enemies, lIlIiIIliIlIiIIl gates, lIiiililiIiiilil clock, IIIIillllIIIilll aim) {
      this.iiilIIlill = Long.MIN_VALUE;
      this.IIIiIIlill = -1;
      this.IlIiIIlill = Long.MIN_VALUE;
      this.llIiIIlill = -1;
      this.illiIIlill = Long.MIN_VALUE;
      this.IlllIIlill = owner;
      this.llllIIlill = slots;
      this.illlIIlill = enemies;
      this.IillIIlill = gates;
      this.lillIIlill = clock;
      this.iillIIlill = aim;
   }

   public illlliIlIillliIl lilIliilIl() {
      return this.IlilIIlill;
   }

   @Override
   public boolean IIIllIIliIIl(int slot) {
      return this.IillIIlill.IiIlliIliiIl(slot, IIllIIlilIllIIli.IlIlllIlilIl());
   }

   private static iIIlIIiIlIlIIi liilliiill(lliiilIiiliiilIi self) {
      class_243 var1 = self.lIiiIiIlilli() == null ? class_243.field_1353 : self.lIiiIiIlilli();
      class_243 var2 = new class_243(var1.field_1352 * 2.0, 0.0, var1.field_1350 * 2.0);
      if (!(var2.method_1027() < 1.0E-6) && self.liiiIIllIl() != null && self.IilliliilIIi() != null) {
         return new iIIlIIiIlIlIIi(self.liiiIIllIl().method_1019(var2), self.IilliliilIIi().method_997(var2));
      } else {
         return self.liiiIIllIl() != null && self.IilliliilIIi() != null ? new iIIlIIiIlIlIIi(self.liiiIIllIl(), self.IilliliilIIi()) : null;
      }
   }

   static float IIiilIiiiIii(float ehp) {
      return Float.isFinite(ehp) && !(ehp <= 0.0F) ? Math.max(0.5F, Math.min(2.0F, ehp)) : 2.0F;
   }

   public static ilIIllIiIiIIllIi IiIIlliIIl(llillIIlilillIIl step) {
      if (step == null) {
         return null;
      } else {
         iIIlIIiIlIlIIi var1 = step.IIIllIIliIIl() != null && step.IlIlllIlilIl() != null ? new iIIlIIiIlIlIIi(step.IIIllIIliIIl(), step.IlIlllIlilIl()) : null;
         return new ilIIllIiIiIIllIi(
            step.IliIlllilIi(),
            step.liiiIIllIl(),
            step.iIlIlllllill(),
            step.IilliliilIIi(),
            step.lIiiIiIlilli(),
            step.iliIiiliiiii(),
            var1,
            step.IiIlliIliiIl(),
            step.IIlllIlliIll()
         );
      }
   }

   private static long IIIillIIil(class_310 t, class_1309 mc) {
      long var8 = -1096528616145029464L;
      class_238 var2 = mc.method_5829().method_1014(6.0);
      long var3 = 1469598103934665603L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for (class_1511 var7 : t.field_1687.method_8390(class_1511.class, var2, x -> x.method_5805() && !x.method_31481())) {
         var3 += (long)var7.method_5628() * 1099511628211L;
         var8 += 4294967296L;
      }

      return var3 * 31L + (long)((int)(var8 >>> 32));
   }

   @Override
   public boolean iIlIlllllill() {
      return this.llllIIlill.iliIiiliiiii();
   }

   public IlliIlllllliIlll IllIllllIl() {
      return this.IiilIIlill;
   }

   static boolean Iilililiiili(boolean awaitingTotem, boolean spam, boolean face) {
      return !spam && (awaitingTotem || face);
   }

   static boolean IIIIllIIIl(IIIilIIiiIIi a, liiilIiliiiilIil t) {
      return a != null && t != null && a.IliIlllilIi() && a.Iiilliiliiil() && a.IIillIiliIil() == t.iIlIlllllill();
   }

   @Override
   public void liiiIIllIl(float pitch, float yaw) {
      this.llllIIlill.Iilllilliill(IiilIiIiliilIiIi.IIIllIiIIi, pitch, yaw, 60);
   }

   private boolean IlIllllIll(class_2338 base) {
      if (base == null) {
         return false;
      } else {
         iiIIiiIlIIlIiiIl var2 = llIililIil();
         lIIiIiiIIiIi var3 = var2 == null ? null : var2.lIilliIill();
         return var3 != null && var3.IIillIiliIil(base.method_10063(), IIIiillllIIiilll.IliIlllilIi());
      }
   }

   public iiilililIIIiilil IIillIiliIil(IIllIIllIllIIl veto, IiiIliliiIli s, Predicate<class_243> d) {
      long var21 = 6166621817516230467L;
      long var23 = -5810311961363938962L;
      long var25 = -4913450272166938991L;
      long var27 = 7628856643899100117L;
      if (veto == null) {
         return null;
      } else {
         liiilIiliiiilIil var4 = veto.IiIlliIliiIl();
         lliiilIiiliiilIi var5 = veto.IlIlllIlilIl();
         if (var4 != null && var4.lIiiIiIlilli() != null && var5 != null) {
            lIiillIiiIiillIi var6 = lIiillIiiIiillIi.IliIlllilIi();
            IlIIIlilllIIIlil var7 = veto.Iiilliiliiil() != null && veto.Iiilliiliiil().IliIlllilIi() != null
               ? veto.Iiilliiliiil().IliIlllilIi()
               : IlIIIlilllIIIlil.iliIiilIil;
            this.lIilIIlill = var7 != IlIIIlilllIIIlil.liiIiilIil;
            ilIiliilIiIiliil var8 = veto.IliIlllilIi();
            this.iIilIIlill = Illillliilli(var7, var4.Illlllllilll());
            if (var8.iIIIlIlIIl()) {
               this.iIilIIlill = true;
            }

            var21 ^= ((long)(s != null && s.IliIlllilIi() == iIllIliIlllIli.IiliIIIIIl ? 1 : 0) << 32 ^ var21) & -1L << 32;
            var21 ^= ((long)IIIilIIiiIIi(veto.Iilllilliill(), var4.llIIlilIIl()) ^ var21) & -1L >>> 32;
            float var11;
            if (s != null) {
               float var13 = s.iIlIlllllill() == null ? var6.Iliilliiilii() : s.iIlIlllllill().liiiIIllIl();
               float var14 = this.lIilIIlill && (int)(var21 >>> 32) == 0
                  ? Math.max(s.IIIllIIliIIl(), Iiilliiliiil(var7, Iliilliiilii(var4.IIlllIlliIll(), var4.IlIlllIlilIl()), var4.Illlllllilll()))
                  : s.IIIllIIliIIl();
               var6 = var6.lIiiIiIlilli(var14).iliIiiliiiii(s.IlIlllIlilIl()).IIIllIIliIIl(var13);
               var11 = s.IiIlliIliiIl();
               var23 ^= ((long)s.IIlllIlliIll() << 32 ^ var23) & -1L << 32;
            } else {
               var11 = illIIIIlIilIIIIl.liiiIIllIl(var5.IIIllIIliIIl(), var5.IlIlllIlilIl(), var5.Iilllilliill(), veto.IIlilIliiIli(), 11.0F, var8);
               var23 ^= (0L ^ var23) & -1L << 32;
            }

            if (this.lIilIIlill) {
               var6 = var6.Iilllilliill(veto.iIIIlIlIIl(), Iiiiliiiiiii(var7, var5, var4));
            }

            if (var8.iIIIlIlIIl()) {
               var6 = Ililllililil(var6, var8);
            }

            ilIIllIiIiIIllIi var30 = s != null && s.Iiilliiliiil() != null && !s.IIIilIIiiIIi() && s.Iiilliiliiil().IlIlllIlilIl() != null
               ? IiIIlliIIl(s.Iiilliiliiil().IlIlllIlilIl())
               : null;
            var6 = var6.IlIlllIlilIl(this.lIilIIlill && (int)(var21 >>> 32) == 0 && !var4.liiiIIllIl() && var30 == null);
            if (Iliilliiilii(var4.IIlllIlliIll(), var4.IlIlllIlilIl())) {
               var6 = var6.IiIlliIliiIl(1.05);
            }

            var23 ^= ((long)liiIIliliiiIIlil.IIiilIiiiIii(var5.lilIliilIl()) ^ var23) & -1L >>> 32;
            var25 ^= ((long)IlIillIiilIi((int)var21 != 0 || this.iIilIIlill, veto.Iilllilliill(), (int)var23) << 32 ^ var25) & -1L << 32;
            if (IIlilIliiIli(this.lIilIIlill, this.iIilIIlill, var30 != null, (boolean)((int)var21), veto.Iilllilliill(), (int)var23)) {
               var6 = iilllIIill(var6);
            }

            class_243 var16 = var4.iIiIlIliIl() == null ? class_243.field_1353 : var4.iIiIlIliIl();
            float var17 = var4.Illillliilli() > 0.0F && Float.isFinite(var4.Illillliilli()) ? var4.Illillliilli() : 1.0F;
            var25 ^= ((long)this.ilillIiill() ^ var25) & -1L >>> 32;
            if ((int)var25 == 0) {
               var6 = iilllIIill(var6);
            }

            if ((int)var25 != 0 && Iilililiiili(this.iIilIIlill, (boolean)((int)(var21 >>> 32)), var4.IllIllllIl())) {
               var6 = var6.IilliliilIIi(IIiilIiiiIii(var4.IliIlllilIi() / var17));
            }

            var27 ^= ((long)((int)var25 == 0 || veto.Iiilliiliiil() != null && !veto.Iiilliiliiil().IIIllIIliIIl() ? 0 : 1) << 32 ^ var27) & -1L << 32;
            var27 ^= ((long)(var8.iIIIlIlIIl() && var30 != null && var30.IilliliilIIi() ? 0 : veto.Iilllilliill()) ^ var27) & -1L >>> 32;
            return new iiilililIIIiilil(
               var4.lIiiIiIlilli(),
               var6,
               var11,
               (boolean)((int)(var23 >>> 32)),
               (boolean)((int)(var27 >>> 32)),
               (int)(var25 >>> 32),
               var16,
               liilliiill(var5),
               new IilIlIIllilIlIIl((int)var27, var4.llIIlilIIl()),
               new IilIlIIllilIlIIl(veto.IIillIiliIil(), var5.iIIIlIlIIl()),
               var4.IliIlllilIi() / var17,
               var4.Iilililiiili(),
               d,
               var30
            );
         } else {
            return null;
         }
      }
   }

   public IlliIlllllliIlll lIlIliIlIl(iiilililIIIiilil useTick, boolean policy, illlliIlIillliIl order, liiilIiliiiilIil targetReadyIn, int target) {
      this.IlilIIlill = order == null ? illlliIlIillliIl.IilIiiiIll : order;
      this.llilIIlill = targetReadyIn;
      this.ililIIlill = target;
      iiIIiiIlIIlIiiIl var6 = llIililIil();
      if (var6 != null && this.IIlllIlliIll()) {
         long var7 = IIllIIlilIllIIli.IlIlllIlilIl();
         this.lIIlliIIll(var7);
         this.IiilIIlill = useTick == null ? var6.ilillIiill() : var6.Iillllilll(useTick, policy);
         if (useTick != null && policy) {
            this.illiIIlill = var7;
         }

         if (this.IiilIIlill == null) {
            this.IiilIIlill = IlliIlllllliIlll.IiiIIlIill;
         }

         return this.IiilIIlill;
      } else {
         this.IiilIIlill = IlliIlllllliIlll.IiiIIlIill;
         return this.IiilIIlill;
      }
   }

   @Override
   public boolean iliIiiliiiii() {
      return true;
   }

   public void Iilllilliill() {
      iiIIiiIlIIlIiiIl var1 = llIililIil();
      if (var1 != null) {
         var1.iIlllIllll(this.IlllIIlill);
      }

      this.IIilIIlill = false;
      this.llilIIlill = null;
      this.IlilIIlill = illlliIlIillliIl.IilIiiiIll;
      this.IiilIIlill = IlliIlllllliIlll.IiiIIlIill;
      this.iIIilIlIil();
   }

   static float Iiilliiliiil(IlIIIlilllIIIlil grounded, boolean style, double distance) {
      long var5 = 7929500214052440920L;
      var5 ^= ((long)(Double.isFinite(distance) && distance <= 6.0 ? 1 : 0) << 32 ^ var5) & -1L << 32;
      return grounded == IlIIIlilllIIIlil.iliIiilIil && style && (int)(var5 >>> 32) != 0 ? 4.0F : 6.0F;
   }

   @Override
   public boolean IilliliilIIi(IIiiilIilIiiilIi action) {
      long var8 = 3408463247124756594L;
      long var10 = 2747106195841098287L;
      var8 ^= ((long)(action != null && action.lIiiIiIlilli() != IlliIlillliIli.iliiIlIIIl ? 1 : 0) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) != 0 ? this.illlIIlill.lIiiIiIlilli() : this.illlIIlill.iIlIlllllill()) {
         if (action != null && action.lIiiIiIlilli() == IlliIlillliIli.iliiIlIIIl) {
            class_1511 var3 = action.IiIlliIliiIl();
            if (var3 == null) {
               return false;
            } else {
               long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
               var8 ^= ((long)var3.method_5628() ^ var8) & -1L >>> 32;
               if (this.iiilIIlill == var4 && this.IIIiIIlill == (int)var8) {
                  return this.lIIiIIlill;
               } else {
                  var10 ^= ((long)this.iIiIlIliIl(var3, var4) << 32 ^ var10) & -1L << 32;
                  this.iiilIIlill = var4;
                  this.IIIiIIlill = (int)var8;
                  this.lIIiIIlill = (boolean)((int)(var10 >>> 32));
                  return (boolean)((int)(var10 >>> 32));
               }
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean Ilillllill(IlliIlillliIli base, class_2338 kind) {
      return base == IlliIlillliIli.IiiiIlIIIl && kind != null && lllIliIlillIliIl.IliIlllilIi(kind);
   }

   static boolean Iillllilll(long tick, long lastUseTick) {
      return tick != Long.MIN_VALUE && tick <= lastUseTick && tick >= lastUseTick - 1L;
   }

   static boolean lllllillll(IlliIlillliIli obsidian, boolean built, boolean crystals, boolean kind) {
      if (obsidian == null) {
         return crystals;
      } else {
         return switch (obsidian) {
            case iliiIlIIIl -> true;
            case lliiIlIIIl -> crystals;
            case IiiiIlIIIl -> crystals && (built || kind);
         };
      }
   }

   public int IIiIllIiIl(int crystalId) {
      int[] var2 = this.liilIIlill.get(crystalId);
      return var2 == null ? 0 : var2[0];
   }

   static lIiillIiiIiillIi Ililllililil(lIiillIiiIiillIi t, ilIiliilIiIiliil tm) {
      return t != null && tm != null && tm.iIIIlIlIIl() ? t.IIlllIlliIll(tm).lIiiIiIlilli(1.0F).iliIiiliiiii(tm.IIlilIliiIli(t.IiIIlliIIl())) : t;
   }

   public boolean illIlIilIl() {
      return this.lIilIIlill;
   }

   public IilliIIllilliIIl iiIIlIIlIl(IIllIIllIllIIl probe, iiilililIIIiilil s) {
      long var33 = 5774013770075823018L;
      long var35 = 6657949972307763413L;
      long var37 = -706417188424935117L;
      long var39 = -2383731782164841582L;
      long var41 = 4165306430798358447L;
      long var43 = 1060613875362118001L;
      long var31 = 918311823062427291L;
      if (!this.IIlllIlliIll()) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iliiliIiil, Illillllil<"Illillllil","4hgHBhzpluKG/wVAx0KtumFVCoh0WKKw3On/SBFM0mA=">());
      } else {
         class_310 var3 = class_310.method_1551();
         class_746 var4 = var3.field_1724;
         if (var4 == null || var3.field_1687 == null) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iliiliIiil, Illillllil<"Illillllil","4hgHBhzpluKG/wVAx0KtumFVCoh0WKKw3On/SBFM0mA=">());
         } else if (!lllIliIlillIliIl.IiIiliIiiiIi()) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iliiliIiil, Illillllil<"Illillllil","zISMCwb0jC48cmFlgZbsc9NaIDhskl/lrWYOTj7mSfUGp6cZ">());
         } else {
            liiilIiliiiilIil var5 = probe == null ? null : probe.IiIlliIliiIl();
            if (var5 != null && var5.lIiiIiIlilli() != null && s != null) {
               var31 ^= ((long)this.ilillIiill() << 32 ^ var31) & -1L << 32;
               var31 ^= ((long)(this.IillIIlill.IilliliilIIi(st -> st.method_31574(class_1802.field_8281), false) >= 0 ? 1 : 0) ^ var31) & -1L >>> 32;
               iiIIiiIlIIlIiiIl var8 = llIililIil();
               IlliIlllllliIlll var9 = var8 == null ? IlliIlllllliIlll.IiiIIlIill : var8.ilillIiill();
               long var10 = probe.IIIllIIliIIl();
               var33 ^= ((long)(var9.iIlIlllllill() != null && Iillllilll(this.illiIIlill, var10) ? 1 : 0) << 32 ^ var33) & -1L << 32;
               var33 ^= (
                     (long)liiIIliliiiIIlil.IIiilIiiiIii(probe.IlIlllIlilIl() == null ? illIllilIilIllil.IiIlliIliiIl() : probe.IlIlllIlilIl().lilIliilIl())
                        ^ var33
                  )
                  & -1L >>> 32;
               var35 ^= ((long)(s.iIlIlllllill() != null && s.iIlIlllllill().Iilililiiili() == 0 ? 1 : 0) << 32 ^ var35) & -1L << 32;
               var35 ^= ((long)IIIIllIIIl(probe.llIIlilIIl(), var5) ^ var35) & -1L >>> 32;
               if (s.Iiilliiliiil() != null) {
                  IlliIlillliIli var45 = lIilliIill(s.Iiilliiliiil(), (int)(var33 >>> 32) != 0 ? var9.iIlIlllllill() : null);
                  if (!lllllillll(var45, false, (boolean)((int)(var31 >>> 32)), (boolean)((int)var31))) {
                     return IilliIIllilliIIl.IliIlllilIi(
                        iIlIIIIiIllIIIIi.iliiliIiil,
                        (int)(var31 >>> 32) != 0
                           ? Illillllil<"Illillllil","sYpAD1ymuYdwj+5jWctDrwcCRzy87m83lSTmDoN10y/dnB4kGnbO">()
                           : Illillllil<"Illillllil","aN/jOBYS0nFjGRDDWq5Dck3xbr+hIo9769qg6GHMT1h7neziAHH/">()
                     );
                  } else {
                     double var46 = (int)(var33 >>> 32) != 0 && Double.isFinite(var9.iliIiiliiiii()) ? var9.iliIiiliiiii() : 0.0;
                     return iIIIlIlIIl(
                        new IilliIIllilliIIl(
                           iIlIIIIiIllIIIIi.iliiliIiil,
                           true,
                           var46,
                           (int)(var33 >>> 32) != 0 ? IIllllIlll(var9.iIlIlllllill(), (int)var33) : 0,
                           false,
                           false,
                           Illillllil<"Illillllil","VAKT/lyIVSAXnYgDRI++F/gYKY9/dHfSAw2W/dz7tfgM">()
                        ),
                        (boolean)((int)var35)
                     );
                  }
               } else if ((int)(var33 >>> 32) != 0
                  && var9.IIIllIIliIIl() == var5.iIlIlllllill()
                  && Double.isFinite(var9.iliIiiliiiii())
                  && lllllillll(
                     var9.iIlIlllllill(), Ilillllill(var9.iIlIlllllill(), var9.IilliliilIIi()), (boolean)((int)(var31 >>> 32)), (boolean)((int)var31)
                  )) {
                  var37 ^= ((long)(var9.iIlIlllllill() == IlliIlillliIli.iliiIlIIIl && !this.IlIllllIll(var9.IilliliilIIi()) ? 1 : 0) << 32 ^ var37)
                     & -1L << 32;
                  var37 ^= (
                        (long)(
                              this.liIiIIlill != null
                                    && this.llIiIIlill == var5.iIlIlllllill()
                                    && this.liIiIIlill.IliIlllilIi() == var9.iIlIlllllill()
                                    && this.liIiIIlill.liiiIIllIl().equals(var9.IilliliilIIi())
                                    && this.liIiIIlill.iliIiiliiiii()
                                 ? 1
                                 : 0
                           )
                           ^ var37
                     )
                     & -1L >>> 32;
                  return iIIIlIlIIl(
                     llIIlilIIl(
                        new IilliIIllilliIIl(
                           iIlIIIIiIllIIIIi.iliiliIiil,
                           true,
                           var9.iliIiiliiiii(),
                           IIllllIlll(var9.iIlIlllllill(), (int)var33),
                           (boolean)((int)var37),
                           (int)var37 != 0 && ilIllIiIll(var5),
                           (int)(var37 >>> 32) != 0
                              ? Illillllil<"Illillllil","Zsbww6X8+izp8wChZ7TJQhUrFbBFjP5QuGcUF9F5zqA=">()
                              : Illillllil<"Illillllil","acKk4XJtcO/AjC3EZkgxUrOUKDX4eF/V1AoDl3MV">()
                        ),
                        var9.iIlIlllllill(),
                        (boolean)((int)(var35 >>> 32))
                     ),
                     (boolean)((int)var35)
                  );
               } else {
                  class_243 var16 = var5.IIIllIIliIIl() != null ? var5.IIIllIIliIIl() : var5.iliIiiliiiii();
                  long var17 = IIIillIIil(var3, var5.lIiiIiIlilli());
                  var39 ^= ((long)(s.iIlIlllllill() != null && s.iIlIlllllill().Iilililiiili() <= 0 ? 0 : 1) << 32 ^ var39) & -1L << 32;
                  var39 ^= ((long)(s.iIlIlllllill() != null && s.iIlIlllllill().lliIliliIl() ? 1 : 0) ^ var39) & -1L >>> 32;
                  var41 ^= ((long)(s.iIlIlllllill() != null && s.iIlIlllllill().Illlllllilll() ? 1 : 0) << 32 ^ var41) & -1L << 32;
                  var41 ^= ((long)(s.IIlllIlliIll() != null && s.IIlllIlliIll().liiiIIllIl() > 0 ? 0 : 1) ^ var41) & -1L >>> 32;
                  var43 ^= (
                        (long)(
                                 this.iIIiIIlill != null
                                       && this.llIiIIlill == var5.iIlIlllllill()
                                       && var10 - this.IlIiIIlill < 3L
                                       && var10 >= this.IlIiIIlill
                                       && this.ilIiIIlill != null
                                       && var16 != null
                                       && !(this.ilIiIIlill.method_1022(var16) > 0.75)
                                       && (int)(var39 >>> 32) == this.lIliIIlill
                                       && (int)var39 == this.iIliIIlill
                                       && !liIlliiIll((boolean)((int)(var41 >>> 32)), this.IlliIIlill, (boolean)((int)var41), this.llliIIlill)
                                       && var17 == this.IiIiIIlill
                                       && (int)(var31 >>> 32) == this.IIliIIlill
                                    ? 0
                                    : 1
                              )
                              << 32
                           ^ var43
                     )
                     & -1L << 32;
                  if ((int)(var43 >>> 32) == 0) {
                     return iIIIlIlIIl(
                        llIIlilIIl(
                           iIlllIllll(this.iIIiIIlill, this.iiIiIIlill, (boolean)((int)(var31 >>> 32)), (boolean)((int)var31)),
                           this.iiIiIIlill,
                           (boolean)((int)(var35 >>> 32))
                        ),
                        (boolean)((int)var35)
                     );
                  } else {
                     IillIiillillIiil var24 = var8 == null ? null : var8.Ilillllill(s);
                     List var25 = var24 == null ? List.of() : Ililiiillliliiil.liiiIIllIl(var24, 1);
                     lIlIiiIliIlIiiIl var26 = var25.isEmpty() ? null : (lIlIiiIliIlIiiIl)var25.get(0);
                     IilliIIllilliIIl var27;
                     if (var26 != null && Double.isFinite(var26.IIIllIIliIIl())) {
                        var43 ^= ((long)(var26.IliIlllilIi() == IlliIlillliIli.iliiIlIIIl && !this.IlIllllIll(var26.liiiIIllIl()) ? 1 : 0) ^ var43)
                           & -1L >>> 32;
                        double var29 = (int)(var41 >>> 32) != 0 ? s.iIlIlllllill().lIilliIill().Iliilliiilii(var26.IIIllIIliIIl()) : var26.IIIllIIliIIl();
                        var27 = new IilliIIllilliIIl(
                           iIlIIIIiIllIIIIi.iliiliIiil,
                           true,
                           var29,
                           IIllllIlll(var26.IliIlllilIi(), (int)var33),
                           var26.iliIiiliiiii(),
                           var26.iliIiiliiiii() && ilIllIiIll(var5),
                           (int)var43 != 0
                              ? Illillllil<"Illillllil","Zsbww6X8+izp8wChZ7TJQhUrFbBFjP5QuGcUF9F5zqA=">()
                              : var26.IliIlllilIi().name().toLowerCase(Locale.ROOT)
                        );
                     } else {
                        var27 = new IilliIIllilliIIl(
                           iIlIIIIiIllIIIIi.iliiliIiil,
                           true,
                           0.0,
                           (int)var33,
                           false,
                           false,
                           Illillllil<"Illillllil","9l5XA8ZklMVhHZBSI6yf5OAZNrv9vzXZP/PaECcwjmM=">()
                        );
                     }

                     this.iIIiIIlill = var27;
                     this.liIiIIlill = var26;
                     this.iiIiIIlill = var26 != null && Double.isFinite(var26.IIIllIIliIIl()) ? var26.IliIlllilIi() : null;
                     this.IIliIIlill = (boolean)((int)(var31 >>> 32));
                     this.lIliIIlill = (boolean)((int)(var39 >>> 32));
                     this.iIliIIlill = (boolean)((int)var39);
                     this.IlliIIlill = (boolean)((int)(var41 >>> 32));
                     this.llliIIlill = (boolean)((int)var41);
                     this.IlIiIIlill = var10;
                     this.llIiIIlill = var5.iIlIlllllill();
                     this.ilIiIIlill = var16;
                     this.IiIiIIlill = var17;
                     return iIIIlIlIIl(
                        llIIlilIIl(
                           iIlllIllll(var27, this.iiIiIIlill, (boolean)((int)(var31 >>> 32)), (boolean)((int)var31)),
                           this.iiIiIIlill,
                           (boolean)((int)(var35 >>> 32))
                        ),
                        (boolean)((int)var35)
                     );
                  }
               }
            } else {
               return IilliIIllilliIIl.IliIlllilIi(
                  iIlIIIIiIllIIIIi.iliiliIiil, Illillllil<"Illillllil","1jiLFP5cdBswYsSVzb0k0vtv2AL6kzxj8mxX/uniQzcA8Ebg6Q==">()
               );
            }
         }
      }
   }

   static boolean Iliilliiilii(boolean onGround, class_243 velocity) {
      return onGround && velocity != null && Math.abs(velocity.field_1351) < 0.1;
   }

   public static boolean Illillliilli(IlIIIlilllIIIlil style, double distance) {
      return style == IlIIIlilllIIIlil.iliIiilIil && Double.isFinite(distance) && distance <= 6.0;
   }

   static int IlIillIiilIi(boolean excessGood, int reattack, int targetReadyIn) {
      long var4 = -1697080133724557618L;
      var4 ^= ((long)(!excessGood && reattack > 0 ? Math.max(targetReadyIn, reattack) : targetReadyIn) << 32 ^ var4) & -1L << 32;
      return Math.max(1, Math.min(8, (int)(var4 >>> 32)));
   }

   private boolean IiiIlliiIl(class_238 crystalBox) {
      if (this.iillIIlill != null && crystalBox != null) {
         for (liiilIiliiiilIil var3 : this.iillIIlill.Iilililiiili()) {
            class_243 var4 = var3.IIIllIIliIIl() != null ? var3.IIIllIIliIIl() : var3.iliIiiliiiii();
            if (var4 != null) {
               class_243 var5 = var4.method_1031(0.0, 1.62, 0.0);
               if (lllIliIlillIliIl.IIlilIliiIli(var5, crystalBox) <= 3.2) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static iiIIiiIlIIlIiiIl llIililIil() {
      return llilIllililIll.iliIiiliiiii(iiIIiiIlIIlIiiIl.class) instanceof iiIIiiIlIIlIiiIl var0 ? var0 : null;
   }

   static IilliIIllilliIIl iIIIlIlIIl(IilliIIllilliIIl o, boolean busy) {
      return o != null && busy && o.iIlIlllllill() && Double.isFinite(o.IilliliilIIi()) && !(o.IilliliilIIi() <= 0.0)
         ? new IilliIIllilliIIl(o.liiiIIllIl(), true, o.IilliliilIIi() + 2.0, o.lIiiIiIlilli(), o.iliIiiliiiii(), o.IIIllIIliIIl(), o.IlIlllIlilIl())
         : o;
   }

   private boolean iIiIlIliIl(class_1511 tick, long crystal) {
      long var18 = -8061273495011666371L;
      long var20 = 2877282811041734538L;
      long var22 = -334761545800418951L;
      long var24 = -7250860436867385297L;
      var18 ^= ((long)tick.method_5628() << 32 ^ var18) & -1L << 32;
      liiilIiliiiilIil var5 = this.llilIIlill;
      class_1309 var6 = var5 == null ? null : var5.lIiiIiIlilli();
      var18 ^= ((long)(var6 != null && var6.method_5805() && !var6.method_31481() ? 1 : 0) ^ var18) & -1L >>> 32;
      if (this.IlilIIlill == illlliIlIillliIl.lilIiiiIll) {
         this.iiiIlIIIll((int)(var18 >>> 32), crystal);
         return false;
      } else if (this.IlilIIlill == illlliIlIillliIl.iilIiiiIll) {
         if ((int)var18 != 0 && this.ililIIlill <= 0) {
            this.lliIliliIl(var5, tick, crystal, null);
         } else if ((int)var18 != 0 && this.iillIIlill != null) {
            iIIlIIiIlIlIIi var26 = lllIliIlillIliIl.iIIilIlIil(var6, 1, false, true);
            this.iillIIlill
               .IilliliilIIi(
                  var5.iIlIlllllill(),
                  crystal,
                  lllIliIlillIliIl.IlIllllIll(var6, tick.method_73189(), var26.IliIlllilIi(), var26.liiiIIllIl(), null, null, 6.0F)
               );
         }

         this.liilIIlill.remove((int)(var18 >>> 32));
         return true;
      } else if ((int)var18 == 0) {
         this.liilIIlill.remove((int)(var18 >>> 32));
         return true;
      } else {
         class_243 var8 = tick.method_73189();
         iIIlIIiIlIlIIi var9 = lllIliIlillIliIl.iIIilIlIil(var6, 1, false, true);
         float var10 = lllIliIlillIliIl.IlIllllIll(var6, var8, var9.IliIlllilIi(), var9.liiiIIllIl(), null, null, 6.0F);
         float var11 = iiIiiliIIliili.lIiiIiIlilli(var10, var5.IlIillIiilIi());
         float var12 = iiIiiliIIliili.iliIiiliiiii(var10, var5.IlIillIiilIi(), new IilIlIIllilIlIIl(this.ililIIlill, var5.llIIlilIIl()), 0);
         var20 ^= ((long)(var12 >= var5.IliIlllilIi() ? 1 : 0) << 32 ^ var20) & -1L << 32;
         var20 ^= ((long)this.IlIllllIll(lllIliIlillIliIl.iliIiiliiiii(tick)) ^ var20) & -1L >>> 32;
         var22 ^= ((long)((int)var20 != 0 && !this.IiiIlliiIl(tick.method_5829()) ? 0 : 1) << 32 ^ var22) & -1L << 32;
         var22 ^= ((long)(this.lIilIIlill ? 3 : 10) ^ var22) & -1L >>> 32;
         var24 ^= (
               (long)(
                        !this.iIilIIlill
                              && !iiIiiliIIliili.IIIilIIiiIIi(
                                 this.ililIIlill,
                                 var12,
                                 var11,
                                 (boolean)((int)(var20 >>> 32)),
                                 (boolean)((int)(var22 >>> 32)),
                                 this.IIiIllIiIl((int)(var18 >>> 32)),
                                 (int)var22
                              )
                              && (!this.lIilIIlill || !(var12 >= 1.0F))
                           ? 0
                           : 1
                     )
                     << 32
                  ^ var24
            )
            & -1L << 32;
         if ((int)(var24 >>> 32) == 0) {
            this.iiiIlIIIll((int)(var18 >>> 32), crystal);
            return false;
         } else {
            this.liilIIlill.remove((int)(var18 >>> 32));
            if (this.ililIIlill <= 0) {
               this.lliIliliIl(var5, tick, crystal, new float[]{var10, var11});
            } else if (this.iillIIlill != null) {
               this.iillIIlill.IilliliilIIi(var5.iIlIlllllill(), crystal, var10);
            }

            return true;
         }
      }
   }

   @Override
   public void IiIlliIliiIl() {
      this.llllIIlill.Iiilliiliiil();
   }

   private void iIIilIlIil() {
      this.liilIIlill.clear();
      this.iiilIIlill = Long.MIN_VALUE;
      this.IIIiIIlill = -1;
      this.lIIiIIlill = false;
      this.iIIiIIlill = null;
      this.liIiIIlill = null;
      this.iiIiIIlill = null;
      this.IIliIIlill = false;
      this.lIliIIlill = false;
      this.iIliIIlill = false;
      this.IlliIIlill = false;
      this.llliIIlill = false;
      this.illiIIlill = Long.MIN_VALUE;
      this.IlIiIIlill = Long.MIN_VALUE;
      this.llIiIIlill = -1;
      this.ilIiIIlill = null;
      this.IiIiIIlill = 0L;
   }

   private static IlliIlillliIli lIilliIill(ilIIllIiIiIIllIi dir, IlliIlillliIli acting) {
      long var5 = -7887763021748949882L;
      if (acting == IlliIlillliIli.iliiIlIIIl) {
         return acting;
      } else {
         class_2338 var2 = dir.liiiIIllIl();
         class_2338 var3 = dir.IliIlllilIi();
         var5 ^= ((long)(var2 != null && !lllIliIlillIliIl.IliIlllilIi(var2) ? 1 : 0) << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) == 0 && var2 != null && var3 != null && var3.equals(var2.method_10084()) && !lllIliIlillIliIl.IliIlllilIi(var3)) {
            var5 ^= (4294967296L ^ var5) & -1L << 32;
         }

         if ((int)(var5 >>> 32) != 0) {
            return IlliIlillliIli.IiiiIlIIIl;
         } else {
            return var3 != null && lllIliIlillIliIl.IIlllIlliIll(var3) != null ? IlliIlillliIli.iliiIlIIIl : IlliIlillliIli.lliiIlIIIl;
         }
      }
   }

   @Override
   public void lIiiIiIlilli(int slot) {
      this.IillIIlill.iliIiiliiiii(slot, false);
   }

   @Override
   public float[] IlIlllIlilIl(float toPitch, float toYaw) {
      return this.llllIIlill.Ililllililil(IiilIiIiliilIiIi.IIIllIiIIi, toPitch, toYaw, IIIliIilIIliIi.lilIIiliiiilIIilii, 60, 8.0F);
   }

   public boolean Illlllllilll() {
      iiIIiiIlIIlIiiIl var1 = llIililIil();
      if (var1 == null) {
         this.IIilIIlill = false;
         return false;
      } else {
         this.IIilIIlill = var1.IIllllIlll(this.IlllIIlill, this);
         if (this.IIilIIlill) {
            this.iIIilIlIil();
         }

         return this.IIilIIlill;
      }
   }

   static boolean Iiiiliiiiiii(IlIIIlilllIIIlil t, lliiilIiiliiilIi style, liiilIiliiiilIil self) {
      return t == IlIIIlilllIIIlil.iliIiilIil && style != null && style.Iilllilliill() && style.IIillIiliIil() >= 4 && style.IliIlllilIi() <= 8.0F;
   }

   static IilliIIllilliIIl llIIlilIIl(IilliIIllilliIIl o, IlliIlillliIli holding, boolean kind) {
      if (o == null || !kind || !o.iIlIlllllill()) {
         return o;
      } else {
         return holding != IlliIlillliIli.lliiIlIIIl && holding != IlliIlillliIli.IiiiIlIIIl
            ? o
            : new IilliIIllilliIIl(
               o.liiiIIllIl(),
               true,
               o.IilliliilIIi(),
               o.lIiiIiIlilli(),
               o.iliIiiliiiii(),
               o.IIIllIIliIIl(),
               Illillllil<"Illillllil","6VZ+0eOKizvZKTij9hAwYfKIIaDqKtnbCNkDiNOiVS4=">()
            );
      }
   }

   static lIiillIiiIiillIi iilllIIill(lIiillIiiIiillIi t) {
      if (t != null && t.Iilililiiili() != 0) {
         lIiillIiiIiillIi var1 = new lIiillIiiIiillIi(
            t.IIillIiliIil(),
            t.Ililllililil(),
            t.Iiilliiliiil(),
            t.IIIilIIiiIIi(),
            t.IlIillIiilIi(),
            t.IiIiliIiiiIi(),
            t.IIlilIliiIli(),
            t.Illillliilli(),
            0,
            t.IIiilIiiiIii(),
            t.Iliilliiilii(),
            t.Iiiiliiiiiii(),
            t.IIIIllIIIl(),
            t.iIIIlIlIIl(),
            t.llIIlilIIl(),
            t.IiIIlliIIl(),
            t.iiIIlIIlIl(),
            t.lIlIliIlIl(),
            t.IllIllllIl(),
            t.illIlIilIl(),
            t.lilIliilIl(),
            t.IIiIllIiIl(),
            t.iIiIlIliIl(),
            t.lliIliliIl(),
            t.IiiIlliiIl(),
            t.iiiIlIIIll(),
            t.lIIlliIIll(),
            t.IlIllllIll(),
            t.ilIllIiIll(),
            t.liIlliiIll(),
            t.IIllllIlll(),
            t.iIlllIllll(),
            t.lllllillll(),
            t.Iillllilll(),
            t.iilllIIill()
         );
         return var1.IIlllIlliIll(t.lIilliIill());
      } else {
         return t;
      }
   }

   static boolean IIIilIIiiIIi(int targetReadyIn, float lastScaledTaken) {
      return targetReadyIn > 0 && Float.isFinite(lastScaledTaken) && lastScaledTaken < 20.0F;
   }

   public boolean IIlllIlliIll() {
      iiIIiiIlIIlIiiIl var1 = llIililIil();
      return this.IIilIIlill && var1 != null && var1.lllllillll();
   }
}
