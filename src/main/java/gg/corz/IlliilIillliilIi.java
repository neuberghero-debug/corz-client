package gg.corz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.LongSupplier;

public final class IlliilIillliilIi {
   public long IlIiillIIi;
   public static final int ililillIIi = 256;
   public long llIiillIIi;
   public long ilIiillIIi;
   public static final int IiilillIIi = 3;
   private long iiilillIIi;
   public long IIIiillIIi;
   private final Map<Long, IIllIiillIllIiil> liilillIIi = new HashMap<>();
   public long lIIiillIIi;
   public long iIIiillIIi;

   public IIllIiillIllIiil Illlllllilll(long target) {
      return this.liilillIIi.get(target);
   }

   public illliiIiIilliiIi IliIlllilIi(
      long target, String feetNow, String clockNow, liliIliiliIl observed, String owner, long fingerprintNow, LongSupplier kind, long desired
   ) {
      IIllIiillIllIiil var12 = this.liilillIIi.get(target);
      if (var12 == null) {
         if (this.liilillIIi.size() >= 256) {
            this.Ililllililil();
         }

         var12 = new IIllIiillIllIiil(this.iiilillIIi++, target, observed, feetNow, clockNow);
         this.liilillIIi.put(target, var12);
         this.IIIiillIIi++;
      }

      switch (var12.lllliillil) {
         case iIIiIiIlll:
            if (!var12.illliillil.equals(owner)) {
               this.ilIiillIIi++;
               var12.Iiiliillil++;
               return illliiIiIilliiIi.liiIlIIlIi;
            } else {
               if (var12.lliliillil >= 3) {
                  this.lIiiIiIlilli(
                     var12,
                     IlIillIiilIi<"IlIillIiilIi","W8HpCWlLsSZ/o5CweMtzxS2y/0GeQ9+y0L25UmvtEx2bnZFFEBwnwKyuN8pLxln5vPU=">(),
                     var12.lilliillil,
                     new ilillIiill(fingerprintNow, kind.getAsLong(), (long[])null)
                  );
                  return illliiIiIilliiIi.IIIllIIlIi;
               }

               var12.lliliillil++;
               return illliiIiIilliiIi.IiiIlIIlIi;
            }
         case IlIiIiIlll:
            String var14 = liiiIIllIl(var12, fingerprintNow, kind, desired);
            if (var14 == null) {
               this.IlIiillIIi++;
               var12.ililiillil++;
               return illliiIiIilliiIi.iiiIlIIlIi;
            }

            this.llIiillIIi++;
            var12.Ililiillil++;
            var12.IIiliillil = var14;
            var12.iilliillil = "";
            var12.lilliillil = IlIillIiilIi<"IlIillIiilIi","DD2Vm+32dldWxOyzi8NB1xRsopSLnXKzrjHwAsR5kv4=">();
            var12.lllliillil = lIliiiIliIliiiIl.lIIiIiIlll;
            var12.illliillil = owner;
            var12.lliliillil = 1;
            var12.ililiillil = 0;
            var12.Iiiliillil = 0;
            return illliiIiIilliiIi.lIIllIIlIi;
         case IIIiIiIlll:
            IIllIiillIllIiil var13 = new IIllIiillIllIiil(this.iiilillIIi++, target, observed, feetNow, clockNow);
            this.liilillIIi.put(target, var13);
            this.IIIiillIIi++;
            var13.lllliillil = lIliiiIliIliiiIl.lIIiIiIlll;
            var13.illliillil = owner;
            var13.lliliillil = 1;
            return illliiIiIilliiIi.IiiIlIIlIi;
         default:
            if (var12.lliliillil >= 3) {
               this.lIiiIiIlilli(
                  var12,
                  IlIillIiilIi<"IlIillIiilIi","W8HpCWlLsSZ/o5CweMtzxS2y/0GeQ9+y0L25UmvtEx2bnZFFEBwnwKyuN8pLxln5vPU=">(),
                  var12.lilliillil,
                  new ilillIiill(fingerprintNow, kind.getAsLong(), (long[])null)
               );
               return illliiIiIilliiIi.IIIllIIlIi;
            } else {
               var12.lllliillil = lIliiiIliIliiiIl.lIIiIiIlll;
               var12.illliillil = owner;
               var12.lliliillil++;
               return illliiIiIilliiIi.IiiIlIIlIi;
            }
      }
   }

   public void iIlIlllllill(long accessProof, long target, String executableStand) {
      IIllIiillIllIiil var6 = this.liilillIIi.get(accessProof);
      if (var6 != null) {
         var6.Iilliillil = target;
         var6.lilliillil = executableStand == null ? IlIillIiilIi<"IlIillIiilIi","DD2Vm+32dldWxOyzi8NB1xRsopSLnXKzrjHwAsR5kv4=">() : executableStand;
      }
   }

   public void IiIlliIliiIl(long target) {
      this.liilillIIi.remove(target);
   }

   private static String liiiIIllIl(IIllIiillIllIiil clockNow, long fingerprintNow, LongSupplier t, long feetNow) {
      ilillIiill var6 = clockNow.lIiliillil;
      if (var6 == null) {
         return IlIillIiilIi<"IlIillIiilIi","ZbBMI05eqdoPiy955pFDLBvwIEn63D6zhIIaEVpjBf3RVSCoRzorqkWcG3d4z5tTPQQ=">();
      } else if (!var6.iIlIlllllill(feetNow)) {
         return IlIillIiilIi<"IlIillIiilIi","i0+6Mi8Tfd5vOfSMMj+6wJnQzMePeZxkQLTl/ReAcjQemiZmmYqPqQ2J+Qu8">();
      } else {
         if (fingerprintNow != var6.IiilIIiliilIIi) {
            long var7 = t.getAsLong();
            if (var7 != var6.iiilIIiIIIiIIi) {
               return IlIillIiilIi<"IlIillIiilIi","+oc2SayS/zjv/XrPVl2PmUMfObNakhDYjYvw7F/RzCQ1rZVaItM9wqROZ3hT4T4Hrb11P1JZrg==">();
            }

            clockNow.lIiliillil = var6.IilliliilIIi(fingerprintNow);
         }

         return null;
      }
   }

   public void IIillIiliIil() {
      this.liilillIIi.clear();
   }

   public int IlIlllIlilIl(String owner) {
      long var5 = 426837054734499186L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (IIllIiillIllIiil var4 : this.liilillIIi.values()) {
         if (var4.lllliillil == lIliiiIliIliiiIl.lIIiIiIlll && var4.illliillil.equals(owner)) {
            var4.lllliillil = lIliiiIliIliiiIl.IIIiIiIlll;
            var4.illliillil = "";
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   private void lIiiIiIlilli(IIllIiillIllIiil reason, String t, String dependency, ilillIiill accessProof) {
      reason.lllliillil = lIliiiIliIliiiIl.iIIiIiIlll;
      reason.iilliillil = t == null ? "" : t;
      reason.lilliillil = dependency == null ? IlIillIiilIi<"IlIillIiilIi","DD2Vm+32dldWxOyzi8NB1xRsopSLnXKzrjHwAsR5kv4=">() : dependency;
      reason.lIiliillil = accessProof;
      reason.iIiliillil++;
      reason.lliliillil = 0;
      reason.ililiillil = 0;
      reason.illliillil = "";
      this.iIIiillIIi++;
   }

   public IlliilIillliilIi() {
      this.iiilillIIi = 1L;
   }

   public void iliIiiliiiii(long target) {
      IIllIiillIllIiil var3 = this.liilillIIi.get(target);
      if (var3 != null) {
         var3.lllliillil = lIliiiIliIliiiIl.IlIiIiIlll;
         var3.illliillil = "";
         this.lIIiillIIi++;
      }
   }

   public int Iilllilliill() {
      return this.liilillIIi.size();
   }

   public String Iiilliiliiil() {
      return IlIillIiilIi<"IlIillIiilIi","aEVQz8uoNsgLC93A5McFmVhpJIZpQAva6GdEX18gDBBHX30sQMljwryS">()
         + this.IIIiillIIi
         + IlIillIiilIi<"IlIillIiilIi","MF/uCwMCJYdSp55he/M++4+byy53xKG4itnSZVXde+k6msfxtimkqCxqoVRM">()
         + this.lIIiillIIi
         + IlIillIiilIi<"IlIillIiilIi","CAdn4G1ny5rHolbUr8ZlQ3eyZ3/Ge+GfUQ/uvIAiXeLAgJ3eB9VnhM4W2A==">()
         + this.iIIiillIIi
         + IlIillIiilIi<"IlIillIiilIi","jCiF7/7/2Kulczy8TUcApFMurTLc+lWuFdRKFvt1Lbw1+wtEfij/FvtmuTDmlQ==">()
         + this.IlIiillIIi
         + IlIillIiilIi<"IlIillIiilIi","vc720zXtwp0GbgR5jMdO6xRnjseoB/qsey6ttHyko5SlFrlKSPUgOZDjXg==">()
         + this.llIiillIIi
         + IlIillIiilIi<"IlIillIiilIi","/hdvlzMKFnLnKfiY5Dg97p4PmhIp/X8rq7RF78HWd7KXuTgmcrd1/h+gVMbIhdXQzYk//rZi+7pRzHJAoR8=">()
         + this.ilIiillIIi;
   }

   public void IIIllIIliIIl(long target) {
      IIllIiillIllIiil var3 = this.liilillIIi.get(target);
      if (var3 != null && var3.lllliillil == lIliiiIliIliiiIl.lIIiIiIlll) {
         var3.lllliillil = lIliiiIliIliiiIl.IIIiIiIlll;
         var3.illliillil = "";
      }
   }

   public boolean IIlllIlliIll(long target, long fingerprintNow, LongSupplier feetNow, long clockNow) {
      IIllIiillIllIiil var8 = this.liilillIIi.get(target);
      return var8 != null && var8.lllliillil == lIliiiIliIliiiIl.iIIiIiIlll && liiiIIllIl(var8, fingerprintNow, feetNow, clockNow) == null;
   }

   public void IilliliilIIi(long accessProof, String dependency, String target, ilillIiill reason) {
      IIllIiillIllIiil var6 = this.liilillIIi.get(accessProof);
      if (var6 != null) {
         this.lIiiIiIlilli(var6, dependency, target, reason);
      }
   }

   public static String IIIilIIiiIIi(IIllIiillIllIiil memoryHit, boolean t) {
      return String.format(
         Locale.ROOT,
         IlIillIiilIi<"IlIillIiilIi","1zFqDTyCwxFeCMJBnn4b+Ss7859HaKeT9SlTw55AOOMclrWXFC/7v3hKGU6qRN97h34l1kf6ipJZNvYk3mZGwzoaMS+nuaOVsdMxRF9vBgEnS91Ll0K2nBvmJDdV8zwWeC/YZcQ+YVGdMXte1efCw8EuZKVFwtDVPA7aPQNpYhPyc7iQr4awBS0fJTgVP9nGBIXfama7h7isS/Fui/K0q5+Y39+Wq9p7rx0=">(),
         memoryHit.lIlliillil,
         memoryHit.lllliillil,
         memoryHit.lilliillil,
         memoryHit.iilliillil.isEmpty() ? IlIillIiilIi<"IlIillIiilIi","DD2Vm+32dldWxOyzi8NB1xRsopSLnXKzrjHwAsR5kv4=">() : memoryHit.iilliillil,
         memoryHit.lIiliillil == null
            ? IlIillIiilIi<"IlIillIiilIi","DD2Vm+32dldWxOyzi8NB1xRsopSLnXKzrjHwAsR5kv4=">()
            : Long.toUnsignedString(memoryHit.lIiliillil.iiilIIiIIIiIIi)
               + (
                  memoryHit.lIiliillil.IliIlllilIi()
                     ? IlIillIiilIi<"IlIillIiilIi","SrZzTif9rxOHW4M3/D3knT2zxkDQnZVMAdKf4r4K0ZThw/zwoRr5">()
                        + memoryHit.lIiliillil.liiiIIllIl()
                        + IlIillIiilIi<"IlIillIiilIi","4fmVRLBSNt3J+qyrIFlAsF6ozkNDYrRD+nygV2k=">()
                     : ""
               ),
         t,
         memoryHit.IIiliillil.isEmpty() ? IlIillIiilIi<"IlIillIiilIi","DD2Vm+32dldWxOyzi8NB1xRsopSLnXKzrjHwAsR5kv4=">() : memoryHit.IIiliillil,
         memoryHit.iiIliillil,
         memoryHit.lliliillil,
         memoryHit.iIiliillil
      );
   }

   private void Ililllililil() {
      long var6 = 3418075456422957306L;
      long var1 = 0L;
      var6 ^= (0L ^ var6) & -1L << 32;

      for (Entry var5 : this.liilillIIi.entrySet()) {
         if (((IIllIiillIllIiil)var5.getValue()).lllliillil == lIliiiIliIliiiIl.IlIiIiIlll
            || ((IIllIiillIllIiil)var5.getValue()).lllliillil == lIliiiIliIliiiIl.iIIiIiIlll) {
            var1 = (Long)var5.getKey();
            var6 ^= (4294967296L ^ var6) & -1L << 32;
            break;
         }
      }

      if ((int)(var6 >>> 32) == 0) {
         var1 = this.liilillIIi.keySet().iterator().next();
      }

      this.liilillIIi.remove(var1);
   }
}
