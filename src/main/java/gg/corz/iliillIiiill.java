package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class iliillIiiill {
   private int iliIlIliIiiIlIli;
   private int liiIlIliiiiIlIli;
   private int IliIlIlilliIlIli;
   private List<liliIIIliiliIIIl> iilIlIliIIiIlIli;
   private List<String> lIiIlIliiIiIlIli;
   private final HashMap<String, IIiiiiIllIiiiiIl> IilIlIlililIlIli = new HashMap<>();
   private boolean IIIllIlilIIllIli;

   public int IlIlllIlilIl() {
      return this.liiIlIliiiiIlIli;
   }

   public List<String> IIIllIIliIIl() {
      return this.lIiIlIliiIiIlIli;
   }

   public List<liliIIIliiliIIIl> iliIiiliiiii() {
      return this.iilIlIliIIiIlIli;
   }

   public void liiiIIllIl(String tier, UUID id, IIiIIlIilIiIIlIi rgb, int name) {
      if (tier != null && !tier.isEmpty() && rgb != null) {
         IIiiiiIllIiiiiIl var5 = this.IilIlIlililIlIli.get(tier);
         if (var5 == null) {
            var5 = new IIiiiiIllIiiiiIl();
            var5.IIiiIiIlll = new liliIIIliiliIIIl(tier, id, rgb, name);
            this.IilIlIlililIlIli.put(tier, var5);
            this.IIIllIlilIIllIli = true;
         } else {
            if (var5.lIiiIiIlll == this.IliIlIlilliIlIli) {
               return;
            }

            if (!var5.IIiiIiIlll.IliIlllilIi(id, rgb, name)) {
               var5.IIiiIiIlll = new liliIIIliiliIIIl(tier, id, rgb, name);
               this.IIIllIlilIIllIli = true;
            }
         }

         var5.lIiiIiIlll = this.IliIlIlilliIlIli;
         this.iliIlIliIiiIlIli++;
      }
   }

   private void lIiiIiIlilli() {
      ArrayList var1 = new ArrayList(this.IilIlIlililIlIli.size());

      for (IIiiiiIllIiiiiIl var3 : this.IilIlIlililIlIli.values()) {
         var1.add(var3.IIiiIiIlll);
      }

      var1.sort((b, a) -> {
         long var3x = -8248860688336892168L;
         var3x ^= ((long)String.CASE_INSENSITIVE_ORDER.compare(b.llIIllllIl, a.llIIllllIl) << 32 ^ var3x) & -1L << 32;
         return (int)(var3x >>> 32) != 0 ? (int)(var3x >>> 32) : b.llIIllllIl.compareTo(a.llIIllllIl);
      });
      String[] var4 = new String[var1.size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = ((liliIIIliiliIIIl)var1.get(var5)).llIIllllIl;
      }

      this.iilIlIliIIiIlIli = List.copyOf(var1);
      this.lIiIlIliiIiIlIli = List.of(var4);
      this.liiIlIliiiiIlIli++;
   }

   public liliIIIliiliIIIl IIlllIlliIll(String name) {
      IIiiiiIllIiiiiIl var2 = name == null ? null : this.IilIlIlililIlIli.get(name);
      return var2 == null ? null : var2.IIiiIiIlll;
   }

   public boolean iIlIlllllill() {
      if (this.iliIlIliIiiIlIli != this.IilIlIlililIlIli.size()) {
         Iterator var1 = this.IilIlIlililIlIli.values().iterator();

         while (var1.hasNext()) {
            if (((IIiiiiIllIiiiiIl)var1.next()).lIiiIiIlll != this.IliIlIlilliIlIli) {
               var1.remove();
            }
         }

         this.IIIllIlilIIllIli = true;
      }

      if (!this.IIIllIlilIIllIli) {
         return false;
      } else {
         this.IIIllIlilIIllIli = false;
         this.lIiiIiIlilli();
         return true;
      }
   }

   public iliillIiiill() {
      this.iilIlIliIIiIlIli = List.of();
      this.lIiIlIliiIiIlIli = List.of();
   }

   public int IiIlliIliiIl() {
      return this.iilIlIliIIiIlIli.size();
   }

   public void IliIlllilIi() {
      this.IliIlIlilliIlIli++;
      this.iliIlIliIiiIlIli = 0;
   }

   public void IilliliilIIi() {
      this.IIIllIlilIIllIli = false;
      if (!this.IilIlIlililIlIli.isEmpty() || !this.iilIlIliIIiIlIli.isEmpty()) {
         this.IilIlIlililIlIli.clear();
         this.lIiiIiIlilli();
      }
   }
}
