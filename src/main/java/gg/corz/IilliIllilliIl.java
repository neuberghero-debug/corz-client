package gg.corz;

import com.google.gson.JsonElement;

public abstract class IilliIllilliIl {
   private boolean llIlllillilIlllill;
   private boolean iIIlllillIlIlllill;
   private final String iliIllillIiiIllill;
   private final String liiIllilliiiIllill;
   private String IIIlllilllIIlllill = null;

   public String IliIlllilIi() {
      return this.iliIllillIiiIllill;
   }

   public JsonElement IIlllIlliIll() {
      return null;
   }

   public abstract iIiIiIIlIliIiIIl IiIlliIliiIl();

   public String IilliliilIIi() {
      return this.IIIlllilllIIlllill;
   }

   public IilliIllilliIl lIiiIiIlilli() {
      this.iIIlllillIlIlllill = true;
      return this;
   }

   public String liiiIIllIl() {
      return this.liiIllilliiiIllill;
   }

   public IilliIllilliIl iIlIlllllill(String group) {
      this.IIIlllilllIIlllill = group;
      return this;
   }

   public boolean iliIiiliiiii() {
      return this.iIIlllillIlIlllill;
   }

   public IilliIllilliIl(String name, String description) {
      this.iIIlllillIlIlllill = false;
      this.llIlllillilIlllill = false;
      this.iliIllillIiiIllill = name;
      this.liiIllilliiiIllill = description;
   }

   public boolean IlIlllIlilIl() {
      return this.llIlllillilIlllill;
   }

   public IilliIllilliIl IIIllIIliIIl() {
      this.iIIlllillIlIlllill = true;
      this.llIlllillilIlllill = true;
      return this;
   }

   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      return iiiiIlllIIIIllll.IIilllIill;
   }
}
