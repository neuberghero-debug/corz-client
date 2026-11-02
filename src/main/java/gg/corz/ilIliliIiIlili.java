package gg.corz;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.Map.Entry;

public final class ilIliliIiIlili {
   private final lillililiillilil iiIIIIlIIl;
   private final IiIIIlliIIIl ilIIIIlIIl = new IiIIIlliIIIl();
   private final String llIIIIlIIl;
   private final String iIIIIIlIIl;
   private boolean lIlIIIlIIl;
   private final UUID IlIIIIlIIl;
   private int IIlIIIlIIl;
   private final lliilIlliliilIll IiIIIIlIIl = new lliilIlliliilIll();
   private boolean iIlIIIlIIl;
   private final iliilIIlIiiilIIl liIIIIlIIl;

   public lliilIlliliilIll lIiiIiIlilli() {
      return this.IiIIIIlIIl;
   }

   public String iIlIlllllill() {
      return this.llIIIIlIIl;
   }

   public boolean IIlllIlliIll() {
      return this.lIlIIIlIIl;
   }

   public String IliIlllilIi() {
      return this.iIIIIIlIIl;
   }

   public void IiIlliIliiIl() {
      if (this.IIlIIIlIIl < 1000000) {
         this.IIlIIIlIIl++;
      }

      this.iIlIIIlIIl = true;
   }

   public lillililiillilil IIIllIIliIIl() {
      return this.iiIIIIlIIl;
   }

   public ilIliliIiIlili(String name, UUID rnd, Random uuid) {
      this.iiIIIIlIIl = new lillililiillilil();
      this.iIIIIIlIIl = name == null ? "" : name;
      this.IlIIIIlIIl = rnd;
      this.llIIIIlIIl = IlIlllIlllIlllIl.liiiIIllIl(name);
      this.liIIIIlIIl = new iliilIIlIiiilIIl(uuid);
   }

   public iliilIIlIiiilIIl iliIiiliiiii() {
      return this.liIIIIlIIl;
   }

   public IiIIIlliIIIl IilliliilIIi() {
      return this.ilIIIIlIIl;
   }

   public void Ililllililil(ililllilIiilllil r) {
      if (r != null) {
         this.ilIIIIlIIl.Iiilliiliiil(r.IlIlllIlilIl());
         this.IiIIIIlIIl.IiIiliIiiiIi(r.IiIlliIliiIl());
         LinkedHashMap var2 = new LinkedHashMap();
         if (r.IIlllIlliIll() != null) {
            for (Entry var4 : r.IIlllIlliIll().entrySet()) {
               if (var4.getValue() != null) {
                  LinkedHashMap var5 = new LinkedHashMap();

                  for (Entry var7 : ((Map)var4.getValue()).entrySet()) {
                     double[] var8 = (double[])var7.getValue();
                     if (var8 != null && var8.length >= 2) {
                        var5.put((String)var7.getKey(), new IillIIillillIIil(var8[0], var8[1]));
                     }
                  }

                  var2.put((String)var4.getKey(), var5);
               }
            }
         }

         this.liIIIIlIIl.IiIlliIliiIl(var2);
         this.iiIIIIlIIl.iIlIlllllill(lillililiillilil.liiiIIllIl(r.Illlllllilll()));
         this.IIlIIIlIIl = (int)Math.min(1000000L, (long)this.IIlIIIlIIl + (long)lillililiillilil.iliIiiliiiii(r.IIIllIIliIIl()));
         this.lIlIIIlIIl = true;
      }
   }

   public boolean Illlllllilll() {
      return this.iIlIIIlIIl;
   }

   public ililllilIiilllil IIillIiliIil(long nowMs) {
      this.iIlIIIlIIl = false;
      LinkedHashMap var3 = new LinkedHashMap();

      for (Entry var5 : this.liIIIIlIIl.IlIlllIlilIl().entrySet()) {
         LinkedHashMap var6 = new LinkedHashMap();

         for (Entry var8 : ((Map)var5.getValue()).entrySet()) {
            var6.put((String)var8.getKey(), new double[]{((IillIIillillIIil)var8.getValue()).IliIlllilIi(), ((IillIIillillIIil)var8.getValue()).liiiIIllIl()});
         }

         var3.put((String)var5.getKey(), var6);
      }

      return new ililllilIiilllil(
         1,
         this.iIIIIIlIIl.toLowerCase(Locale.ROOT),
         this.IlIIIIlIIl == null ? "" : this.IlIIIIlIIl.toString(),
         Math.max(0L, nowMs),
         this.IIlIIIlIIl,
         this.ilIIIIlIIl.Ililllililil(),
         this.IiIIIIlIIl.IlIillIiilIi(),
         var3,
         this.iiIIIIlIIl.IliIlllilIi()
      );
   }

   public void Iilllilliill() {
      this.iIlIIIlIIl = true;
   }

   public int IlIlllIlilIl() {
      return this.IIlIIIlIIl;
   }

   public UUID liiiIIllIl() {
      return this.IlIIIIlIIl;
   }
}
