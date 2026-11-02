package gg.corz;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class Illiilillliili {
   private static final lIIiIliliIIiIlil[] lllIIllIIl = lIIiIliliIIiIlil.values();
   public static final int iIlIIllIIl = 4096;
   private final int[] lilIIllIIl;
   private final LinkedHashMap<Long, long[]> IIiIIllIIl;
   private long illIIllIIl = 1L;
   private int IilIIllIIl;
   private final int[] iilIIllIIl;
   private static final iIiIiiilIliIiiil[] IllIIllIIl = iIiIiiilIliIiiil.values();

   public void iIlIlllllill(lIIiIliliIIiIlil e) {
      this.iilIIllIIl[e.ordinal()]++;
   }

   public int IiIlliIliiIl(lIIiIliliIIiIlil e) {
      return this.iilIIllIIl[e.ordinal()];
   }

   public int Illlllllilll() {
      return this.IIiIIllIIl.size();
   }

   public int IlIlllIlilIl(iIiIiiilIliIiiil e) {
      return this.lilIIllIIl[e.ordinal()];
   }

   public long IIIllIIliIIl(long familyKey) {
      long[] var3 = this.IIiIIllIIl.get(familyKey);
      return var3 == null ? 0L : var3[0];
   }

   public int IilliliilIIi(long familyKey) {
      long[] var3 = this.IIiIIllIIl.remove(Long.valueOf(familyKey));
      if (var3 == null || var3[0] != this.illIIllIIl) {
         var3 = new long[]{this.illIIllIIl, 0L};
         this.IilIIllIIl++;
      }

      var3[1]++;
      this.IIiIIllIIl.put(Long.valueOf(familyKey), var3);
      return (int)var3[1];
   }

   public long IliIlllilIi() {
      return this.illIIllIIl;
   }

   public String IIillIiliIil() {
      long var8 = -6896165943769131997L;
      long var10 = -8862941452015922712L;
      StringBuilder var1 = new StringBuilder(160);
      var1.append(Ililllililil<"Ililllililil","uvfY4AmA5BKrjguTrn3GXWIUV+S4sbTPUxvsAQc4dbeRaQ==">())
         .append(this.illIIllIIl)
         .append(Ililllililil<"Ililllililil","FlqL42/ieUAdgRPEgGssIvxIvNurCx5oKkmBeaIWU5kGVZ7mFTM=">())
         .append(this.IilIIllIIl)
         .append(Ililllililil<"Ililllililil","XZltR1B+p/nQcm7RLMP9/aMvyckGVeO0obN9/UM7iQLOui6l">());
      var8 ^= (4294967296L ^ var8) & -1L << 32;
      iIiIiiilIliIiiil[] var3 = IllIIllIIl;
      var8 ^= ((long)var3.length ^ var8) & -1L >>> 32;
      var10 ^= (0L ^ var10) & -1L << 32;

      while ((int)(var10 >>> 32) < (int)var8) {
         iIiIiiilIliIiiil var6 = var3[(int)(var10 >>> 32)];
         var10 ^= ((long)this.lilIIllIIl[var6.ordinal()] ^ var10) & -1L >>> 32;
         if ((int)var10 != 0) {
            if ((int)(var8 >>> 32) == 0) {
               var1.append(',');
            }

            var1.append(var6.name()).append('=').append((int)var10);
            var8 ^= (0L ^ var8) & -1L << 32;
         }

         var10 += 4294967296L;
      }

      var1.append(Ililllililil<"Ililllililil","yR3+8VnhfzTy97xFtnoAklbQyrfcuWdZenxlO3cjGrmEk5YxBAT3NA==">());
      var8 ^= (4294967296L ^ var8) & -1L << 32;
      lIIiIliliIIiIlil[] var12 = lllIIllIIl;
      var8 ^= ((long)var12.length ^ var8) & -1L >>> 32;
      var10 ^= (0L ^ var10) & -1L << 32;

      while ((int)(var10 >>> 32) < (int)var8) {
         lIIiIliliIIiIlil var13 = var12[(int)(var10 >>> 32)];
         var10 ^= ((long)this.iilIIllIIl[var13.ordinal()] ^ var10) & -1L >>> 32;
         if ((int)var10 != 0) {
            if ((int)(var8 >>> 32) == 0) {
               var1.append(',');
            }

            var1.append(var13.name()).append('=').append((int)var10);
            var8 ^= (0L ^ var8) & -1L << 32;
         }

         var10 += 4294967296L;
      }

      return var1.append('}').toString();
   }

   public Illiilillliili() {
      this.lilIIllIIl = new int[IllIIllIIl.length];
      this.iilIIllIIl = new int[lllIIllIIl.length];
      this.IIiIIllIIl = new LinkedHashMap<Long, long[]>(64, 0.75F, false) {
         @Override
         protected boolean removeEldestEntry(Entry<Long, long[]> e) {
            if (this.size() <= 4096) {
               return false;
            } else {
               if (((long[])e.getValue())[0] == Illiilillliili.this.illIIllIIl) {
                  Illiilillliili.this.IilIIllIIl--;
               }

               return true;
            }
         }
      };
   }

   public boolean iliIiiliiiii(long limit, int familyKey) {
      return this.lIiiIiIlilli(limit) >= familyKey;
   }

   public long liiiIIllIl(iIiIiiilIliIiiil e) {
      this.lilIIllIIl[e.ordinal()]++;
      this.illIIllIIl++;
      this.IilIIllIIl = 0;
      return this.illIIllIIl;
   }

   public void Iilllilliill() {
      this.illIIllIIl = 1L;
      this.IilIIllIIl = 0;
      this.IIiIIllIIl.clear();
      Arrays.fill(this.lilIIllIIl, 0);
      Arrays.fill(this.iilIIllIIl, 0);
   }

   public int IIlllIlliIll() {
      return this.IilIIllIIl;
   }

   public int lIiiIiIlilli(long familyKey) {
      long[] var3 = this.IIiIIllIIl.get(familyKey);
      return var3 != null && var3[0] == this.illIIllIIl ? (int)var3[1] : 0;
   }
}
