package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;

public final class liIiiIiiiIiiIi {
   public static final int llIliIiiiilIliIiii = 1024;
   private int illliIiiiIilliIiii;
   private final int[] lIlliIiiiiIlliIiii;
   private final Map<ilIIlliIiIIlli, LinkedHashMap<Long, iIiIliIliIli>> IiIliIiiiliIliIiii = new LinkedHashMap<>();
   private final int[] IllliIiiilllliIiii;
   private int lilliIiiiiilliIiii;
   private final int[] iiIliIiiiIIlliIiii = new int[ilIIlliIiIIlli.values().length];

   public int IlIlllIlilIl(LongUnaryOperator stateOf) {
      long var7 = 1450792382632839211L;
      long var9 = -2891065429105834508L;
      var7 ^= (0L ^ var7) & -1L << 32;
      ilIIlliIiIIlli[] var3 = ilIIlliIiIIlli.values();
      var7 ^= ((long)var3.length ^ var7) & -1L >>> 32;

      for (long var13 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var13 >>> 32) < (int)var7; var13 += 4294967296L) {
         ilIIlliIiIIlli var6 = var3[(int)(var13 >>> 32)];
         var7 ^= ((long)((int)(var7 >>> 32) + this.iliIiiliiiii(var6, stateOf)) << 32 ^ var7) & -1L << 32;
      }

      return (int)(var7 >>> 32);
   }

   public int IIIllIIliIIl(ilIIlliIiIIlli targetMatches, LongPredicate kind) {
      LinkedHashMap var3 = this.IliIlllilIi(targetMatches);
      ArrayList var4 = new ArrayList();

      for (Entry var6 : var3.entrySet()) {
         if (kind.test(((iIiIliIliIli)var6.getValue()).IiIlliIliiIl())) {
            var4.add((Long)var6.getKey());
         }
      }

      for (long var9 : var4) {
         var3.remove(Long.valueOf(var9));
      }

      this.illliIiiiIilliIiii = this.illliIiiiIilliIiii + var4.size();
      return var4.size();
   }

   private LinkedHashMap<Long, iIiIliIliIli> IliIlllilIi(ilIIlliIiIIlli k) {
      return this.IiIliIiiiliIliIiii.computeIfAbsent(k, x -> new LinkedHashMap<>());
   }

   public int lIiiIiIlilli(ilIIlliIiIIlli kind) {
      long var3 = 6677360837181234223L;
      var3 ^= ((long)this.IliIlllilIi(kind).size() << 32 ^ var3) & -1L << 32;
      this.IliIlllilIi(kind).clear();
      this.illliIiiiIilliIiii += (int)(var3 >>> 32);
      return (int)(var3 >>> 32);
   }

   public List<Long> IIlllIlliIll(ilIIlliIiIIlli k) {
      return new ArrayList<>(this.IliIlllilIi(k).keySet());
   }

   public boolean IilliliilIIi(ilIIlliIiIIlli kind, long stateOf, LongUnaryOperator semanticKey, iiiIlIllIIIllIll use) {
      return this.iIlIlllllill(kind, stateOf, semanticKey, use) != null;
   }

   private static String Iliilliiilii(ilIIlliIiIIlli k) {
      return switch (k) {
         case llIillIIIl -> IIIIllIIIl<"IIIIllIIIl","parqn+1zE8dPVUBuk+yPMyeA+tdhrS82KDG0Tykg3FU=">();
         case ilIillIIIl -> IIIIllIIIl<"IIIIllIIIl","3R8Wt46JSQjwZ9Oe+GEE56aHERHVgZFBVpSaZE2y9hQ=">();
         case IiIillIIIl -> IIIIllIIIl<"IIIIllIIIl","0bFDVbcEWaRZOKW7IJDdhbQg8CVit/Iv0lHwkpN5av9Wdw==">();
         case liIillIIIl -> IIIIllIIIl<"IIIIllIIIl","mGmiceNlF7If+1ExG6jzWWMs0hlR97HVgPvjJkSPLxND">();
         case iiIillIIIl -> IIIIllIIIl<"IIIIllIIIl","mfyIIdCU68fgFS7svzsXaHXGiMC9I3PtJJDvi4iG2U5KPg==">();
         case IIlillIIIl -> IIIIllIIIl<"IIIIllIIIl","OxZNZZqMrRfXxWLkQq1cr8smOXHXO4bKUiK1ygEB8iVIoCY=">();
      };
   }

   public String IIiilIiiiIii() {
      long var6 = -4877353859616963910L;
      StringBuilder var1 = new StringBuilder();
      ilIIlliIiIIlli[] var2 = ilIIlliIiIIlli.values();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         ilIIlliIiIIlli var5 = var2[(int)var9];
         if (this.iiIliIiiiIIlliIiii[var5.ordinal()] != 0 || this.lIlliIiiiiIlliIiii[var5.ordinal()] != 0 || this.IllliIiiilllliIiii[var5.ordinal()] != 0) {
            if (var1.length() > 0) {
               var1.append(' ');
            }

            var1.append(
               String.format(
                  Locale.ROOT,
                  IIIIllIIIl<"IIIIllIIIl","vs+ZpsO52R2A06qS8mV5f+4b8B377nyIctiG0D/iApJ1p/QNEwYjOb3BfmHOUV+yWbDNBPCG/hIfYCVyf7QThLH95o8=">(),
                  Iliilliiilii(var5),
                  this.iiIliIiiiIIlliIiii[var5.ordinal()],
                  this.lIlliIiiiiIlliIiii[var5.ordinal()],
                  this.IllliIiiilllliIiii[var5.ordinal()],
                  this.IiIlliIliiIl(var5)
               )
            );
         }
      }

      return String.format(
         Locale.ROOT,
         IIIIllIIIl<"IIIIllIIIl","WgeAH4mF3+2gH8h0KbrQ6PsEskx0tRuYdLj0x3czUnpg6LAGsazb6+vEMVISX+mtbQsP0HDw0Ek5eDXRSmjNRt3Qb4PfEQo9LPB/EmF+7kUNDYIy2o8ghWn5r2DBrtKSWvxTBVXeZH9c4ekAy81Jd5HFg3VtqvzFnWjgAaZ+lgFwypM8DECxuIN4gYW8fckstJ2bpfzQ04o+i/4jOzRJgWToHRZFbth9e0frP2sEp2J7X5IANT8BT3vZfopH">(),
         this.IlIillIiilIi(),
         this.Iiilliiliiil(),
         this.IIIilIIiiIIi(),
         this.Illillliilli(),
         this.illliIiiiIilliIiii,
         this.lilliIiiiiilliIiii,
         var1
      );
   }

   public int IIillIiliIil(ilIIlliIiIIlli k) {
      return this.IllliIiiilllliIiii[k.ordinal()];
   }

   public void Iilililiiili() {
      this.IiIliIiiiliIliIiii.clear();
      Arrays.fill(this.iiIliIiiiIIlliIiii, 0);
      Arrays.fill(this.lIlliIiiiiIlliIiii, 0);
      Arrays.fill(this.IllliIiiilllliIiii, 0);
      this.illliIiiiIilliIiii = this.lilliIiiiiilliIiii = 0;
   }

   public int IiIlliIliiIl(ilIIlliIiIIlli k) {
      return this.IliIlllilIi(k).size();
   }

   public liIiiIiiiIiiIi() {
      this.lIlliIiiiiIlliIiii = new int[ilIIlliIiIIlli.values().length];
      this.IllliIiiilllliIiii = new int[ilIIlliIiIIlli.values().length];
   }

   public int Iilllilliill(ilIIlliIiIIlli k) {
      return this.lIlliIiiiiIlliIiii[k.ordinal()];
   }

   public void Ililllililil(ilIIlliIiIIlli kind, int n) {
      if (n > 0) {
         this.lIlliIiiiiIlliIiii[kind.ordinal()] += n;
      }
   }

   public int IIlilIliiIli() {
      return this.lilliIiiiiilliIiii;
   }

   public iIiIliIliIli iIlIlllllill(ilIIlliIiIIlli use, long semanticKey, LongUnaryOperator kind, iiiIlIllIIIllIll stateOf) {
      iIiIliIliIli var6 = this.IliIlllilIi(use).get(semanticKey);
      if (var6 != null && var6.iIlIlllllill(kind)) {
         if (stateOf == iiiIlIllIIIllIll.iliIiillll) {
            this.lIlliIiiiiIlliIiii[use.ordinal()]++;
         } else {
            this.IllliIiiilllliIiii[use.ordinal()]++;
         }

         return var6;
      } else {
         return null;
      }
   }

   public double Illillliilli() {
      long var2 = 275672249383852397L;
      var2 ^= ((long)(this.Iiilliiliiil() + this.IIIilIIiiIIi()) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) == 0 ? -1.0 : (double)this.Iiilliiliiil() / (double)((int)(var2 >>> 32));
   }

   public int Illlllllilll(ilIIlliIiIIlli k) {
      return this.iiIliIiiiIIlliIiii[k.ordinal()];
   }

   public int IlIillIiilIi() {
      long var6 = -4614125313992147197L;
      long var8 = 5011297098661072479L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.iiIliIiiiIIlliIiii;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < (int)var6) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
         var8 += 4294967296L;
      }

      return (int)(var6 >>> 32);
   }

   public int IiIiliIiiiIi() {
      return this.illliIiiiIilliIiii;
   }

   public int iliIiiliiiii(ilIIlliIiIIlli kind, LongUnaryOperator stateOf) {
      LinkedHashMap var3 = this.IliIlllilIi(kind);
      ArrayList var4 = new ArrayList();

      for (Entry var6 : var3.entrySet()) {
         if (!((iIiIliIliIli)var6.getValue()).iIlIlllllill(stateOf)) {
            var4.add((Long)var6.getKey());
         }
      }

      for (long var9 : var4) {
         var3.remove(Long.valueOf(var9));
      }

      this.illliIiiiIilliIiii = this.illliIiiiIilliIiii + var4.size();
      return var4.size();
   }

   public boolean liiiIIllIl(iIiIliIliIli c) {
      if (c == null) {
         return false;
      } else {
         LinkedHashMap var2 = this.IliIlllilIi(c.IIIllIIliIIl());
         iIiIliIliIli var3 = (iIiIliIliIli)var2.get(c.IlIlllIlilIl());
         if (var3 != null && var3.Ililllililil() == c.Ililllililil()) {
            this.lilliIiiiiilliIiii++;
            return false;
         } else {
            if (var3 == null && var2.size() >= 1024) {
               Iterator var4 = var2.keySet().iterator();
               var4.next();
               var4.remove();
            }

            var2.put(Long.valueOf(c.IlIlllIlilIl()), c);
            this.iiIliIiiiIIlliIiii[c.IIIllIIliIIl().ordinal()]++;
            return true;
         }
      }
   }

   public int Iiilliiliiil() {
      long var6 = 1297388078786870891L;
      long var8 = -4871898859223803291L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.lIlliIiiiiIlliIiii;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < (int)var6) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
         var8 += 4294967296L;
      }

      return (int)(var6 >>> 32);
   }

   public int IIIilIIiiIIi() {
      long var6 = 6443235697313898991L;
      long var8 = -8341745835659437755L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.IllliIiiilllliIiii;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < (int)var6) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
         var8 += 4294967296L;
      }

      return (int)(var6 >>> 32);
   }
}
