package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.LongUnaryOperator;

public final class iiiliIIIii {
   private final Map<Long, IIllIlilIllIli> lIllIlIliIllIlIl = new LinkedHashMap<>();

   public int IiIlliIliiIl(LongUnaryOperator tick, int stateOf) {
      long var7 = 4672754004003716196L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for (Entry var5 : this.lIllIlIliIllIlIl.entrySet()) {
         IIllIlilIllIli var6 = (IIllIlilIllIli)var5.getValue();
         if (var6.IIIilIIiiIIi() != IIIIlIlllIIIlIll.IiliIlllll && IlIlllIlilIl(var6, tick)) {
            var5.setValue(
               new IIllIlilIllIli(
                  var6.IlIlllIlilIl(),
                  var6.IiIlliIliiIl(),
                  var6.IIlllIlliIll(),
                  var6.Illlllllilll(),
                  var6.Iilllilliill(),
                  iIiIliIliIli.liiiIIllIl(var6.Iilllilliill(), tick),
                  var6.IiIiliIiiiIi() == null ? 0L : var6.IiIiliIiiiIi().IilliliilIIi(tick),
                  stateOf,
                  IIIIlIlllIIIlIll.llliIlllll,
                  List.of(),
                  var6.IiIiliIiiiIi(),
                  -1
               )
            );
            var7 += 4294967296L;
         }
      }

      return (int)(var7 >>> 32);
   }

   public void IilliliilIIi(IIllIlilIllIli o) {
      this.lIllIlIliIllIlIl.put(o.IlIlllIlilIl(), o);
   }

   public IIllIlilIllIli liiiIIllIl(
      long previousCapability, long stateOf, int causalCell, long[] tick, LongUnaryOperator causalCells, iilililIIiilil target, int scope
   ) {
      IIllIlilIllIli var10 = this.lIllIlIliIllIlIl.get(previousCapability);
      if (var10 != null && var10.IliIlllilIi()) {
         return var10;
      } else {
         IIllIlilIllIli var11 = new IIllIlilIllIli(
            previousCapability,
            stateOf,
            causalCell,
            causalCell,
            tick,
            iIiIliIliIli.liiiIIllIl(tick, causalCells),
            target == null ? 0L : target.IilliliilIIi(causalCells),
            scope,
            IIIIlIlllIIIlIll.llliIlllll,
            List.of(),
            target,
            -1
         );
         this.lIllIlIliIllIlIl.put(previousCapability, var11);
         return var11;
      }
   }

   public static String IliIlllilIi(long packed) {
      return llIiIiililIiIiil.IiIlliIliiIl(packed)
         + Illlllllilll<"Illlllllilll","kYhNNx5SlcFeWpoSr510YSuOcNmiwxXD6KtNt2+3">()
         + llIiIiililIiIiil.IIlllIlliIll(packed)
         + Illlllllilll<"Illlllllilll","kYhNNx5SlcFeWpoSr510YSuOcNmiwxXD6KtNt2+3">()
         + llIiIiililIiIiil.Illlllllilll(packed);
   }

   public void IIIllIIliIIl() {
      this.lIllIlIliIllIlIl.clear();
   }

   public int iliIiiliiiii() {
      return this.lIllIlIliIllIlIl.size();
   }

   public boolean IIlllIlliIll(long cell) {
      for (IIllIlilIllIli var4 : this.lIllIlIliIllIlIl.values()) {
         if (var4.IliIlllilIi() && var4.IiIiliIiiiIi() != null && var4.IiIiliIiiiIi().liiiIIllIl(cell)) {
            return false;
         }
      }

      return true;
   }

   public static boolean IlIlllIlilIl(IIllIlilIllIli o, LongUnaryOperator stateOf) {
      if (o == null) {
         return false;
      } else {
         long var2 = o.IiIiliIiiiIi() == null ? 0L : o.IiIiliIiiiIi().IilliliilIIi(stateOf);
         return iIiIliIliIli.liiiIIllIl(o.Iilllilliill(), stateOf) != o.IIillIiliIil() || var2 != o.Ililllililil();
      }
   }

   public List<IIllIlilIllIli> lIiiIiIlilli() {
      ArrayList var1 = new ArrayList();

      for (IIllIlilIllIli var3 : this.lIllIlIliIllIlIl.values()) {
         if (var3.IliIlllilIi()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public IIllIlilIllIli iIlIlllllill(long target) {
      return this.lIllIlIliIllIlIl.get(target);
   }
}
