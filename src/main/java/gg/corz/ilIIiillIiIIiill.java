package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;

public final class ilIIiillIiIIiill {
   private int IlIIiliill;
   private final iIIilIllIlIilIll illilliill;
   private int liiilliill;
   private boolean llIIiliill;
   private IiIilliIil ilIIiliill;
   private int iiiilliill;
   private double lIIIiliill;
   private String IiIIiliill;
   private int Iiiilliill;
   private final int IIiilliill;
   private int liIIiliill;
   private double IIIIiliill;
   private final List<Long> iililliill;
   private final String[] lliilliill;
   private final int lIiilliill;
   private final List<IilIiiililIiii> lililliill;
   private final IliIlIillliIlIil[] Iliilliill;
   private int iIIIiliill;
   private final long lllilliill;
   private int iliilliill;
   private final long Iililliill;
   private final Map<Long, Integer> iIiilliill;

   public long IliIlllilIi() {
      return this.lllilliill;
   }

   public IilIiiililIiii IiIlliIliiIl(long target) {
      Integer var3 = this.iIiilliill.get(target);
      return var3 == null ? null : this.lililliill.get(var3);
   }

   public void IiIIlliIIl() {
      this.iIIIiliill++;
   }

   public String IiiIlliiIl() {
      return this.IiIIiliill;
   }

   public boolean IlIillIiilIi() {
      return this.llIIiliill || this.Iilllilliill() == 0;
   }

   public List<Long> lIiiIiIlilli() {
      return this.iililliill;
   }

   public boolean Illillliilli(long tick, String why, int target) {
      Integer var5 = this.iIiilliill.get(tick);
      if (var5 != null && this.Iliilliill[var5] != IliIlIillliIlIil.lIIlIIlIil) {
         if (this.Iliilliill[var5] != IliIlIillliIlIil.iIIlIIlIil) {
            this.liiilliill++;
         }

         if (this.Iliilliill[var5] == IliIlIillliIlIil.IlIlIIlIil) {
            this.iiiilliill--;
         }

         this.Iliilliill[var5] = IliIlIillliIlIil.iIIlIIlIil;
         this.lliilliill[var5] = why == null ? "" : why;
         if (this.iliilliill == var5) {
            this.iliilliill = -1;
         }

         this.liIIiliill = target;
         return true;
      } else {
         return false;
      }
   }

   public boolean iIiIlIliIl() {
      return this.llIIiliill;
   }

   public IiIilliIil lliIliliIl() {
      return this.ilIIiliill;
   }

   public ilIIiillIiIIiill(long lane, iIIilIllIlIilIll steps, long startTick, List<IilIiiililIiii> kind, List<Long> regionKey, int entryCostNodes, int id) {
      long var12 = 4588362095098693512L;
      super();
      this.iIiilliill = new HashMap<>();
      this.iliilliill = -1;
      this.IiIIiliill = "";
      this.lllilliill = lane;
      this.illilliill = steps;
      this.Iililliill = startTick;
      ArrayList var10 = new ArrayList(kind == null ? List.of() : kind);
      this.lililliill = Collections.unmodifiableList(var10);
      this.iililliill = Collections.unmodifiableList(new ArrayList<>(regionKey == null ? List.of() : regionKey));
      this.IIiilliill = entryCostNodes;
      this.lIiilliill = id;
      this.liIIiliill = id;
      this.Iliilliill = new IliIlIillliIlIil[var10.size()];
      this.lliilliill = new String[var10.size()];

      for (long var14 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var14 >>> 32) < var10.size(); var14 += 4294967296L) {
         this.Iliilliill[(int)(var14 >>> 32)] = IliIlIillliIlIil.iiiIIIlIil;
         this.iIiilliill.putIfAbsent(((IilIiiililIiii)var10.get((int)(var14 >>> 32))).IliIlllilIi(), (int)(var14 >>> 32));
      }
   }

   public IliIlIillliIlIil IIlllIlliIll(long target) {
      Integer var3 = this.iIiilliill.get(target);
      return var3 == null ? null : this.Iliilliill[var3];
   }

   public int IIIllIIliIIl() {
      return this.liIIiliill;
   }

   public long iIlIlllllill() {
      return this.Iililliill;
   }

   public void llIIlilIIl(double degrees) {
      if (degrees > 0.0) {
         this.lIIIiliill += degrees;
      }
   }

   public int Iiiiliiiiiii(long stillValid, int changedCell, Predicate<IilIiiililIiii> chebyshevRadius) {
      long var8 = -8967552160825933118L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for (var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < this.Iliilliill.length; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         if (this.Iliilliill[(int)var8] == IliIlIillliIlIil.iiiIIIlIil) {
            IilIiiililIiii var7 = this.lililliill.get((int)var8);
            if ((
                  IIIIllIIIl(stillValid, var7.IliIlllilIi(), changedCell)
                     || IIIIllIIIl(stillValid, var7.liiiIIllIl(), changedCell)
                     || IIIIllIIIl(stillValid, var7.iIlIlllllill(), changedCell)
               )
               && !chebyshevRadius.test(var7)) {
               this.Illillliilli(var7.IliIlllilIi(), lIIlliIIll<"lIIlliIIll","E/IAcCrC6jTd18Nla/XmLWIZ+Ebhms35fV7Bt5NtiWNm30HtxER2b1s=">(), this.liIIiliill);
               var8 += 4294967296L;
            }
         }
      }

      return (int)(var8 >>> 32);
   }

   public IilIiiililIiii IlIlllIlilIl() {
      long var2 = 3334749035764322104L;
      if (this.iliilliill >= 0) {
         return this.lililliill.get(this.iliilliill);
      } else {
         for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.Iliilliill.length; var4 += 4294967296L) {
            if (this.Iliilliill[(int)(var4 >>> 32)] == IliIlIillliIlIil.iiiIIIlIil) {
               return this.lililliill.get((int)(var4 >>> 32));
            }
         }

         return null;
      }
   }

   public int Iliilliiilii(Predicate<IilIiiililIiii> stillValid) {
      long var4 = 3466781772427715983L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (var4 ^= (0L ^ var4) & -1L >>> 32; (int)var4 < this.Iliilliill.length; var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
         if (this.Iliilliill[(int)var4] == IliIlIillliIlIil.iiiIIIlIil && !stillValid.test(this.lililliill.get((int)var4))) {
            this.Illillliilli(
               this.lililliill.get((int)var4).IliIlllilIi(),
               lIIlliIIll<"lIIlliIIll","j4Py7Le6NxoLrVCgTPsID74wNcRvRHl5Lhg307MVdIvhDr8NSZDBtPk=">(),
               this.liIIiliill
            );
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public int IIIilIIiiIIi() {
      return this.iiiilliill;
   }

   public int lilIliilIl() {
      return this.IlIIiliill;
   }

   public int illIlIilIl() {
      return this.iIIIiliill;
   }

   public List<IilIiiililIiii> IilliliilIIi() {
      return this.lililliill;
   }

   public void IiIiliIiiiIi(long target, int tick) {
      Integer var4 = this.iIiilliill.get(target);
      if (var4 != null) {
         if (this.Iliilliill[var4] == IliIlIillliIlIil.iiiIIIlIil || this.Iliilliill[var4] == IliIlIillliIlIil.IIIlIIlIil) {
            if (this.iliilliill >= 0 && this.iliilliill != var4 && this.Iliilliill[this.iliilliill] == IliIlIillliIlIil.IIIlIIlIil) {
               this.Iliilliill[this.iliilliill] = IliIlIillliIlIil.iiiIIIlIil;
            }

            this.Iliilliill[var4] = IliIlIillliIlIil.IIIlIIlIil;
            this.iliilliill = var4;
            this.liIIiliill = tick;
         }
      }
   }

   public boolean Illlllllilll(long target) {
      return this.iIiilliill.containsKey(target);
   }

   public static boolean IIIIllIIIl(long radius, long b, int a) {
      return Math.abs(llIiIiililIiIiil.IiIlliIliiIl(radius) - llIiIiililIiIiil.IiIlliIliiIl(b)) <= a
         && Math.abs(llIiIiililIiIiil.IIlllIlliIll(radius) - llIiIiililIiIiil.IIlllIlliIll(b)) <= a
         && Math.abs(llIiIiililIiIiil.Illlllllilll(radius) - llIiIiililIiIiil.Illlllllilll(b)) <= a;
   }

   public int iliIiiliiiii() {
      return this.lIiilliill;
   }

   public boolean IIlilIliiIli(long tick, int target) {
      Integer var4 = this.iIiilliill.get(tick);
      if (var4 == null) {
         return false;
      } else {
         if (this.Iliilliill[var4] != IliIlIillliIlIil.lIIlIIlIil) {
            this.Iiiilliill++;
         }

         if (this.Iliilliill[var4] == IliIlIillliIlIil.iIIlIIlIil) {
            this.liiilliill--;
         }

         if (this.Iliilliill[var4] == IliIlIillliIlIil.IlIlIIlIil) {
            this.iiiilliill--;
         }

         this.Iliilliill[var4] = IliIlIillliIlIil.lIIlIIlIil;
         this.lliilliill[var4] = null;
         if (this.iliilliill == var4) {
            this.iliilliill = -1;
         }

         this.liIIiliill = target;
         return true;
      }
   }

   public void iiIIlIIlIl() {
      this.IlIIiliill++;
   }

   public double lIlIliIlIl() {
      return this.IIIIiliill;
   }

   public iIIilIllIlIilIll liiiIIllIl() {
      return this.illilliill;
   }

   public int IIillIiliIil() {
      return this.lililliill.size();
   }

   public void IIiIllIiIl(IiIilliIil tick, String detail, int reason) {
      if (!this.llIIiliill) {
         this.llIIiliill = true;
         this.ilIIiliill = tick;
         this.IiIIiliill = detail == null ? "" : detail;
         if (this.iliilliill >= 0 && this.Iliilliill[this.iliilliill] == IliIlIillliIlIil.IIIlIIlIil) {
            this.Iliilliill[this.iliilliill] = IliIlIillliIlIil.iiiIIIlIil;
         }

         this.iliilliill = -1;
         this.liIIiliill = reason;
      }
   }

   public boolean Iilililiiili(long target, String why) {
      Integer var4 = this.iIiilliill.get(target);
      if (var4 != null && this.Iliilliill[var4] != IliIlIillliIlIil.lIIlIIlIil) {
         if (this.Iliilliill[var4] != IliIlIillliIlIil.IlIlIIlIil) {
            this.iiiilliill++;
         }

         if (this.Iliilliill[var4] == IliIlIillliIlIil.iIIlIIlIil) {
            this.liiilliill--;
         }

         this.Iliilliill[var4] = IliIlIillliIlIil.IlIlIIlIil;
         this.lliilliill[var4] = why == null ? "" : why;
         if (this.iliilliill == var4) {
            this.iliilliill = -1;
         }

         return true;
      } else {
         return false;
      }
   }

   public int Iiilliiliiil() {
      return this.liiilliill;
   }

   public int Ililllililil() {
      return this.Iiiilliill;
   }

   public String iiiIlIIIll(int tick) {
      return String.format(
         Locale.ROOT,
         lIIlliIIll<"lIIlliIIll","gRTnn8/3p4lSE7Y4WHaw35vyDAl7EZ0L/Tsn5PYisOKIjbN4J8CT72wgZlCwYOCIXMkoWHIp9ogrpBe9pS30WEx/n3s+YbZFv5WtzSUgoeYpm2RVwfy+g4dOuGoz0+RJVc9WnzHgnQ/ZAEbuAQuRdqqQ7UEaxtLOK6NqwaiKfcO9zuv/Gb2K8TeKVMKtNyh3wUO4CyGEoEJMPRWP8yDxSZss8BBQS22qzI/lUtDICF5UDfEAV+fni6YpkqicawItvOvEPtXy+d+MSLpI1AjGdg8nmVuHzdQx4MBj0z80W88T">(),
         this.lllilliill,
         this.illilliill,
         this.Iililliill,
         this.iIiilliill.size(),
         this.lililliill.size(),
         this.Iiiilliill,
         this.IIiilliill,
         this.IIIIiliill,
         this.lIIIiliill,
         this.iIIIiliill,
         this.IlIIiliill,
         this.liiilliill,
         Math.max(0, tick - this.lIiilliill) / 20,
         this.llIIiliill && this.ilIIiliill != null ? this.ilIIiliill.name() : lIIlliIIll<"lIIlliIIll","3lRQf1Q+M/pPevoedWVsUk3ByRkMZ65bFj8winwndn0=">()
      );
   }

   public void iIIIlIlIIl(double blocks) {
      if (blocks > 0.0) {
         this.IIIIiliill += blocks;
      }
   }

   public String IIiilIiiiIii(long target) {
      Integer var3 = this.iIiilliill.get(target);
      return var3 == null ? null : this.lliilliill[var3];
   }

   public int Iilllilliill() {
      long var6 = 8563400001382309494L;
      long var8 = -1005254481102147298L;
      var6 ^= (0L ^ var6) & -1L << 32;
      IliIlIillliIlIil[] var2 = this.Iliilliill;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for (long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)var6; var12 += 4294967296L) {
         IliIlIillliIlIil var5 = var2[(int)(var12 >>> 32)];
         if (var5 == IliIlIillliIlIil.iiiIIIlIil || var5 == IliIlIillliIlIil.IIIlIIlIil) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   public double IllIllllIl() {
      return this.lIIIiliill;
   }
}
