package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class iIIilIlIil {
   private final Map<String, liIIlIliiiIIlIli> lIliIliiIliIli = new HashMap<>();
   private long IIiiIlilIiiIli;
   public static final long iiIiIliIIliIli = 200L;
   private IiiIlillliiIlill liliIliiiliIli;
   private final Set<String> IlliIlillliIli = new HashSet<>();
   private List<IiiIlillliiIlill> illiIliIiliIli = List.of();

   public void IliIlllilIi() {
      this.lIliIliiIliIli.clear();
      this.illiIliIiliIli = List.of();
      this.liliIliiiliIli = null;
      this.IIiiIlilIiiIli = 8947625356945943288L ^ -275746679908832520L;
   }

   public List<IiiIlillliiIlill> IilliliilIIi() {
      return this.illiIliIiliIli;
   }

   public iIIilIlIil() {
      this.IIiiIlilIiiIli = 4477431945771117751L ^ -4745940091083658057L;
   }

   public boolean lIiiIiIlilli() {
      return !this.illiIliIiliIli.isEmpty();
   }

   public int IlIlllIlilIl() {
      return this.IlliIlillliIli.size();
   }

   public IiiIlillliiIlill iliIiiliiiii() {
      return this.illiIliIiliIli.isEmpty() ? null : this.illiIliIiliIli.get(0);
   }

   public void liiiIIllIl() {
      this.IlliIlillliIli.clear();
   }

   public IiiIlillliiIlill IIIllIIliIIl(long tick) {
      return this.liliIliiiliIli != null && tick - this.IIiiIlilIiiIli <= (-407707178691547630L ^ -407707178691547430L) ? this.liliIliiiliIli : null;
   }

   public List<IiiIlillliiIlill> iIlIlllllill(long range, double ignoreFriends, double sy, double seen, List<iliillllIiiillll> sz, double sx, boolean tick) {
      ArrayList var13 = new ArrayList(2);
      double var14 = sx * sx;
      HashSet var16 = new HashSet();
      if (sz != null) {
         for (iliillllIiiillll var18 : sz) {
            if (var18 != null && var18.IliIlllilIi() != null && !var18.iliIiiliiiii() && (!tick || !var18.lIiiIiIlilli())) {
               double var19 = var18.liiiIIllIl() - ignoreFriends;
               double var21 = var18.iIlIlllllill() - sy;
               double var23 = var18.IilliliilIIi() - seen;
               double var25 = var19 * var19 + var21 * var21 + var23 * var23;
               if (!(var25 > var14)) {
                  double var27 = Math.sqrt(var25);
                  String var29 = var18.IliIlllilIi().toLowerCase(Locale.ROOT);
                  var16.add(var29);
                  liIIlIliiiIIlIli var30 = this.lIliIliiIliIli.get(var29);
                  long var31 = var30 != null && range - var30.liiiIIllIl() <= 200L ? var30.IliIlllilIi() : range;
                  double var33 = var30 != null && range > var30.liiiIIllIl() ? (var30.iIlIlllllill() - var27) / (double)(range - var30.liiiIIllIl()) : 0.0;
                  this.lIliIliiIliIli.put(var29, new liIIlIliiiIIlIli(var31, range, var27, var18.liiiIIllIl(), var18.iIlIlllllill(), var18.IilliliilIIi()));
                  this.IlliIlillliIli.add(var29);
                  var13.add(new IiiIlillliiIlill(var18.IliIlllilIi(), var18.liiiIIllIl(), var18.iIlIlllllill(), var18.IilliliilIIi(), var27, var33, var31));
               }
            }
         }
      }

      this.lIliIliiIliIli.keySet().removeIf(tickx -> !var16.contains(tickx) && range - this.lIliIliiIliIli.get(tickx).liiiIIllIl() > 200L);
      var13.sort((a, b) -> Double.compare(a.lIiiIiIlilli(), b.lIiiIiIlilli()));
      this.illiIliIiliIli = List.copyOf(var13);
      if (!this.illiIliIiliIli.isEmpty()) {
         this.liliIliiiliIli = this.illiIliIiliIli.get(0);
         this.IIiiIlilIiiIli = range;
      }

      return this.illiIliIiliIli;
   }
}
