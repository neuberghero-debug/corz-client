package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.LongUnaryOperator;

public final class iIliiIiIlliiIi {
   private int iIliiIiiiIlliiIiii;
   private final Map<Long, Integer> ilIiiIiiiIiIiiIiii;
   private final ArrayList<Long> liIiiIiiiiiIiiIiii;
   private final Map<Long, liliiIliiliiIl> lIIiiIiiiiIIiiIiii = new HashMap<>();
   private final HashSet<Long> IIliiIiiilIliiIiii;
   private final Map<Long, liliiIliiliiIl> IlIiiIiiillIiiIiii = new HashMap<>();

   public void IIIllIIliIIl(long target, long[] cells, LongUnaryOperator stateOf, String reason) {
      if (this.IIliiIiiilIliiIiii.add(target)) {
         this.liIiiIiiiiiIiiIiii.add(target);
      }

      this.IlIiiIiiillIiiIiii.put(target, new liliiIliiliiIl(target, (long[])cells.clone(), IliIlllilIi(cells, stateOf), reason));
   }

   public void IIillIiliIil() {
      this.lIIiiIiiiiIIiiIiii.clear();
      this.IlIiiIiiillIiiIiii.clear();
      this.ilIiiIiiiIiIiiIiii.clear();
      this.liIiiIiiiiiIiiIiii.clear();
      this.IIliiIiiilIliiIiii.clear();
      this.iIliiIiiiIlliiIiii = 0;
   }

   public static long IliIlllilIi(long[] cells, LongUnaryOperator stateOf) {
      long var11 = -8585585621011228093L;
      long var2 = -3750763034362895579L;
      long[] var4 = cells;
      var11 ^= ((long)cells.length << 32 ^ var11) & -1L << 32;

      for (long var14 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         long var7 = var4[(int)var14];
         long var9 = stateOf.applyAsLong(var7);
         var2 = (var2 ^ var7 * -7046029254386353131L + var9) * 1099511628211L;
      }

      return var2;
   }

   public int Iilllilliill() {
      return this.IlIiiIiiillIiiIiii.size();
   }

   public int IIlllIlliIll(LongUnaryOperator budget, int stateOf) {
      long var9 = -1363834793013374577L;
      long var11 = 9194606607103817299L;
      if (stateOf > 0 && !this.IlIiiIiiillIiiIiii.isEmpty()) {
         if (this.liIiiIiiiiiIiiIiii.size() > this.IlIiiIiiillIiiIiii.size() * 2 + 64) {
            this.liIiiIiiiiiIiiIiii.removeIf(key -> !this.IlIiiIiiillIiiIiii.containsKey(key));
            this.IIliiIiiilIliiIiii.clear();
            this.IIliiIiiilIliiIiii.addAll(this.liIiiIiiiiiIiiIiii);
            this.iIliiIiiiIlliiIiii = 0;
         }

         var9 ^= (0L ^ var9) & -1L << 32;
         var9 ^= (0L ^ var9) & -1L >>> 32;
         var11 ^= ((long)this.liIiiIiiiiiIiiIiii.size() << 32 ^ var11) & -1L << 32;

         while ((int)(var9 >>> 32) < stateOf && (int)var9 < (int)(var11 >>> 32)) {
            if (this.iIliiIiiiIlliiIiii >= this.liIiiIiiiiiIiiIiii.size()) {
               this.iIliiIiiiIlliiIiii = 0;
            }

            long var6 = this.liIiiIiiiiiIiiIiii.get(this.iIliiIiiiIlliiIiii++);
            var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
            liliiIliiliiIl var8 = this.IlIiiIiiillIiiIiii.get(var6);
            if (var8 != null) {
               var9 += 4294967296L;
               if (IliIlllilIi(var8.liiiIIllIl(), budget) != var8.iIlIlllllill()) {
                  this.IlIiiIiiillIiiIiii.remove(var6);
                  this.ilIiiIiiiIiIiiIiii.remove(var6);
               }
            }
         }

         return (int)(var9 >>> 32);
      } else {
         return 0;
      }
   }

   public boolean IlIlllIlilIl(long target, LongUnaryOperator stateOf) {
      liliiIliiliiIl var4 = this.IlIiiIiiillIiiIiii.get(target);
      if (var4 == null) {
         return false;
      } else if (IliIlllilIi(var4.liiiIIllIl(), stateOf) == var4.iIlIlllllill()) {
         return true;
      } else {
         this.IlIiiIiiillIiiIiii.remove(target);
         this.ilIiiIiiiIiIiiIiii.remove(target);
         return false;
      }
   }

   public Set<Long> IilliliilIIi(LongUnaryOperator stateOf) {
      HashSet var2 = new HashSet();

      for (liliiIliiliiIl var4 : new ArrayList<>(this.lIIiiIiiiiIIiiIiii.values())) {
         if (this.iIlIlllllill(var4.IliIlllilIi(), stateOf)) {
            var2.add(var4.IliIlllilIi());
         }
      }

      return var2;
   }

   public int lIiiIiIlilli(long target) {
      return this.ilIiiIiiiIiIiiIiii.merge(target, 1, Integer::sum);
   }

   public void liiiIIllIl(long cells, long[] reason, LongUnaryOperator key, String stateOf) {
      this.lIIiiIiiiiIIiiIiii.put(cells, new liliiIliiliiIl(cells, (long[])reason.clone(), IliIlllilIi(reason, key), stateOf));
   }

   public int iliIiiliiiii(long target) {
      return this.ilIiiIiiiIiIiiIiii.getOrDefault(target, 0);
   }

   public boolean Ililllililil(long target) {
      return this.IlIiiIiiillIiiIiii.remove(target) != null;
   }

   public boolean IiIlliIliiIl(long target) {
      return this.IlIiiIiiillIiiIiii.containsKey(target);
   }

   public int Illlllllilll() {
      return this.lIIiiIiiiiIIiiIiii.size();
   }

   public boolean iIlIlllllill(long stateOf, LongUnaryOperator key) {
      liliiIliiliiIl var4 = this.lIIiiIiiiiIIiiIiii.get(stateOf);
      if (var4 == null) {
         return false;
      } else if (IliIlllilIi(var4.liiiIIllIl(), key) == var4.iIlIlllllill()) {
         return true;
      } else {
         this.lIIiiIiiiiIIiiIiii.remove(stateOf);
         return false;
      }
   }

   public iIliiIiIlliiIi() {
      this.ilIiiIiiiIiIiiIiii = new HashMap<>();
      this.liIiiIiiiiiIiiIiii = new ArrayList<>();
      this.IIliiIiiilIliiIiii = new HashSet<>();
   }
}
