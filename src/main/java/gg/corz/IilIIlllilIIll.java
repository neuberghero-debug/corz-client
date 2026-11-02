package gg.corz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_418;
import net.minecraft.class_465;
import net.minecraft.class_5894;
import net.minecraft.class_5903;
import net.minecraft.class_5904;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_7439;
import net.minecraft.class_746;
import net.minecraft.class_8038;

public class IilIIlllilIIll extends ilIllIiIll {
   private final lliliIIiililiIIi lIlllIIiliIlllIIil;
   private class_2535 ilIilIIilIiIilIIil;
   private final ConcurrentLinkedQueue<String> iIillIIilIlillIIil;
   private IliIilillliIilil IlIilIIilllIilIIil;
   private final iiiIIIIlIIIlIIIl IiillIIilliillIIil;
   private static final long IIillIIillIillIIil = 2000L;
   public static final List<Class<? extends ilIllIiIll>> illllIIilIilllIIil = List.of(iIiIIiIlIliIIiIl.class, iiIlIIIiIIllIIIi.class, IlllilIlllllilIl.class);
   private static final int lilllIIiliilllIIil = 256;
   private final iiIiiilIIliiil IllllIIillllllIIil;
   private volatile long iiillIIilIIIilIIil;
   private final IIiiIIIllIiiIIIl iiIllIIilIIlllIIil = new IIiiIIIllIiiIIIl(
      IliIlllilIi<"IliIlllilIi","GzotXm4tCgmw+qYJzgjLZtcwzD8eMI3K8hRhORSdDIi7UFNVEw==">(),
      IliIlllilIi<"IliIlllilIi","Smsp3+cUTKaq+AF91lYwDSt7lNT6CZ+RMLBxkWwhOEqOuogJYwbbgbpzFJwfNptQcqhEWGivVJK3kZfFFSdi1liL6zTDm1L+0RE2xdIjR3QyZwCkyH7CVAqiVu7Mvv31+k7jaLwtz0ztGL4H7cgySxBRgB3DDEK9JbL7s4HiNCkIBgpQfgl3okj8o2O4Y8XjPYTWvgXW+cXoQow=">(),
      IliIlllilIi<"IliIlllilIi","CHBMNowgQy9xBdW7+/m4WaDiNW2aettguP78UF62rI4=">()
   );
   private int IIlilIIillIlilIIil;
   private final AtomicInteger llillIIililillIIil;
   private volatile Set<String> lIIilIIiliIIilIIil;
   private long liIilIIiliiIilIIil;

   private void ilIllIiIll(String cmd) {
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var2 != null && cmd != null && !cmd.isBlank()) {
         this.iiillIIilIIIilIIil = System.currentTimeMillis() + (5277877377665050553L ^ 5277877377665048681L);
         var2.method_45730(cmd);
      }
   }

   private List<String> IlIllllIll() {
      ArrayList var1 = new ArrayList();

      String var2;
      while ((var2 = this.iIillIIilIlillIIil.poll()) != null) {
         this.llillIIililillIIil.decrementAndGet();
         var1.add(var2);
      }

      return var1;
   }

   private String iIlllIllll() {
      for (Class var2 : illllIIilIilllIIil) {
         ilIllIiIll var3 = llilIllililIll.iliIiiliiiii(var2);
         if (var3 != null && var3 != this && var3.IliIlllilIi()) {
            return var3.IilliliilIIi();
         }
      }

      return null;
   }

   private Set<String> lllllillll() {
      HashSet var1 = new HashSet();
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var2 == null) {
         return var1;
      } else {
         for (class_640 var4 : var2.method_2880()) {
            if (var4 != null && var4.method_2966() != null && var4.method_2966().name() != null) {
               var1.add(var4.method_2966().name().toLowerCase(Locale.ROOT));
            }
         }

         return var1;
      }
   }

   private void iilllIIill(String good, boolean msg) {
      if (good != null) {
         if (!IliiliIllliiliIl.iiiIlIIIll()) {
            if (Iiiilllliiilll.field_1724 != null) {
               Iiiilllliiilll.field_1724
                  .method_7353(
                     class_2561.method_43470(IliIlllilIi<"IliIlllilIi","b62+CHnAE3V6QhnPyXDXoHyzFguO4gHfSe/beSo43TW1d8RgO9iNi490oDUkoitc">() + good), false
                  );
            }
         } else {
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","OKBmD8DFdqCB/aQinC23trMfiY983qeXd6lOu4C5L8Te1OWFtkHa">(), good, msg);
         }
      }
   }

   private void IIllllIlll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1755 instanceof class_465 && var1.field_7512 != var1.field_7498) {
         var1.method_7346();
      }
   }

   private void iiiIlIIIll(class_2596<?> p) {
      if (p instanceof class_7439 var2) {
         if (var2.comp_763() != null) {
            this.lIIlliIIll(var2.comp_763().getString());
         }
      } else if (p instanceof class_5894 var3) {
         if (var3.comp_2279() != null) {
            this.lIIlliIIll(var3.comp_2279().getString());
         }
      } else if (p instanceof class_5904 var4) {
         if (var4.comp_2281() != null) {
            this.lIIlliIIll(var4.comp_2281().getString());
         }
      } else if (p instanceof class_5903 var5 && var5.comp_2280() != null) {
         this.lIIlliIIll(var5.comp_2280().getString());
      }
   }

   private void Iillllilll(String msg, boolean good) {
      this.IlIilIIilllIilIIil = null;
      this.liIilIIiliiIilIIil = 0L;
      if (this.IliIlllilIi()) {
         try (AutoCloseable var3 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            this.IIillIiliIil(false);
         } catch (Exception var8) {
            this.IlIilIIilllIilIIil = null;
         }
      }

      if (msg != null) {
         this.iilllIIill(msg, good);
      }
   }

   public IilIIlllilIIll() {
      super(IliIlllilIi<"IliIlllilIi","OKBmD8DFdqCB/aQinC23trMfiY983qeXd6lOu4C5L8Te1OWFtkHa">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lIlllIIiliIlllIIil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","Z07+E516fBlVxrOntSoz018DSDGFWacI5FDXHvSdXMqlIw==">(),
         IliIlllilIi<"IliIlllilIi","Kmi9pBhGobH/aY9obAH6CZv6LETNmaccBlketa+dz05usXSkWGNXesbsDja1OqQXItCkzwirYNy0kb8tAeSarKHYqMfATZktyia9w0WexsBTTW7I3dZHtYNZ8eek">(),
         IliIlllilIi<"IliIlllilIi","HtzEqLvJNHRUoQWzkZWg51XTplVtgtmD9b7BDuvaWwyA9A==">(),
         iiiIIIIlIIIlIIIl.iIiIliIlIl.toArray(new String[0])
      );
      this.IllllIIillllllIIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","9Af7eTcgu308l7CiS6krr/JbPjW/I6JG7UNiBbiETJwaxY4ihnTX0jg=">(),
         IliIlllilIi<"IliIlllilIi","OUmtVl08VCmj/gDUNoHqsD0o4msPp30u56tgqCwpTgfjdMW9Rnyy5WTh3Fm0jCk9q+L768kB7akZJan34SxRx66G87rJRPEkTLZzKi33+J5UU7T8jYcEQ8xmDVYzoQVlm10=">(),
         true
      );
      this.iIillIIilIlillIIil = new ConcurrentLinkedQueue<>();
      this.llillIIililillIIil = new AtomicInteger();
      this.IiillIIilliillIIil = new iiiIIIIlIIIlIIIl();
      this.lIIilIIiliIIilIIil = Set.of();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiIllIIilIIlllIIil, this.lIlllIIiliIlllIIil, this.IllllIIillllllIIil});
   }

   @Override
   protected void Iilililiiili() {
      this.IlIilIIilllIilIIil = null;
      this.ilIilIIilIiIilIIil = null;
      this.iiillIIilIIIilIIil = 0L;
      this.iIillIIilIlillIIil.clear();
      this.llillIIililillIIil.set(0);
   }

   private void lIIlliIIll(String s) {
      if (s != null && !s.isBlank() && this.llillIIililillIIil.get() < (~(-(~-1350370206)) * 1527099483 ^ 351766900)) {
         this.iIillIIilIlillIIil.offer(s);
         this.llillIIililillIIil.incrementAndGet();
      }
   }

   @Override
   protected void Illillliilli() {
      this.iIillIIilIlillIIil.clear();
      this.llillIIililillIIil.set(0);
      this.IlIilIIilllIilIIil = null;
      this.ilIilIIilIiIilIIil = null;
      this.liIilIIiliiIilIIil = 0L;
      this.IIlilIIillIlilIIil = 0;
      if (Iiiilllliiilll != null) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null) {
            String var1 = this.iIlllIllll();
            if (var1 != null) {
               Iiiilllliiilll.method_63588(
                  () -> this.Iillllilll(
                        IliIlllilIi<"IliIlllilIi","k1v5PnNRNRUc9kseHWfj8oMcF5tgfr6dSbCGMt/2L4U6PyLRfw==">()
                           + var1
                           + IliIlllilIi<"IliIlllilIi","QM5P7pvEpImF89OxYxN/B9TA6EYBEkaFFM5n2qi/l9FydzA=">(),
                        false
                     )
               );
            } else {
               String var2 = this.iiIllIIilIIlllIIil.Iilllilliill() == null ? "" : this.iiIllIIilIIlllIIil.Iilllilliill().trim();
               if (!IliIilillliIilil.IliIlllilIi(var2)) {
                  Iiiilllliiilll.method_63588(
                     () -> this.Iillllilll(
                           IliIlllilIi<"IliIlllilIi","2kdT7GjlurmNtqXuDIZpTbH+K0EZzfo1VTe378IdwWPXooS7//jJkzmxtc2N3X/yD/LoFL0eW5OGgJ7KBWnyH0B7KYFiJYYseC3QdfQ=">(),
                           false
                        )
                  );
               } else {
                  this.IlIilIIilllIilIIil = new IliIilillliIilil(var2, this.lIlllIIiliIlllIIil.Iilllilliill(), this.IiillIIilliillIIil);
                  this.ilIilIIilIiIilIIil = Iiiilllliiilll.method_1562().method_48296();
                  this.lIIilIIiliIIilIIil = this.lllllillll();
                  this.iiillIIilIIIilIIil = System.currentTimeMillis() + (-1749968427398981313L ^ -1749968427398979857L);
               }
            }
         } else {
            Iiiilllliiilll.method_63588(() -> this.Iillllilll(null, false));
         }
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null) {
         long var1 = System.currentTimeMillis();
         if (this.IlIilIIilllIilIIil == null) {
            if (this.liIilIIiliiIilIIil > 0L && var1 >= this.liIilIIiliiIilIIil) {
               this.Iillllilll(null, false);
            }
         } else if (Iiiilllliiilll.method_1562().method_48296() != this.ilIilIIilIiIilIIil) {
            this.Iillllilll(
               IliIlllilIi<"IliIlllilIi","tRg1SwNIXHt0B/66PnGjCz4w3sE1yh0Orva7uuh1DG6cpb4S02/bP43bfDDvQImpnhdcIhO5T91wLwZ9fkIGAoEzi71GzA==">(), false
            );
         } else {
            this.IIlilIIillIlilIIil++;
            if (this.IIlilIIillIlilIIil % 20 == 0) {
               this.lIIilIIiliIIilIIil = this.lllllillll();
            }

            class_746 var3 = Iiiilllliiilll.field_1724;
            List var4 = this.IlIllllIll();
            IIIiIiillIIiIiil var5 = new IIIiIiillIIiIiil(
               Iiiilllliiilll.field_1687.method_27983().method_29177().toString(), var3.method_23317(), var3.method_23318(), var3.method_23321()
            );
            boolean var6 = Iiiilllliiilll.field_1755 instanceof class_465 && var3.field_7512 != var3.field_7498;
            boolean var7 = !var3.method_5805() || Iiiilllliiilll.field_1755 instanceof class_418;
            Set var8 = this.lIIilIIiliIIilIIil;
            lllIiIiillIiIi var9 = this.IlIilIIilllIilIIil
               .IiIlliIliiIl(
                  new IilIiilllilIiill(
                     var1, var5, var3.method_24828() || var3.method_5799(), var6, var7, var4, names -> var8.contains(names.toLowerCase(Locale.ROOT))
                  )
               );
            if (this.IlIilIIilllIilIIil.IlIlllIlilIl(var1)) {
               this.iiillIIilIIIilIIil = var1 + 2000L;
            }

            switch (var9.IliIlllilIi()) {
               case liIiIlllll:
                  this.ilIllIiIll(var9.liiiIIllIl());
                  break;
               case iiIiIlllll:
                  this.liIlliiIll(var9.liiiIIllIl());
                  break;
               case iIliIlllll:
                  this.IIllllIlll();
                  this.Iillllilll(var9.liiiIIllIl(), false);
                  break;
               case lIliIlllll:
                  this.Iillllilll(var9.liiiIIllIl(), false);
                  break;
               case IIliIlllll:
                  this.IlIilIIilllIilIIil = null;
                  this.liIilIIiliiIilIIil = var1 + 2000L;
                  this.iilllIIill(var9.liiiIIllIl(), true);
            }
         }
      }
   }

   private void liIlliiIll(String arg) {
      class_746 var2 = Iiiilllliiilll.field_1724;
      if (var2 != null && arg != null && var2.field_7512 instanceof class_1707 var3) {
         String var12 = arg.toLowerCase(Locale.ROOT);
         String var5 = var12.replace(IliIlllilIi<"IliIlllilIi","VeYiYI1WyWM+lXdlvD2pAbUxBgsSyt5nTvBKGLk=">(), "");
         int var6 = var3.method_17388() * 9;

         for (int var7 = 0; var7 < var6 && var7 < var3.field_7761.size(); var7++) {
            class_1799 var8 = var3.method_7611(var7).method_7677();
            if (!var8.method_7960()) {
               String var9 = iiilliilIIIiliil.IliIlllilIi(var8.method_7964().getString());
               if (var9.contains(var12)
                  || var9.replace(IliIlllilIi<"IliIlllilIi","VeYiYI1WyWM+lXdlvD2pAbUxBgsSyt5nTvBKGLk=">(), "")
                     .replace(IliIlllilIi<"IliIlllilIi","TbiOQtfty56E6DamKfU1GfQwyJrB3e8RPHAaJyE=">(), "")
                     .contains(var5)) {
                  int var10 = var3.field_7763;
                  int var11 = var7;
                  lIlIiIliIlIiIl.iIlIlllllill(() -> {
                     if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1724.field_7512.field_7763 == var10) {
                        Iiiilllliiilll.field_1761.method_2906(var10, var11, 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
                     }
                  }, false);
                  return;
               }
            }
         }
      }
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      if (e != null && e.iilIIiiIll != null) {
         if (!(e.iilIIiiIll instanceof class_8038 var2)) {
            if (e.iilIIiiIll instanceof class_7439 var5 && var5.comp_763() != null) {
               String var8 = var5.comp_763().getString();
               this.lIIlliIIll(var8);
               if (!var5.comp_906() && this.IllllIIillllllIIil.Iilllilliill() && System.currentTimeMillis() <= this.iiillIIilIIIilIIil) {
                  Set var9 = this.lIIilIIiliIIilIIil;
                  if (lIlIlliliIlIllil.iIlIlllllill(var8, n -> var9.contains(n.toLowerCase(Locale.ROOT)))) {
                     e.IliIlllilIi();
                  }
               }

               return;
            }

            this.iiiIlIIIll(e.iilIIiiIll);
         } else {
            for (class_2596 var4 : var2.method_48324()) {
               this.iiiIlIIIll(var4);
            }
         }
      }
   }
}
