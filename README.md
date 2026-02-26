# AI Assistant Project

## 项目介绍

AI Assistant Project 是一个基于 Spring Boot 和 Spring AI 构建的智能助手应用，集成了多种 AI 模型和功能，包括智能聊天、PDF 文档处理、课程管理、智能客服等。该项目由 **jiashaoyun** 开发，旨在提供一个灵活、可扩展的 AI 应用框架，方便开发者快速构建和部署 AI 相关应用。

## 技术栈

- **后端框架**: Spring Boot 2.7.18
- **AI 集成**: Spring AI 0.7.0
  - Ollama 本地模型集成
  - OpenAI 模型集成
- **数据库**: MySQL 8.0.33
- **ORM 框架**: MyBatis Plus
- **构建工具**: Maven

## 功能特性

1. **智能聊天功能**
   - 支持多种 AI 模型切换
   - 聊天历史记录管理
   - 多轮对话上下文保持

2. **PDF 文档处理**
   - PDF 文档上传与解析
   - 基于 PDF 内容的智能问答
   - 文档内容检索

3. **课程管理系统**
   - 课程信息管理
   - 课程预约功能
   - 校区管理

4. **智能客服系统**
   - 基于 AI 的自动客服响应
   - 课程咨询与预约
   - 个性化服务

5. **AI 游戏互动**
   - 基于 AI 的游戏对话
   - 角色扮演游戏
   - 情感交互体验

## 快速开始

### 环境要求

- JDK 8 或更高版本
- Maven 3.6.1 或更高版本
- MySQL 8.0 或更高版本
- Ollama (可选，用于本地 AI 模型)

### 安装和运行

1. **克隆项目**

   ```bash
   git clone <repository-url>
   cd ai-assistant-project
   ```

2. **配置数据库**

   创建名为 `ai_assistant` 的数据库，然后运行项目（Spring Boot 会自动创建表结构）。

3. **配置环境变量**

   复制 `.env.example` 文件为 `.env`，并填写相应的环境变量：

   ```bash
   cp .env.example .env
   # 编辑 .env 文件，填写 OPENAI_API_KEY 等环境变量
   ```

4. **构建项目**

   ```bash
   mvn clean install
   ```

5. **运行项目**

   ```bash
   mvn spring-boot:run
   ```

   或使用构建产物运行：

   ```bash
   java -jar target/ai-assistant-project-0.0.1-SNAPSHOT.jar
   ```

## 配置说明

项目配置文件位于 `src/main/resources/application.yaml`，支持以下配置项：

### 基本配置

- `spring.application.name`: 项目名称
- `server.port`: 服务器端口
- `server.servlet.context-path`: 应用上下文路径

### AI 配置

- `spring.ai.ollama.base-url`: Ollama 服务地址
- `spring.ai.ollama.chat.model`: Ollama 聊天模型
- `spring.ai.openai.base-url`: OpenAI API 地址
- `spring.ai.openai.api-key`: OpenAI API 密钥
- `spring.ai.openai.chat.options.model`: OpenAI 聊天模型

### 数据库配置

- `spring.datasource.url`: 数据库连接 URL
- `spring.datasource.username`: 数据库用户名
- `spring.datasource.password`: 数据库密码

### 日志配置

- `logging.level.org.springframework.ai`: Spring AI 日志级别
- `logging.level.com.myai.project`: 应用日志级别

## API 文档

### 聊天接口

- `POST /ai/chat`: AI 聊天接口
- `GET /ai/chat/history`: 获取聊天历史

### PDF 接口

- `POST /ai/pdf/upload`: 上传 PDF 文件
- `GET /ai/pdf/chat`: 基于 PDF 内容的聊天

### 课程接口

- `GET /api/courses`: 获取课程列表
- `POST /api/courses/reserve`: 预约课程

### 客服接口

- `POST /ai/customer-service`: 智能客服接口

### 游戏接口

- `POST /ai/game`: 游戏聊天接口

## 项目结构

```
ai-assistant-project/
├── src/
│   ├── main/
│   │   ├── java/com/myai/project/
│   │   │   ├── config/         # 配置类
│   │   │   ├── controller/      # 控制器
│   │   │   ├── entity/          # 实体类
│   │   │   ├── mapper/          # Mapper 接口
│   │   │   ├── model/           # 模型类
│   │   │   ├── repository/      # 仓库类
│   │   │   ├── service/         # 服务类
│   │   │   ├── tools/           # 工具类
│   │   │   ├── utils/           # 工具方法
│   │   │   └── MyAiApplication.java  # 应用入口
│   │   └── resources/
│   │       ├── mapper/          # MyBatis XML 映射文件
│   │       └── application.yaml # 配置文件
│   └── test/                    # 测试代码
├── .gitignore                   # Git 忽略文件
├── pom.xml                      # Maven 配置文件
└── README.md                    # 项目说明文档
```

## 作者

 **jiashaoyun** 

## 贡献

欢迎提交 Issue 和 Pull Request 来改进这个项目！

## 许可证

本项目采用 MIT 许可证 - 详情请参阅 LICENSE 文件
